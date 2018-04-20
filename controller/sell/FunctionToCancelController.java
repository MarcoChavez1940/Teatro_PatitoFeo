/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.sell;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Function;
import persistencia.FunctionDAO;
import persistencia.ShowDAO;
import view.sell.FunctionToCancelView;

/**
 *
 * @author marco
 */
public class FunctionToCancelController {
    
    FunctionToCancelView functionToCancelView;
    public CancelTicketController cancelTicketController;
    
    public FunctionToCancelController(JFrame mainMenu){
        functionToCancelView = new FunctionToCancelView(mainMenu, true, this);
        functionToCancelView.setVisible(true);
    }
    
    public void getFunctionsToSell(JTable tableFunctions) {
        FunctionDAO functionBD = new FunctionDAO();
        ShowDAO showBD = new ShowDAO();

        ArrayList<Function> functions = functionBD.getFunctionsToSellOrCancel();
        Function function;

        DefaultTableModel modeloT = new DefaultTableModel();
        tableFunctions.setModel(modeloT);

        modeloT.addColumn("ID");
        modeloT.addColumn("Fecha");
        modeloT.addColumn("Hora comiezo");
        modeloT.addColumn("Show");

        Object[] columna = new Object[4];
        for (int i = 0; i < functions.size(); i++) {
            function = new Function();
            function = functions.get(i);

            columna[0] = function.getIdFunction();
            columna[1] = function.getDate();
            columna[2] = function.getStartTime();
            columna[3] = showBD.getShowById(function.getIdShow()).getName();

            modeloT.addRow(columna);
        }
    }
    
}
