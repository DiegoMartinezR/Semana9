<%-- 
    Document   : Informacion_cliente
    Created on : 15-oct-2018, 8:37:44
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información Cliente</title>
    </head>
    <body>
        <jsp:useBean id="infoCliente" type="modelo.ClienteBean" scope="request"/>
            <h1>Información de cliente</h1>
            <ul>
                <li>ID: <jsp:getProperty name="infoCliente" property="id" /></li>
                <li> Nombrs: <jsp:getProperty name="infoCliente" property="saldo" /></li>
            </ul>
            <a href="inicio.html">Otra Consulta</a>
    </body>
</html>
