package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String caminho = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private final String login = "";
    private final String senha = "";
    private Connection conexao;

    public Connection conectar(){
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(caminho, login, senha);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}
