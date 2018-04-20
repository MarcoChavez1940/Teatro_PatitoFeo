/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.functions.AddFunctionController;
import controller.functions.FunctionController;
import controller.functions.PrintCalendarController;
import controller.functions.UpdateFunctionController;
import controller.report.ShowsReportController;
import controller.sell.FunctionToCancelController;
import controller.sell.FunctionToSellController;
import controller.shows.AddShowController;
import controller.shows.ShowsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MenuView;

/**
 *
 * @author marco
 */
public class MenuController implements ActionListener{
    MenuView menuView;
    
    ShowsController shows;
    AddShowController addShow;
    
    FunctionController functionController;
    AddFunctionController addFunction;
    UpdateFunctionController updateFunction;
    PrintCalendarController printCalendarController;
    
    FunctionToSellController functionToSellController;
    
    FunctionToCancelController functionToCancelController;
    
    ShowsReportController showsReportController;
      
    public MenuController(){
        menuView = new MenuView();
        menuView.setVisible(true);
        
        
        menuView.watchShowsMenu.addActionListener(this);
        menuView.addShowsMenu.addActionListener(this);
        
        menuView.watchFunctionsMenu.addActionListener(this);
        menuView.addFunctionMenu.addActionListener(this);
        menuView.updateFunctionMenu.addActionListener(this);
        menuView.printFunctionsMenu.addActionListener(this);
        
        menuView.sellMenu.addActionListener(this);
        
        menuView.cancelMenu.addActionListener(this);
        
        menuView.reportMenu.addActionListener(this);
    }
    
          
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuView.watchShowsMenu){ 
            shows = new ShowsController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.addShowsMenu){
            addShow = new AddShowController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.watchFunctionsMenu){
            functionController = new FunctionController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.addFunctionMenu){
            addFunction = new AddFunctionController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.updateFunctionMenu){
            updateFunction = new UpdateFunctionController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.printFunctionsMenu){
            printCalendarController = new PrintCalendarController(menuView);
        }
        
        if(e.getSource() == menuView.sellMenu){
            functionToSellController = new FunctionToSellController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.cancelMenu){
            functionToCancelController = new FunctionToCancelController(menuView);
            return;
        }
        
        if(e.getSource() == menuView.reportMenu){
            showsReportController = new ShowsReportController(menuView);
        }
    }
       
}
