/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.functions;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import model.Function;
import persistencia.FunctionDAO;
import persistencia.ShowDAO;
import view.functions.PrintCalendarView;

/**
 *
 * @author marco
 */
public class PrintCalendarController {
    
    PrintCalendarView printCalendarView;
    
    public PrintCalendarController(JFrame mainMenu){
        printCalendarView = new PrintCalendarView(mainMenu, true, this);
        printCalendarView.setVisible(true);
    }
    
    public void printCalendar(Date startDate, Date endingDate, String directory) throws FileNotFoundException, DocumentException{
        FunctionDAO functionBD = new FunctionDAO();
        ShowDAO showBD = new ShowDAO();
        
        ArrayList<Function> functions = functionBD.getFunctionsBetweenDates(startDate, endingDate);
        
        
        //generate PDF
        java.sql.Date currentDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(directory + "/calendario" +
                (currentDate.getYear()+1900) + "-" + (currentDate.getMonth() + 1) + "-" + currentDate.getDate()
                + ".pdf"
        ));
        
        document.open();
        document.add(new Paragraph("Teatro patito Feo", FontFactory.getFont(FontFactory.TIMES_BOLD, 16, BaseColor.RED )));
        document.add(new Paragraph("Calendario de funciones", FontFactory.getFont(FontFactory.TIMES_BOLD, 12, BaseColor.BLUE )));
        document.add(new Paragraph("---------------------------------------------------------"));
        
   
        PdfPTable table = new PdfPTable(4);
        table.addCell("Fecha");
        table.addCell("Hora de inicio");
        table.addCell("Hora de fin");
        table.addCell("Nombre del show");
        for (Function function : functions) {
            table.addCell(function.getDate().toString());
            table.addCell(function.getStartTime().toString());
            table.addCell(function.getEndingTime().toString());
            table.addCell(showBD.getShowName(function.getIdShow()));
        }
        document.add(table);
        document.close();
    
    }
    
    public String formatDate(JDateChooser chooser){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if(chooser.getDate() != null){
            return formato.format(chooser.getDate());
        }
        else{
            return null;
        }
        
    }
    
}
