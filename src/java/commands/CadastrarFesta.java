package commands;
 
import DAO.FestaDAO;
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pkg.Festa;
 
public class CadastrarFesta implements Command {
 
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            FestaDAO festaDAO = new FestaDAO();
            String data = request.getParameter("data");
            String horaInicio = request.getParameter("hora");
            String titulo = request.getParameter("titulo");
            
            festaDAO.adicionarFesta(data, horaInicio, titulo);
            
            RequestDispatcher d = request.getRequestDispatcher("/telaAdmin.jsp");
            d.forward(request,response);
 
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
     
}