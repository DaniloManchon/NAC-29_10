<%--
Created by IntelliJ IDEA.
User: danil
Date: 17/10/2020
Time: 17:56
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
    <h1>Uh Oh! :(</h1>
    <hr>
    <h2>Parece que esse cadastro já respondeu essa pesquisa uma vez!</h2>
    <h2>Obrigado por responder!</h2>
    <div>
      <a href="index.html">Voltar</a>
    </div>
  </body>
</html>
