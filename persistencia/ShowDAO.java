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
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import model.Show;

/**
 *
 * @author marco
 */
public class ShowDAO {
    Conexion conexion = null;
    
    public ShowDAO(){
        conexion = new Conexion();
    }
    
    public ArrayList<Show> getAllShows(){
        ArrayList<Show> shows = new ArrayList();
        Show show;
        
        try {
            Connection accessBD = conexion.getConexion();
            Statement statement = accessBD.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from shows");
            
            while(resultSet.next()){
                show = new Show();
                show.setIdShow(resultSet.getInt(1));
                show.setName(resultSet.getString(2));
                show.setDescription(resultSet.getString(3));
                show.setDuration(resultSet.getTime(4));
                show.setPrice(resultSet.getInt(5));
                show.setStatus(resultSet.getString(6));
                show.setActors(resultSet.getString(7));
                show.setPublicity(resultSet.getString(8));
                show.setResponsiblePersonalPhone(resultSet.getString(9));
                show.setResponsibleAlternatePhone(resultSet.getString(10));
                show.setResponsibleEmail(resultSet.getString(11));
                shows.add(show);
            }
        } catch (Exception e) {
        }
        
        return shows;
    }
    
    public Show getShowById(int id_show){       
        Show show = new Show();
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statament = accessBD.prepareStatement("select * from shows"
                    + " where idShow=" + id_show);
            ResultSet resultSet = statament.executeQuery();
                        
            while(resultSet.next()){ 
                show.setIdShow(resultSet.getInt(1));
                show.setName(resultSet.getString(2));
                show.setDescription(resultSet.getString(3));
                show.setDuration(resultSet.getTime(4));
                show.setPrice(resultSet.getInt(5));
                show.setStatus(resultSet.getString(6));
                show.setActors(resultSet.getString(7));
                show.setPublicity(resultSet.getString(8));
                show.setResponsiblePersonalPhone(resultSet.getString(9));
                show.setResponsibleAlternatePhone(resultSet.getString(10));
                show.setResponsibleEmail(resultSet.getString(11));
            }                     
            
        } catch (Exception e) {
        }
        
        return show;
    }
    
    public int getIdShowByName(String nameShow){
               
        int idShow = 0;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statament = accessBD.prepareStatement("select idShow from shows"
                    + " where name=" + "'" + nameShow + "'");
            ResultSet resultSet = statament.executeQuery();
                        
            while(resultSet.next()){ 
                idShow = resultSet.getInt(1);
            }                     
            
        } catch (Exception e) {
        }
        
        return idShow;
    }
    
    public void addShow(String name, String description, Time duration, int price, String actors, String publicity,
                        String responsiblePersonalPhone, String responsibleAlternatePhone,
                        String responsibleEmail){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement("INSERT INTO shows"
                    + "(name,description,duration,price,status,actors,publicity,responsiblePersonalPhone"
                    + ",responsibleAlternatePhone,responsibleEmail)VALUES(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, description);
            preparedStatement.setTime(3, duration);
            preparedStatement.setInt(4, price);
            preparedStatement.setString(5, "Disponible");
            preparedStatement.setString(6, actors);
            preparedStatement.setString(7, publicity);
            preparedStatement.setString(8, responsiblePersonalPhone);
            preparedStatement.setString(9, responsibleAlternatePhone);
            preparedStatement.setString(10, responsibleEmail);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public void cancelShow(int idShow){
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement("UPDATE shows "
                    + "SET status = ? WHERE idShow = ?");
            preparedStatement.setString(1, "Cancelado");
            preparedStatement.setInt(2, idShow);
            preparedStatement .executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public int getPriceShow(int idShow){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("select price from shows "
                    + "WHERE idShow = " + idShow);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (Exception e) {
        }
        
        return 0;
    }
    
    public String getShowName(int idShow){
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT name FROM shows WHERE idShow = " + idShow);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getString(1);
            }
        } catch (Exception e) {
        }
        
        return null;

    }
}
