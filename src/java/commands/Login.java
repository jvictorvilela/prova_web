package commands;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pkg.Usuario;
import DAO.UsuarioDAO;
 
public class Login implements Command {
 
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            UsuarioDAO usuario = new UsuarioDAO();
            
            Usuario usr = usuario.autenticar(login, senha);
            
            if (usr != null) {
                HttpSession session = request.getSession();
                session.setAttribute("matricula", usr.getMatricula());
                if (usr.getNivel() == 1) {
                    RequestDispatcher d = request.getRequestDispatcher("/telaUsuario.jsp");
                    d.forward(request,response);
                } else {
                    RequestDispatcher d = request.getRequestDispatcher("/telaAdmin.jsp");
                    d.forward(request,response);
                }
            }
            RequestDispatcher d = request.getRequestDispatcher("/telaAdmin.jsp");
            d.forward(request,response);
 
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
     
}