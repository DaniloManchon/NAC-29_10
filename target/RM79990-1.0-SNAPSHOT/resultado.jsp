<%@ page import="dao.ResultadoDAO" %>
<%--
Created by IntelliJ IDEA.
User: danil
Date: 17/10/2020
Time: 11:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8" />
  <meta http-equiv="x-ua-compatible" content="ie-edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="./styles/flex.css">

  <title>Formulário de Resultado</title>
</head>

<body>
  <div class="flex-container">
    <div class="Main">
      <div class="Header">
        <h1>Resultado da pesquisa</h1>
        <hr>
      </div> <!-- Fim da div Header -->
      <div class="Stucture">
        <%
        ResultadoDAO dao = new ResultadoDAO();
        int homens = dao.totalMasculino();
        int mulheres = dao.totalFeminino();
        int alunos = dao.totalAluno();
        int empregados = dao.totalEmpregados();
        out.print("<h3 id="dao">Total de homens --> " + "</h3>");
        out.print("<h3 id="dao">Total de mulheres --> " + "</h3>");
        out.print("<h3 id="dao">Total de alunos --> " + "</h3>");
        out.print("<h3 id="dao">Total de empregados --> " + "</h3>");

        session.invalidate();
        %>
        <div class="goBack">
          <br />
          <a id="link" href="index.html">Voltar</a>
        </div> <!-- Fim da div goBack -->
        </form>
      </div> <!-- Fim da div Structure -->
    </div> <!-- Fim da div Main -->
  </div> <!-- Fim da div Flex-Container -->
</body>

</html>