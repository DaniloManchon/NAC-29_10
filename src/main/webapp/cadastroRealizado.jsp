<%--
Created by IntelliJ IDEA.
User: danilo
Date: 17/10/2020
Time: 17:57
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8" />
  <meta http-equiv="x-ua-compatible" content="ie-edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="./styles/flex.css">

  <title>Certinho</title>
</head>

<body>
  <div class="flex-container">
    <div class="Main">
      <div class="Header">
        <h1>Tudo certo! :)</h1>
        <hr>
      </div> <!-- Fim da div Header -->
      <div class="Stucture">
        <%
          session.invalidate();
        %>
        Seu cadastro foi concluido com sucesso!
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