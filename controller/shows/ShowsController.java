/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.shows;


import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Function;
import model.Show;
import persistencia.FunctionDAO;
import persistencia.ShowDAO;
import view.shows.FunctionRelatedView;
import view.shows.ShowsView;

/**
 *
 * @author marco
 */
public final class ShowsController{
    
    ShowsView showView;
    FunctionRelatedView functionRelatedView;
    
    public ShowsController(JFrame mainMenu){
        showView = new ShowsView(mainMenu, true, this);
        showView.setVisible(true);
    }
       
    
    public void getAllShows(JTable showsTable){
        ShowDAO showBD = new ShowDAO();
        
        ArrayList shows = showBD.getAllShows();
        Show show = new Show();
        
        DefaultTableModel modeloT = new DefaultTableModel();
        showsTable.setModel(modeloT);
        
        modeloT.addColumn("ID");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Descripcion");
        modeloT.addColumn("Precio base");
        modeloT.addColumn("Estatus");
        modeloT.addColumn("Actores");
        modeloT.addColumn("Publicidad");
        
        Object[] columna = new Object[7];
        for(int i=0; i<shows.size(); i++){  
            show = (Show) shows.get(i);
            
            columna[0] = show.getIdShow();
            columna[1] = show.getName();
            columna[2] = show.getDescription();
            columna[3] = show.getPrice();
            columna[4] = show.getStatus();
            columna[5] = show.getActors();
            columna[6] = show.getPublicity();

            modeloT.addRow(columna);
        }
    }
    
    
    public void openFuncionRelatedView(int idShow){
        functionRelatedView = new FunctionRelatedView(showView, idShow, true, this);
        functionRelatedView.setVisible(true);
    }
    
    public void getAllFunctionsRelated(JTable tableFunctions, int idShow) {
        FunctionDAO functionBD = new FunctionDAO();
        ShowDAO showBD = new ShowDAO();

        ArrayList<Function> functions = functionBD.getShowFunctionsByIdShow(idShow);
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
        
    public void seeResponsibleShow(int idShow){
        ShowDAO showBD = new ShowDAO();
        Show show;
        
        show = showBD.getShowById(idShow);
        
        JOptionPane.showMessageDialog(showView, "Datos sobre el responsable de esta obra\n"
            + "Telefono personal: " + show.getResponsiblePersonalPhone() + "\n"
            + "Telefono alternativo: " + show.getResponsibleAlternatePhone() + "\n"
            + "Email: " + show.getResponsibleEmail());   
    }
    
    public void cancelShow(int idShow){
        ShowDAO showBD = new ShowDAO();
        showBD.cancelShow(idShow);
    }
    
    public void cancelFunctionRelated(int idShow){
        FunctionDAO funcionBD = new FunctionDAO();
        funcionBD.updateStatusCancelFunction(idShow);
    }
         
    
}
