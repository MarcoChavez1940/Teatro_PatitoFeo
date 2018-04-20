/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class SaleDAO {
    
    Conexion conexion = null;
    
    public SaleDAO(){
        conexion = new Conexion();
    }
    
    public void addSale(double money, String nameClient){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statament = accessBD.prepareStatement(""
                    + "INSERT INTO sales "
                    + "(idSale, money, nameClient, status) VALUES "
                    + "(NULL,"
                    + money
                    + ","
                    + "'"
                    + nameClient
                    + "'"
                    + ", 'Vendido');"
            );
            statament.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public String getNameClient(int idSale){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT nameClient FROM sales"
                    + " WHERE idSale = " + idSale);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getString(1);
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public double getMoneyPaid(int idSale){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT money FROM sales"
                    + " WHERE idSale = " + idSale);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getDouble(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public int getCountOfSale(){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT Max(idSale) FROM sales");
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
}
