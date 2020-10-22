<%--
  Created by IntelliJ IDEA.
  User: danil
  Date: 17/10/2020
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<%
    session.invalidate();
%>
<h1>Cadastro existente!</h1>
<hr>
<h2>Ops! Parece que seu cadastro já foi realizado anteriormente! :)</h2>
<br>
<div>
    <a href="index.html">Voltar</a>
</div>
</body>
</html>