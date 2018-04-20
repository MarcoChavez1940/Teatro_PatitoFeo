/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.functions;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Function;
import persistencia.FunctionDAO;
import persistencia.ShowDAO;
import view.functions.WatchFunctionsView;

/**
 *
 * @author marco
 */
public class FunctionController{

    WatchFunctionsView watchFunctionsView;
    
    public FunctionController(JFrame mainMenu) {
        
        watchFunctionsView = new WatchFunctionsView(mainMenu, true, this);
        watchFunctionsView.setVisible(true);
        
    }
           
    public void getAllFunctions(JTable tableFunctions) {
        FunctionDAO functionBD = new FunctionDAO();
        ShowDAO showBD = new ShowDAO();

        ArrayList<Function> functions = functionBD.getFunctions();
        Function function; 

        DefaultTableModel modeloT = new DefaultTableModel();
        tableFunctions.setModel(modeloT);

        modeloT.addColumn("ID");
        modeloT.addColumn("Fecha");
        modeloT.addColumn("Hora comiezo");
        modeloT.addColumn("Hora fin");
        modeloT.addColumn("Show");
        modeloT.addColumn("Estatus");
        modeloT.addColumn("Modificado");

        Object[] columna = new Object[7];
        for (int i = 0; i < functions.size(); i++) {
            function = new Function();
            function = functions.get(i);

            columna[0] = function.getIdFunction();
            columna[1] = function.getDate();
            columna[2] = function.getStartTime();
            columna[3] = function.getEndingTime();
            columna[4] = showBD.getShowById(function.getIdShow()).getName();
            columna[5] = function.getStatus();
            columna[6] = function.getModified();

            modeloT.addRow(columna);
        }
    }
     
    public void cancelFunction(int idFuncion){
        FunctionDAO functionBD = new FunctionDAO();
        functionBD.cancelFunction(idFuncion);
    }
    
}
