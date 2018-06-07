package commands;
 
import DAO.FestaDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pkg.Festa;
 
public class ConfirmarParticipacao implements Command {
 
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            FestaDAO festaDAO = new FestaDAO();
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            
            for (Festa aux : festaDAO.getTodasFestas()) {
                if ("checked".equals(request.getParameter(aux.getTitulo()))) {
                    aux.addParticipante(Integer.parseInt(session.getAttribute("matricula").toString()));
                }
            }
            if (usuarioDAO.getUsuarioPorMatricula(Integer.parseInt(session.getAttribute("matricula").toString())).getNivel() == 10) {
                RequestDispatcher d = request.getRequestDispatcher("/telaAdmin.jsp");
                d.forward(request,response);
            } else {
                RequestDispatcher d = request.getRequestDispatcher("/telaUsuario.jsp");
                d.forward(request,response);
            }  

 
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
     
}