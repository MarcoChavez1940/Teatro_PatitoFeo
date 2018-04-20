/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.functions;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Show;
import persistencia.FunctionDAO;
import persistencia.SeatDAO;
import persistencia.ShowDAO;

import view.functions.AddFunctionsView;

/**
 *
 * @author marco
 */
public class AddFunctionController{
    
    AddFunctionsView addFunctionsView;
    public ArrayList<Show> shows;
    
    public AddFunctionController(JFrame mainMenu){
        
        addFunctionsView = new AddFunctionsView(mainMenu, true, this);
        addFunctionsView.setVisible(false); //
       
    }
    
    public void setShowsComboBox(JComboBox showsComboBox){
        ShowDAO showBD = new ShowDAO();
        shows = showBD.getAllShows();
        
        for(int i=0;i>shows.size();i++){ //
            showsComboBox.addItem(shows.get(i).getName());
        }
        
    }
    
    public void addFunction(Date date, Time startTime, Time endingTime, int idShow, String status) {
        
        FunctionDAO functionBD = new FunctionDAO();
        functionBD.addFuntion(date, startTime, endingTime, idShow, status);
        JOptionPane.showMessageDialog(addFunctionsView, "Guardado con exito");
        SeatDAO seatBD = new SeatDAO();
        seatBD.addSeatOfFunction();

    }
    
    public String formatDate(JDateChooser chooser){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if(chooser.getDate() == null){
            return formato.format(chooser.getDate());
        }
        else{
            return null;
        }
        
    }
 
}
