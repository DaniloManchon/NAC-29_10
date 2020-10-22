package controller;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CadastroServlet", value="/cadastro")
public class CadastroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String matricula = request.getParameter("matricula");
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        String tipoDeUsuario = request.getParameter("role");
        String genero = request.getParameter("genero");

        UsuarioDAO dao = new UsuarioDAO();

        if (dao.logar(Integer.parseInt(matricula), senha) == null) {
            Usuario usuario = new Usuario(Integer.parseInt(matricula), nome, senha, tipoDeUsuario, genero);
            try {
                dao.cadastrar(usuario);
                dispatcher = request.getRequestDispatcher("cadastroRealizado.jsp");
                dispatcher.forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dispatcher = request.getRequestDispatcher("cadastroExistente.jsp");
            dispatcher.forward(request, response);
        }
    }
}
