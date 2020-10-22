package dao;

import conexao.ConexaoDB;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public Usuario logar(int matricula, String senha) {
        Usuario usuario = null;
        final String sql = "select * from java_usuario where matricula=? and senha=?";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, matricula);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            if(rs.next()){
                usuario= new Usuario(matricula,rs.getString("nome"), senha, rs.getString("tipoDeUsuario"), rs.getString("genero"));
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }
    public boolean cadastrar(Usuario usuario) throws SQLException {
        boolean sucesso = false;
        final String sql = "insert into java_usuario(matricula, nome, senha, tipoDeUsuario, genero) values(?,?,?,?,?)";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario.getMatricula());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getTipoDeUsuario());
            ps.setString(5, usuario.getGenero());
            ps.execute();
            System.out.println("usuario cadastrado");
            sucesso = true;
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return sucesso;
    }
}
