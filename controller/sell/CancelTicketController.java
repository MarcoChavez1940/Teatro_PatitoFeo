/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.sell;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Function;
import model.Seat;
import persistencia.FunctionDAO;
import persistencia.SaleDAO;
import persistencia.SeatDAO;
import persistencia.ShowDAO;
import view.sell.CancelTicketView;

/**
 *
 * @author marco
 */
public class CancelTicketController {
   
    private final double RETURNPERCENTAGE = 0.80;
    
    CancelTicketView cancelTicketView;
    int idFunction;
    
    public CancelTicketController(javax.swing.JDialog parent, int idFunction) {
        this.idFunction = idFunction;
        cancelTicketView = new CancelTicketView(parent, true, this);
        cancelTicketView.setVisible(true);
        
    }
    
    public void refillTableSeatToCancel(JTable tableFunctions) {       
        FunctionDAO functionBD = new FunctionDAO();
        ShowDAO showBD = new ShowDAO();
        SaleDAO saleBD = new SaleDAO();
        SeatDAO seatBD = new SeatDAO();
        
        ArrayList<Seat> seats = seatBD.getSeatsSold(idFunction);
        Seat seat;
        
        DefaultTableModel modeloT = new DefaultTableModel();
        tableFunctions.setModel(modeloT);

        modeloT.addColumn("ID Asiento");
        modeloT.addColumn("Numero");
        modeloT.addColumn("Estatus");
        modeloT.addColumn("Show");
        modeloT.addColumn("Nombre cliente");
        modeloT.addColumn("Pagado");
        modeloT.addColumn("A Devolver");

        String nameShow = showBD.getShowById(functionBD.getOneFunction(idFunction).getIdShow()).getName();
        
        Object[] columna = new Object[7];
        for (int i = 0; i < seats.size(); i++) {
            seat = seats.get(i);

            double moneyPaid = saleBD.getMoneyPaid(seat.getIdSale());
            
            
            columna[0] = seat.getIdSeat();
            columna[1] = seat.getNumber();
            columna[2] = seat.getStatus();
            columna[3] = nameShow;
            columna[4] = saleBD.getNameClient(seat.getIdSale());
            columna[5] = moneyPaid;
            columna[6] = moneyPaid * RETURNPERCENTAGE;

            modeloT.addRow(columna);
        }
    }
}
