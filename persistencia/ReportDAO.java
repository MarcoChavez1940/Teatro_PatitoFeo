/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Function;
import model.Report;

/**
 *
 * @author marco
 */
public class ReportDAO {
    
    Conexion conexion = null;
    
    public ReportDAO(){
        conexion = new Conexion();
    }
    
    public ArrayList<Report> getReportOfFunction(int idFunction){
    
        /*
        SELECT
        shows.idShow, shows.name,
        functions.idFunction, functions.date, functions.startTime, functions.endingTime,
        seats.idSeat, seats.number, seats.type, seats.status,
        sales.money, sales.nameClient

        FROM shows JOIN functions ON shows.idShow = functions.idShow
        JOIN seats ON functions.idFunction = seats.idFunction
        JOIN sales ON seats.idSale = sales.idSale
        */
        ArrayList<Report> reports = new ArrayList<>();
        Report report = null;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement(""
                    + "SELECT\n" +
                      "functions.idFunction, functions.date, functions.startTime, functions.endingTime,\n" +
                      "seats.type, seats.status\n" +
                      "FROM functions JOIN seats ON functions.idFunction = seats.idFunction\n" +
                      "WHERE functions.idFunction = "
                    + idFunction);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                report = new Report();
                report.setIdFunction(resultSet.getInt(1));
                report.setDate(resultSet.getDate(2));
                report.setStartTime(resultSet.getTime(3));
                report.setEndingTime(resultSet.getTime(4));
                report.setType(resultSet.getString(5));
                report.setStatus(resultSet.getString(6));
                reports.add(report);
            }
        } catch (Exception e) {
        }
        
        return reports;
        
    }
    
}
