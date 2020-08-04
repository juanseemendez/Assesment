/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Mendez
 */
public class ConnectionDB {
    Connection connect=null;
    
    public Connection comunicate(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/database","root","");
            
            JOptionPane.showMessageDialog(null,"Successful Connection");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Wrong connection " + e.getMessage());
        }
        return connect;
    }
}
