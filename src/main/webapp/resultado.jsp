<%@ page import="dao.ResultadoDAO" %>
<%--
Created by IntelliJ IDEA.
User: danil
Date: 17/10/2020
Time: 11:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Formulário Resultado</title>
  </head>
  <body>
    <h1>Resultado da Pesquisa</h1>
    <hr>
    <%
    ResultadoDAO dao = new ResultadoDAO();
    int homens = dao.totalMasculino();
    int mulheres = dao.totalFeminino();
    int alunos = dao.totalAluno();
    int empregados = dao.totalEmpregados();
    out.print("<h3>Total de homens     ------> " + homens + "</h3>");
    out.print("<h3>Total de mulheres   ------> " + mulheres + "</h3>");
    out.print("<h3>Total de alunos     ------> " + alunos + "</h3>");
    out.print("<h3>Total de empregados ------> " + empregados + "</h3>");

    session.invalidate();
    %>
    <a href="index.html">Voltar</a>
  </body>
</html>
