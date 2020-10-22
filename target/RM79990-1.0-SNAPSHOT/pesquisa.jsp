<%--
  Created by IntelliJ IDEA.
  User: danil
  Date: 16/10/2020
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulário Pesquisa</title>
</head>
<body>
<h1>Pesquisa</h1>
<hr>
<form action="pesquisa" method="POST">
    <div>
        <h3>Está empregado?</h3>
        <input type="radio" id="sim" name="empregado" value="sim" checked>
        <label for="sim">Sim</label>
        <br>
        <input type="radio" id="nao" name="empregado" value="nao">
        <label for="nao">Não</label>
        <br>
        <h3>Está satisfeito com o salário?</h3>
        <input type="radio" id="sim" name="salario" value="sim">
        <label for="sim">Sim</label>
        <br>
        <input type="radio" id="nao" name="salario" value="nao">
        <label for="nao">Não</label>
        <br>
        <br>
        <input type="submit" name= "botao" value="Enviar">
    </div>
    <div>
        <a href="index.html">Voltar</a>
    </div>
</form>
</body>
</html>
