/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.report;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Function;
import model.Report;
import persistencia.FunctionDAO;
import persistencia.ReportDAO;
import view.report.ReportView;

/**
 *
 * @author marco
 */
public class ReportController {
    
    private final int idShow;
    ReportView reportView2;

 
    public ReportController(int idShow, JDialog parent, boolean modal){
        this.idShow = idShow;
        this.reportView2 = new ReportView(parent, modal, this);
        this.reportView2.setVisible(true);
    }
    
    public void refillTableReport(JTable tableReport){
        FunctionDAO functionBD = new FunctionDAO();
        ReportDAO reportBD = new ReportDAO();
        
        ArrayList<Function> functions = functionBD.getShowFunctionsByIdShow(idShow);
        
        ArrayList<Report> reports = new ArrayList<>();
        Report generalReport;
        
        DefaultTableModel modeloT = new DefaultTableModel();
        tableReport.setModel(modeloT);
        tableReport.getTableHeader().setPreferredSize(new Dimension(10, 62));
        
        modeloT.addColumn("FuncionID");
        modeloT.addColumn("Fecha");
        modeloT.addColumn("Hora inicio");
        modeloT.addColumn("Hora fin");
        modeloT.addColumn("<html><center>Asientos Diamante<br>Vendidos");
        modeloT.addColumn("<html><center>Asientos Oro<br>Vendidos");
        modeloT.addColumn("<html><center>Asientos Plata<br>Vendidos");
        modeloT.addColumn("<html><center>Asientos Cobre<br>Vendidos");
        modeloT.addColumn("<html><center>Asientos Lata<br>Vendidos");
        modeloT.addColumn("<html><center>Asientos Total<br>Vendidos");
        
        Object[] columna = new Object[10];
        for(int i=0; i<functions.size(); i++){
    
            reports = reportBD.getReportOfFunction(functions.get(i).getIdFunction());
            
            generalReport = reports.get(0);
            columna[0] = generalReport.getIdFunction();
            columna[1] = generalReport.getDate();
            columna[2] = generalReport.getStartTime();
            columna[3] = generalReport.getEndingTime();
            
            int diamontCount = 0;
            int goldCount = 0;
            int silverCount = 0;
            int copperCount = 0;
            int canCount = 0;
            
            for (Report report : reports) {
                if(report.getStatus().compareTo("Vendido") == 0)
                    switch(report.getType()){
                        case "Diamante":
                            diamontCount++;
                            break;
                        case "Oro":
                            goldCount++;
                            break;
                        case "Plata":
                            silverCount++;
                            break;
                        case "Cobre":
                            copperCount++;
                            break;
                        case "Lata":
                            canCount++;                           
                    }  
            }
            
            columna[4] = diamontCount;
            columna[5] = goldCount;
            columna[6] = silverCount;
            columna[7] = copperCount;
            columna[8] = canCount;
            columna[9] = diamontCount + goldCount + silverCount + copperCount + canCount;

            modeloT.addRow(columna);
        }
    }
    
}
