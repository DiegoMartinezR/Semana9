/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ClienteBean;


public class SMuestraCliente extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  
        String id = request.getParameter("id");
        ClienteBean cliente = ClienteBean.getCliente(id);
        String pagina;
        if(cliente==null){
            pagina = "/vista/Cliente_desconocido.jsp";
        }else{
            pagina = "/vista/Informacion_cliente.jsp";
            request.setAttribute("infoCliente", cliente);
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
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
    }


}
