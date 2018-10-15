/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.ClienteServicios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.ClienteBean;

/**
 *
 * @author DIEGO
 */
public class SRegistroCliente extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("txtId");
        String nombre = request.getParameter("txtNombres");
        double saldo = Double.parseDouble(request.getParameter("txtSaldo"));
        
        ClienteBean usu = new ClienteBean(id,nombre,saldo);
        try{
            ClienteServicios srv = new ClienteServicios();
            srv.RegistrarCliente(usu);
            PrintWriter salida = response.getWriter();
            salida.println("Cliente registrado correctamente");
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
        
        
        
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
