package dao;

import conexao.ConexaoDB;
import model.Pesquisa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisaDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public Pesquisa checarPesquisa(int matricula) {
        Pesquisa pesquisa = null;
        final String sql = "select * from java_pesquisa where matricula=?";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, matricula);
            rs = ps.executeQuery();
            if(rs.next()){
                pesquisa= new Pesquisa(matricula,rs.getString("estaEmpregado"), rs.getString("estaSatisfeito"));
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pesquisa;
    }
    public void cadastrarPesquisa(Pesquisa pesquisa) {
        final String sql = "insert into java_pesquisa(matricula, estaEmpregado, estaSatisfeito) values(?,?,?)";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, pesquisa.getMatricula());
            ps.setString(2, pesquisa.getEstaEmpregado());
            ps.setString(3, pesquisa.getEstaSatisfeito());
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
