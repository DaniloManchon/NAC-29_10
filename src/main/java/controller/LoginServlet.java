package controller;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value="/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String botao = request.getParameter("botao");
        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");
        RequestDispatcher dispatcher;

        if(botao.equalsIgnoreCase("Logar")){    //se usuario clicar no botao logar
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = dao.logar(Integer.parseInt(matricula),senha);

            if(usuario != null){//deu bom no login

               if(usuario.getTipoDeUsuario().equalsIgnoreCase("aluno")){ //usuario é um aluno
                   HttpSession session = request.getSession(true);
                   session.setAttribute("matricula", matricula);
                   dispatcher = request.getRequestDispatcher("pesquisa.html");
                   //TODO verificar ordem dos processos
               }else { //usuario é um professor
                   dispatcher = request.getRequestDispatcher("resultado.jsp");
               }

            }else{
                //deu ruim no login, quer cadastrar ou sair?
                dispatcher = request.getRequestDispatcher("loginInvalido.jsp");
            }

        }else { //se usuario clicar no botao criar-conta
            dispatcher = request.getRequestDispatcher("cadastro.html");
        }
        dispatcher.forward(request,response);
    }
}
