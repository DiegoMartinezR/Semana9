<%-- 
    Document   : index
    Created on : 15-oct-2018, 8:22:49
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PATRON MCV Y DAO</title>
    </head>
    <body>
        <h1>PATRON MCV Y DAO - Busqueda de Cliente</h1>
        <form action="SMuestraCliente">
            <table>
                <tr>
                    <td>
                        ID
                    </td>
                    <td>
                        <input type="text" name="id" value="">
                    </td>
                     <td>
                         <input type="submit" value="Buscar">
                    </td>
                </tr>
                
                
            </table>
            <a href="registrar.html">Nuevo cliente</a>
            
            
        </form>
        
        
    </body>
</html>
