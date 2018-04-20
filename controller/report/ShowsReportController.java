/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.report;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Show;
import persistencia.ShowDAO;
import view.report.ShowsReportView;

/**
 *
 * @author Marco
 */
public class ShowsReportController{

    ShowsReportView showsReportView2;
    public ReportController reportController;
    
    public ShowsReportController(JFrame mainMenu) {        
        showsReportView2 = new ShowsReportView(mainMenu, true, this);
        showsReportView2.setVisible(true);       
    }
    
    public void getAllShows(JTable tableShows){
        ShowDAO showBD = new ShowDAO();
        
        ArrayList shows = showBD.getAllShows();
        Show show = new Show();
        
        DefaultTableModel modeloT = new DefaultTableModel();
        tableShows.setModel(modeloT);
        
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
      
}
