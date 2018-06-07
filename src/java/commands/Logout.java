package commands;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pkg.Usuario;
import DAO.UsuarioDAO;
 
public class Logout implements Command {
 
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {   
            HttpSession session = request.getSession();
            session.removeAttribute("matricula");
            RequestDispatcher d = request.getRequestDispatcher("/index.jsp");
            d.forward(request,response);
 
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
     
}