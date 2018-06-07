<%@page import="DAO.UsuarioDAO"%>
<%@page import="pkg.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pkg.Festa"%>
<%@page import="DAO.FestaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de festas</title>
    </head>
    <body>
        <%
          FestaDAO festaDAO = new FestaDAO();  
          UsuarioDAO usuarioDAO = new UsuarioDAO();  
        %>
        <h2>Participantes</h2>
        <%
            for (Festa aux : festaDAO.getTodasFestas()) {
        %> 
                <p><%=aux.getData()%> (<%=aux.getHoraInicio()%>) <b><%=aux.getTitulo()%></b></p>
                <ul>
        <%
                for (int aux2 : aux.getParticipantes()) {
        %>
                    <li><%=usuarioDAO.getUsuarioPorMatricula(aux2).getNome()%></li>
        <%
                }
        %>
                </ul>
        <%
                    
            }
        %>
        
        <a href="/prova_web/Controller?command=Voltar">Voltar</a>
    </body>
</html>
