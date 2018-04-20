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
import java.util.ArrayList;
import model.Seat;

/**
 *
 * @author marco
 */
public class SeatDAO {
    
    Conexion conexion = null;
    
    public SeatDAO(){
        conexion = new Conexion();
    }
    
    public void addSeatOfFunction(){
        FunctionDAO functionBD = new FunctionDAO();
        int idFunction = functionBD.getCountOfFunction();
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement(
                    "INSERT INTO seats (number, type, status, idFunction) values "
                        + "('H1', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H2', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H3', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H4', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H5', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H6', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H7', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H8', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H9', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H10', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H11', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H12', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H13', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H14', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('H15', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H16', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H17', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H18', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H19', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('H20', 'Plata', 'Disponible', " + idFunction + "),"
                    
                        + "('G1', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G2', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G3', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G4', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G5', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G6', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G7', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G8', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G9', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G10', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G11', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G12', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G13', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G14', 'Oro', 'Disponible', " + idFunction + "),"
                        + "('G15', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G16', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G17', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G18', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G19', 'Plata', 'Disponible', " + idFunction + "),"
                        + "('G20', 'Plata', 'Disponible', " + idFunction + "),"
                    
                        + "('F1', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F2', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F3', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F4', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F5', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F6', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F7', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F8', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F9', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F10', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F11', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F12', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F13', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F14', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('F15', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F16', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F17', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F18', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F19', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('F20', 'Lata', 'Disponible', " + idFunction + "),"
                    
                        + "('E1', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E2', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E3', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E4', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E5', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E6', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E7', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E8', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E9', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E10', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E11', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E12', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E13', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E14', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('E15', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E16', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E17', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E18', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E19', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('E20', 'Lata', 'Disponible', " + idFunction + "),"
                    
                        + "('D1', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D2', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D3', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D4', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D5', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D6', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D7', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D8', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D9', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D10', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D11', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D12', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D13', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D14', 'Diamante', 'Disponible', " + idFunction + "),"
                        + "('D15', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D16', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D17', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D18', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D19', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('D20', 'Lata', 'Disponible', " + idFunction + "),"
                    
                        + "('C1', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C2', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C3', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C4', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C5', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C6', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C7', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C8', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C9', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C10', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C11', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C12', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C13', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C14', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('C15', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C16', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C17', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C18', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C19', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('C20', 'Lata', 'Disponible', " + idFunction + "),"
                    
                        + "('B1', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B2', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B3', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B4', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B5', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B6', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B7', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B8', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B9', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B10', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B11', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B12', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B13', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B14', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('B15', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B16', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B17', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B18', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B19', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('B20', 'Lata', 'Disponible', " + idFunction + "),"
                    
                        + "('A1', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A2', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A3', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A4', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A5', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A6', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A7', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A8', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A9', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A10', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A11', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A12', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A13', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A14', 'Cobre', 'Disponible', " + idFunction + "),"
                        + "('A15', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A16', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A17', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A18', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A19', 'Lata', 'Disponible', " + idFunction + "),"
                        + "('A20', 'Lata', 'Disponible', " + idFunction + ")"
 
                    );
            statement.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Seat> getAllSeatOfFunction(int idFunction){
        ArrayList<Seat> asientos = new ArrayList();
        Seat asiento;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT * FROM seats where idFunction = " + idFunction);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                asiento = new Seat();
                asiento.setNumber(resultSet.getString(2));
                asiento.setType(resultSet.getString(3));
                asiento.setStatus(resultSet.getString(4));
                asiento.setIdFunction(resultSet.getInt(5));
                asientos.add(asiento);
            }
        } catch (Exception e) {
        }
        
        return asientos;
    }
    
    public void updateSellSeats(String seatSold, int idFunction){
        SaleDAO saleBD = new SaleDAO();
        int idSale = saleBD.getCountOfSale();
        
        //UPDATE `seats` SET `status` = 'Vendido' WHERE `seats`.`id` = 2;
        StringBuilder query = new StringBuilder();
            query
                .append("UPDATE seats SET status = 'Vendido'")
                .append(", ")
                .append("idSale = ")
                .append("'")
                .append(idSale)
                .append("' ")
                .append("WHERE seats.number = ")   
                .append("'")
                .append(seatSold)
                .append("'")
                .append(" AND ")
                .append("seats.idFunction = ")
                .append(idFunction)
                .append("; ");
                
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement(query.toString());
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
        
    }
            
    public int getIdSeat(String numberSeat, int idFunction){

        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT idSeat FROM seats WHERE number = '" + numberSeat + "' AND idFunction = " + idFunction);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (Exception e) {
        }
        
        return 0;

    }
    
    public ArrayList<Seat> getSeatsSold(int idFunction){
        ArrayList<Seat> asientos = new ArrayList();
        Seat asiento;
        
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement statement = accessBD.prepareStatement("SELECT * FROM seats"
                    + " WHERE status = 'Vendido' AND idFunction = " + idFunction);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                asiento = new Seat();
                asiento.setIdSeat(resultSet.getInt(1));
                asiento.setNumber(resultSet.getString(2));
                asiento.setType(resultSet.getString(3));
                asiento.setStatus(resultSet.getString(4));
                asiento.setIdFunction(resultSet.getInt(5));
                asiento.setIdSale(resultSet.getInt(6));
                asientos.add(asiento);
            }
        } catch (Exception e) {
        }
        return asientos;
    }
    
    public void cancelSeat(int idSeat){
        
        StringBuilder query = new StringBuilder();
            query
                .append("UPDATE seats SET status = 'Disponible'")
                .append(", ")
                .append("idSale = NULL ")
                .append("WHERE seats.idSeat = ")   
                .append(idSeat)
                .append("; ");
                
        try {
            Connection accessBD = conexion.getConexion();
            PreparedStatement preparedStatement = accessBD.prepareStatement(query.toString());
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }    
    }
}
