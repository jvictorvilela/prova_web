<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Faça seu login:</h1>
        <form action="/prova_web/Controller?command=Login" method="post">
            <label> Matricula:<input type="text" name="login"></label></br>
            <label> Senha:<input type="text" name="senha"></label></br>
            <input type="submit" value="entrar">
        </form>
    </body>
</html>