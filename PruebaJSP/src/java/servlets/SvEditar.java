package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.persona;




@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id_editar = Integer.parseInt(request.getParameter("id_editar"));
        control.editarPersona(id_editar);
         
        response.sendRedirect("editarPersona.jsp");
        
      
    }
    
     @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
                
        int id_editar = Integer.parseInt(request.getParameter("id_editar"));
        control.editarPersona(id_editar);
        
       
         
        response.sendRedirect("editarPersona.jsp");
        
      
    }
    

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
