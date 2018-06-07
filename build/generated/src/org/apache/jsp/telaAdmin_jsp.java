package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import pkg.Festa;
import DAO.FestaDAO;

public final class telaAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistema de festas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

          FestaDAO festaDAO = new FestaDAO();  
        
      out.write("\n");
      out.write("        <h1>Empresa XPTO</h1>\n");
      out.write("        <h2>Minhas festas</h2>\n");
      out.write("        <h2>Venha festejar</h2>\n");
      out.write("        \n");
      out.write("        <form action=\"/prova_web/Controller?command=ConfirmarParticipacao\" method=\"post\">\n");
      out.write("        ");

            for (Festa aux : festaDAO.getTodasFestas()) {
                if (!aux.usuarioParticipara(Integer.parseInt(session.getAttribute("matricula").toString()))) {     
        
      out.write(" \n");
      out.write("                    <label><input type=\"checkbox\" name=\"");
      out.print(aux.getTitulo());
      out.write("\" value=\"checked\">");
      out.print(aux.getTitulo());
      out.write("</label>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Confirmar participação\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h2>Cadastrar Novas Festas</h2>\n");
      out.write("        <form action=\"/prova_web/Controller?command=CadastrarFesta\" method=\"post\">\n");
      out.write("            <label> Data: <input type=\"date\" name=\"data\"></label></br>\n");
      out.write("            <label> Hora de início: <input type=\"time\" name=\"hora\"></label></br>\n");
      out.write("            <label> Título da festa: <input type=\"text\" name=\"titulo\"></label></br>\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar Festa\">\n");
      out.write("        </form>\n");
      out.write("        <a href=\"#\">Visualizar participantes</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
