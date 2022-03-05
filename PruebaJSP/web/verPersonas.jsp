<%@page import= "java.util.List" %>
<%@page import= "logica.persona" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Personas</title>
    </head>
   
        <h1>Lista de Personas</h1>
        
        <%
        
        List <persona> ListaPersonas = (List) request.getSession().getAttribute("listaPersonas");
        
        for (persona per : ListaPersonas) {
        
        %>
        
        <p> <b>DNI: </b> <%=per.getDni()%> </p> 
        <p> <b>Nombre: </b> <%=per.getNombre()%> </p> 
        <p> <b>Apellido: </b> <%=per.getApellido()%> </p> 
        <p> <b>Telefono: </b> <%=per.getTelefono()%> </p> 
        <p>.........................................</p>
        
        <% 
            }
        %>
   
</html>
