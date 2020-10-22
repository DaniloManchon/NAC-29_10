package dao;

import conexao.ConexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultadoDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public int totalMasculino() throws SQLException {
        int masculino = 0;
        final String sql="select count(genero) as Total_Masculino from java_usuario where genero='masc' and tipoDeUsuario='aluno'";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                masculino = rs.getInt("Total_Masculino");
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return masculino;
    }

    public int totalFeminino() throws SQLException {
        int feminino = 0;
        final String sql="select count(genero) as Total_Feminino from java_usuario where genero='fem' and tipoDeUsuario='aluno'";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                feminino = rs.getInt("Total_Feminino");
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return feminino;
    }

    public int totalAluno() throws SQLException {
        int aluno = 0;
        final String sql="select count(*) as Total_Alunos from java_usuario where tipoDeUsuario='aluno'";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                aluno = rs.getInt("Total_Alunos");
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return aluno;
    }

    public int totalEmpregados() throws SQLException {
        int empregados = 0;
        final String sql="select count(*) as Total_Empregados from java_pesquisa where estaEmpregado='sim'";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                empregados = rs.getInt("Total_Empregados");
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return empregados;

    }
}
