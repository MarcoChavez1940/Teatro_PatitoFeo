/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import model.Function;

/**
 *
 * @author marco
 */
public class FunctionDAO {
    
    Conexion conexion = null;
    
    public FunctionDAO(){
        conexion = new Conexion();
    }
    
    public ArrayList<Function> getFunctions(){
        ArrayList<Function> functions = new ArrayList();
        Function function;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("select * from functions");
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                function = new Function();
                function.setIdFunction(resultSet.getInt(1));
                function.setDate(resultSet.getDate(2));
                function.setStartTime(resultSet.getTime(3));
                function.setEndingTime(resultSet.getTime(4));
                function.setIdShow(resultSet.getInt(5));
                function.setStatus(resultSet.getString(6));
                function.setModified(resultSet.getString(7));
                functions.add(function);
            }
        } catch (Exception e) {
        }
        
        return functions;
    }
    
    public void addFuntion(Date date, Time startTime, Time endingTime, int idShow, String status){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statament = accessBD.prepareStatement("INSERT INTO functions"
                    + "(date, startTime, endingTime, idShow, status, modified)VALUES(?,?,?,?,?,?)");
            statament.setDate(1, date);
            statament.setTime(2, startTime);
            statament.setTime(3, endingTime);
            statament.setInt(4, idShow);
            statament.setString(5, status);
            statament.setString(6, "No");
            statament.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public ArrayList<Function> getBusySchedules(String date, String startTime, String endingTime){
        ArrayList<Function> functions = new ArrayList();
        Function function;
        
        /*
        SELECT * FROM functions where (CAST("08:45:00" As Time) >= startTime AND CAST("08:45:00" AS Time) <= endingTime)
        OR (CAST("09:30:00" As Time) >= startTime AND CAST("09:30:00" AS Time) <= endingTime) 
        OR (CAST("08:45:00" AS Time) >= endingTime AND CAST("08:45:00" As Time) <= addtime(endingTime, '00:30:00'))
        OR (CAST("09:30:00" AS Time) >= timediff(startTime, "00:30:00") AND CAST("09:30:00" AS Time) <= startTime)
        */
        
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement ps = accessBD.prepareStatement("select * from functions where"
                    + " date=" + date + " AND ("
                    + " (CAST(" + startTime + " As Time) >= startTime AND CAST(" + startTime + " AS Time) <= endingTime)"
                    + " OR (CAST(" + endingTime + " As Time) >= startTime AND CAST(" + endingTime + " AS Time) <= endingTime)"
                    + " OR (CAST(" + startTime + " AS Time) >= endingTime AND CAST(" + startTime + " As Time) <= addtime(endingTime, '00:30:00'))"
                    + " OR (CAST(" + endingTime + " AS Time) >= timediff(startTime, '00:30:00') AND CAST(" + endingTime + " AS Time) <= startTime)"
                    + ")");
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                function = new Function();
                function.setIdFunction(resultSet.getInt(1));
                function.setDate(resultSet.getDate(2));
                function.setStartTime(resultSet.getTime(3));
                function.setEndingTime(resultSet.getTime(4));
                function.setIdShow(resultSet.getInt(5));
                function.setStatus(resultSet.getString(6));
                function.setModified(resultSet.getString(7));
                functions.add(function);
            }
        } catch (Exception e) {
        }
        
        return functions;
    }
    
    public void updateStatusCancelFunction(int idShow){
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement("UPDATE functions "
                    + "SET status = ? WHERE idShow = ?");
            preparedStatement.setString(1, "Cancelado");
            preparedStatement.setInt(2, idShow);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public void cancelFunction(int idFunction){
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement("UPDATE functions "
                    + "SET status = ? WHERE idFunction = ?");
            preparedStatement.setString(1, "Cancelado");
            preparedStatement.setInt(2, idFunction);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public ArrayList<Function> getShowFunctionsByIdShow(int idShow){
        ArrayList<Function> functions = new ArrayList();
        Function function;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("select * from functions WHERE idShow = "+ idShow);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                function = new Function();
                function.setIdFunction(resultSet.getInt(1));
                function.setDate(resultSet.getDate(2));
                function.setStartTime(resultSet.getTime(3));
                function.setEndingTime(resultSet.getTime(4));
                function.setIdShow(resultSet.getInt(5));
                function.setStatus(resultSet.getString(6));
                function.setModified(resultSet.getString(7));
                functions.add(function);
            }
        } catch (Exception e) {
        }
        
        return functions;
    }
    
    public void updateDateHourFunction(int idFunction, Date date, Time startTime, Time endingTime){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement("UPDATE functions "
                    + "SET date = ? , startTime = ? , endingTime = ? , modified = ?  WHERE idFunction = ?");
            preparedStatement.setDate(1, date);
            preparedStatement.setTime(2, startTime);
            preparedStatement.setTime(3, endingTime);
            preparedStatement.setString(4, "Si");
            preparedStatement.setInt(5, idFunction);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
    }
    
    public int getCountOfFunction(){
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT Max(idFunction) FROM functions");
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public ArrayList<Function> getFunctionsToSellOrCancel(){
        ArrayList<Function> functions = new ArrayList();
        Function function;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT * FROM functions where date >= CURRENT_DATE");
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                function = new Function();
                function.setIdFunction(resultSet.getInt(1));
                function.setDate(resultSet.getDate(2));
                function.setStartTime(resultSet.getTime(3));
                function.setEndingTime(resultSet.getTime(4));
                function.setIdShow(resultSet.getInt(5));
                function.setStatus(resultSet.getString(6));
                function.setModified(resultSet.getString(7));
                functions.add(function);
            }
        } catch (Exception e) {
        }
        
        return functions;
    }
    
    public Function getOneFunction(int idFunction){
        Function function = null;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT * FROM functions WHERE idFunction = " + idFunction);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                function = new Function();
                function.setIdFunction(resultSet.getInt(1));
                function.setDate(resultSet.getDate(2));
                function.setStartTime(resultSet.getTime(3));
                function.setEndingTime(resultSet.getTime(4));
                function.setIdShow(resultSet.getInt(5));
                function.setStatus(resultSet.getString(6));
                function.setModified(resultSet.getString(7));
            }
        } catch (Exception e) {
        }
        
        return function;
    }
    
    public ArrayList<Function> getFunctionsBetweenDates(Date startDate, Date endingDate){
        ArrayList<Function> functions = new ArrayList();
        Function function;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement(
                    "SELECT * FROM functions "
                    + "WHERE date BETWEEN "
                    + "'"
                    + startDate
                    + "'"
                    + " AND "
                    + "'"
                    + endingDate
                    + "'"
                    + " ORDER BY date, startTime ASC;"           
            );
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                function = new Function();
                function.setIdFunction(resultSet.getInt(1));
                function.setDate(resultSet.getDate(2));
                function.setStartTime(resultSet.getTime(3));
                function.setEndingTime(resultSet.getTime(4));
                function.setIdShow(resultSet.getInt(5));
                function.setStatus(resultSet.getString(6));
                function.setModified(resultSet.getString(7));
                functions.add(function);
            }
        } catch (Exception e) {
        }
        
        return functions;
        
    }
}
