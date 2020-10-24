<%--
Created by IntelliJ IDEA.
User: danil
Date: 17/10/2020
Time: 15:25
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Obrigado</title>
  </head>
  <body>
    <%
    session.invalidate();
    %>
    <h1>Pesquisa respondida! :)</h1>
    <hr>
    <h2>Obrigado!</h2>
    <h2>A pesquisa foi devidamente respondida e suas respostas foram salvas no sistema!</h2>
    <div>
      <a href="index.html">Voltar</a>
    </div>
  </body>
</html>
