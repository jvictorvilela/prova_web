package commands;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Voltar implements Command {
 
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            
            RequestDispatcher d = request.getRequestDispatcher("/telaAdmin.jsp");
            d.forward(request,response);
 
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
     
}