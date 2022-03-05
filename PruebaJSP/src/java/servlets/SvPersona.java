
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import logica.Controladora;
import logica.persona;


@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {

        Controladora control = new Controladora();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<persona> ListaPersona = control.traerPersonas();
        
        HttpSession miSesion = request.getSession ();
        miSesion.setAttribute("listaPersonas", ListaPersona);
        
        response.sendRedirect("verPersonas.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        persona per = new persona(0, dni, nombre, apellido, telefono);
        control.crearPersona(per);
        
        
       response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
