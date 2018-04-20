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
import view.sell.FunctionsToSellView;

/**
 *
 * @author marco
 */
public class FunctionToSellController{

    FunctionsToSellView functionsToSellView;
    
    public SellController sellController;
    
    
    public ArrayList<Integer> idShows = new ArrayList<>();
    
    public FunctionToSellController(JFrame mainMenu) {
        functionsToSellView = new FunctionsToSellView(mainMenu, true, this);
        functionsToSellView.setVisible(true);
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
        modeloT.addColumn("Hora fin");
        modeloT.addColumn("Show");
        modeloT.addColumn("Precio");

        Object[] columna = new Object[6];
        for (int i = 0; i < functions.size(); i++) {
            function = new Function();
            function = functions.get(i);

            columna[0] = function.getIdFunction();
            columna[1] = function.getDate();
            columna[2] = function.getStartTime();
            columna[3] = function.getEndingTime();
            columna[4] = showBD.getShowById(function.getIdShow()).getName();
            columna[5] = showBD.getPriceShow(function.getIdShow());
            idShows.add(function.getIdShow());

            modeloT.addRow(columna);
        }
    }

      
}
