<%--
Created by IntelliJ IDEA.
User: danil
Date: 17/10/2020
Time: 17:55
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ERROR</title>
  </head>
  <body>
    <%
    session.invalidate();
    %>
    <h1>OOPS!</h1>
    <hr>
    <h2>Parece que não encontramos seu cadastro!</h2>
    <br>
    <div>
      <a href="cadastro.html">Cadastrar</a>
    </div>
    <div>
      <a href="index.html">Voltar</a>
    </div>
  </body>
</html>
