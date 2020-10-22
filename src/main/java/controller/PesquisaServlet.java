package controller;

import dao.PesquisaDAO;
import model.Pesquisa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "PesquisaServlet", value="/pesquisa")
public class PesquisaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        HttpSession session = request.getSession(true);
        String matricula = (String) session.getAttribute("matricula");
        String estaEmpregado = request.getParameter("empregado");
        String estaSatisfeito = request.getParameter("salario");

        PesquisaDAO dao = new PesquisaDAO();

        if(dao.checarPesquisa(Integer.parseInt(matricula)) != null){
            dispatcher = request.getRequestDispatcher("pesquisaDuplicada.jsp");

        }else{
            Pesquisa pesquisa = new Pesquisa(Integer.parseInt(matricula), estaEmpregado,estaSatisfeito);
            dao.cadastrarPesquisa(pesquisa);
            dispatcher = request.getRequestDispatcher("pesquisaRespondida.jsp");
        }
        dispatcher.forward(request,response);
        session.invalidate();
    }
}

