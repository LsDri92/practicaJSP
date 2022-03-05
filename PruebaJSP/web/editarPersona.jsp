<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Persona</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="SvEditar" method="PUT">
            <p> <label>DNI: </label> <input type="text" name="dni"> </p>
            <p> <label>Nombre: </label> <input type="text" name="nombre"> </p>
            <p> <label>Apellido:</label> <input type="text" name="apellido"> </p>
            <p> <label>Teléfono:</label> <input type="text" name="telefono"> </p>
            <button type="submit"> Enviar </button>
        </form>
    </body>
</html>
