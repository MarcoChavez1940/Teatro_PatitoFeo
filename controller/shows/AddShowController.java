/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.shows;

import java.sql.Time;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import persistencia.ShowDAO;
import view.shows.AddShowView;

/**
 *
 * @author marco
 */
public class AddShowController{

    AddShowView addShowView;
    
    public AddShowController(JFrame mainMenu){
        addShowView = new AddShowView(mainMenu, true, this);
        addShowView.setVisible(true);    
    }
    
    public boolean addShow(String name, String description, Time duration, String price, String actors, String publicity,
                        String responsiblePersonalPhone, String responsibleAlternatePhone,
                        String responsibleEmail){
        
        boolean isFieldsEmpty = name.isEmpty() || price.isEmpty()
                || responsiblePersonalPhone.isEmpty()
                || responsibleEmail.isEmpty();
        
        
        if(!isFieldsEmpty){
            ShowDAO showBD = new ShowDAO();
            showBD.addShow(name, description, duration, Integer.valueOf(price), actors, publicity, responsiblePersonalPhone, responsibleAlternatePhone, responsibleEmail);
            JOptionPane.showMessageDialog(addShowView, "Guardado con exito");
            return true;
        }else{
            JOptionPane.showMessageDialog(addShowView, "Campos requeridos vacios");
            return false;
        }
    }
     
    
}
