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
        %>
        <h1>Empresa XPTO</h1>
        <h2>Minhas festas</h2>
        <%
            for (Festa aux : festaDAO.getTodasFestas()) {
                if (aux.usuarioParticipara(Integer.parseInt(session.getAttribute("matricula").toString()))) {     
        %> 
                    <p><%=aux.getData()%> (<%=aux.getHoraInicio()%>) <b><%=aux.getTitulo()%></b></p>
        <%
                }
            }
        %>
        <h2>Venha festejar</h2>
        
        <form action="/prova_web/Controller?command=ConfirmarParticipacao" method="post">
        <%
            for (Festa aux : festaDAO.getTodasFestas()) {
                if (!aux.usuarioParticipara(Integer.parseInt(session.getAttribute("matricula").toString()))) {     
        %> 
        <label><input type="checkbox" name="<%=aux.getTitulo()%>" value="checked"><%=aux.getData()%> (<%=aux.getHoraInicio()%>) <b><%=aux.getTitulo()%></b></label></br>
        <%
                }
            }
        %>
        </br>
        <input type="submit" value="Confirmar participação">
        </form>
        </br>
        <a href="/prova_web/Controller?command=Logout">Sair</a>
    </body>
</html>
