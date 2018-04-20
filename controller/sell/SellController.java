/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.sell;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.SaleDAO;
import persistencia.SeatDAO;
import persistencia.ShowDAO;
import view.sell.SellView;

/**
 *
 * @author marco
 */
public class SellController{
    
    public final Color SELECTED = Color.PINK;
    public final Color SOLD = Color.RED;
    public final Color RESERVED =  Color.MAGENTA;
    public final Color CAN =  Color.LIGHT_GRAY;
    public final Color COPPER =  Color.ORANGE;
    public final Color SILVER =  Color.CYAN;
    public final Color GOLD =  Color.YELLOW;
    public final Color DIAMOND =  Color.GREEN;
    public final double DIAMOND_PRICE = 1.0;
    public final double GOLD_PRICE = 0.90;
    public final double SILVER_PRICE = 0.75;
    public final double COPPER_PRICE = 0.60;
    public final double CAN_PRICE = 0.50;
    private final int MAX_SEATS_SELECTED = 6;
    
    
    SellView sellView;
    
    public SeatDAO seatBD;
    SaleDAO saleBD;
    ShowDAO showBD;
    GenerateTickets generator;
    public int idFunction;
    public ArrayList<String> seatsSelected = new ArrayList<>();
    ArrayList<Color> colorsOfSeatSelected = new ArrayList();
    public int basePrice;
    
    
    public SellController(int idFunction, int idShow, javax.swing.JDialog parent){
        generator = new GenerateTickets();
        showBD = new ShowDAO();
        this.basePrice = showBD.getPriceShow(idShow);
        this.idFunction = idFunction;
        
        sellView = new SellView(parent, true, this);
        
        sellView.setVisible(true);
               
    }
    
   
    public void updateLabels(){
        int diamontCount = 0;
        int goldCount = 0; 
        int silverCount = 0;
        int copperCount = 0;
        int canCount = 0;
        double totalPrice;
        
        for (Color colorOfSeatSelected : colorsOfSeatSelected) {
            if(DIAMOND.equals(colorOfSeatSelected)){
                diamontCount++;
                continue;   
            }
            if(GOLD.equals(colorOfSeatSelected)){
                goldCount++;
                continue;   
            }
            if(SILVER.equals(colorOfSeatSelected)){
                silverCount++;
                continue;   
            }
            if(COPPER.equals(colorOfSeatSelected)){
                copperCount++;
                continue;   
            }
            if(CAN.equals(colorOfSeatSelected)){
                canCount++;                 
            }    
        }
        
        sellView.diamontCountLabel.setText(String.valueOf(diamontCount));
        sellView.goldCountLabel.setText(String.valueOf(goldCount));
        sellView.silverCountLabel.setText(String.valueOf(silverCount));
        sellView.copperCountLabel.setText(String.valueOf(copperCount));
        sellView.canCountLabel.setText(String.valueOf(canCount));
        
        totalPrice = 
                (basePrice * DIAMOND_PRICE) * diamontCount +
                (basePrice * GOLD_PRICE) * goldCount +
                (basePrice * SILVER_PRICE) * silverCount +
                (basePrice * COPPER_PRICE) * copperCount +
                (basePrice * CAN_PRICE) * canCount;
        
        sellView.totalLabel.setText(String.valueOf(totalPrice));   
    }
    
    public void addSellSeat(javax.swing.JButton seat){
        
        if(seatsSelected.contains(seat.getText())){
            int aux = seatsSelected.indexOf(seat.getText());
            seatsSelected.remove(aux);
            seat.setBackground(colorsOfSeatSelected.remove(aux));
            updateLabels();
        }else{
            if(seatsSelected.size() < MAX_SEATS_SELECTED){
                //Añadir asiento al carrito del cliente
                seatsSelected.add(seat.getText());
                //Añadir el color a un array de colores por alguna razon xD
                colorsOfSeatSelected.add(seat.getBackground());
                //Cambiar el color del asiento en la pantalla local.
                seat.setBackground(SELECTED);
                
                //Aqui deberia cambiar el color en la pantallas remotas.
                //aqui se hace la magia xDxdxdxd
                
                updateLabels();
            }else{
                JOptionPane.showMessageDialog(sellView, "No puede comprar/reservar mas de " + MAX_SEATS_SELECTED + " asientos");
            }
            
        }
        
    }
    
    private double getCostOfSeat(Color colorOfSeatSelected){
        
        if(DIAMOND.equals(colorOfSeatSelected)){
                return DIAMOND_PRICE * basePrice;            
            }
            if(GOLD.equals(colorOfSeatSelected)){
                return GOLD_PRICE * basePrice;  
            }
            if(SILVER.equals(colorOfSeatSelected)){
                return SILVER_PRICE * basePrice;  
            }
            if(COPPER.equals(colorOfSeatSelected)){
                return COPPER_PRICE * basePrice;   
            }
            if(CAN.equals(colorOfSeatSelected)){
                return CAN_PRICE * basePrice;                 
            } 
        
        return 0.0;
    }
    
    
    public void doSell(String direction, String nameFile) throws IOException, BadElementException, FileNotFoundException, DocumentException{
        
        if(seatsSelected.size()>0){
            seatBD = new SeatDAO();
            saleBD = new SaleDAO();
        
            String nameClient = JOptionPane.showInputDialog(sellView, "Nombre del cliente");
        
            if((nameClient != null) && (nameClient.length() > 0)){
                int seatNumber = 0;        
                for (String seatSelected : this.seatsSelected) {          
                    saleBD.addSale(getCostOfSeat(colorsOfSeatSelected.get(seatNumber)), nameClient);
                    seatBD.updateSellSeats(seatSelected, this.idFunction);
                    seatNumber++;
                }
                JOptionPane.showMessageDialog(sellView, "Gracias por su compra");
                generator.generatePDF(generator.generateTickets(seatsSelected, idFunction), direction, nameFile);

                this.sellView.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(sellView, "Ningun asiento selecccionado");
        }
        

    }
    
    public static void main(String[] args) {
        
    }
   
}
