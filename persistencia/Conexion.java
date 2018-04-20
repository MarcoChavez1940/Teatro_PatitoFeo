/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Conexion {
    
public java.sql.Connection getConexion(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/PatitoFeo", "root", "");
        }catch(SQLException ex){
        }catch(Exception e){
        }
        return conexion;
    }   
}
