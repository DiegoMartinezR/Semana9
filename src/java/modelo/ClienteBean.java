/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import DAO.ClienteEntity;
import DAO.ClienteServicios;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class ClienteBean {
    private String id;
    private String nombres;
    private double saldo;

    
    
    public ClienteBean(String id, String nombres, double saldo) {
        this.setId(id);
        this.setNombres(nombres);
        this.setSaldo(saldo);
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static ClienteBean getCliente(String id){
        ClienteEntity aux = new ClienteEntity();// Primero sirve para llamar a los metodos de la clase Clienteentity
        ClienteEntity cli = new ClienteEntity();// Recibir los datos que obtengo del metodo consultacliente
        aux.setId(id);
        try{
            ClienteServicios servicios = new ClienteServicios();
            cli = servicios.consultaCliente(aux);
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, "Error en la busqueda");
        }
        
        ClienteBean cb;
        if(cli!=null){
            cb = new ClienteBean(
                cli.getId(), cli.getNombres(), cli.getSaldo());
            }else{
            cb = null;
                
        }
        return cb;
        
    }
    
    
}
