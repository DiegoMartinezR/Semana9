
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.ClienteBean;


public class ClienteServicios {
    
    Connection cn;
    public ClienteServicios()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        cn= DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    }
    
    public ClienteEntity consultaCliente(ClienteEntity cliente) throws  Exception{
        ClienteEntity cli= null;
        PreparedStatement pst=cn.prepareStatement("select id,nombres,saldo from cliente where id = ?");
        
        pst.setString(1, cliente.getId());
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            cli = new ClienteEntity();
            cli.setId(rs.getString("id"));
            cli.setNombres(rs.getString("nombres"));
            cli.setSaldo(rs.getDouble("saldo"));
        }
        return cli;
    }
    
    public void RegistrarCliente(ClienteBean cliente) throws Exception{
        String sq1 = "insert into cliente(id,nombres,saldo) values(?,?,?)";
        PreparedStatement pst = cn.prepareStatement(sq1);
        pst.setString(1, cliente.getId());
        pst.setString(2, cliente.getNombres());
        pst.setDouble(3, cliente.getSaldo());
        pst.executeUpdate();
        
        
    }
    
    
}

