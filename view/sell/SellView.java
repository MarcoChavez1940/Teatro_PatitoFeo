/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.sell;

import com.itextpdf.text.DocumentException;
import controller.sell.SellController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Seat;
import persistencia.SeatDAO;

/**
 *
 * @author marco
 */
public class SellView extends javax.swing.JDialog {

    SellController sellController;
    
    /** Creates new form SellView2 */
    public SellView(javax.swing.JDialog parent, boolean modal, SellController controller) {
        super(parent, modal);
        initComponents();
        this.sellController = controller;
        setDefaultColor();
        setColorSeats();
        
    }

    private SellView(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public final void setDefaultColor(){
        //SILVER
        
        H1.setBackground(sellController.SILVER);
        H2.setBackground(sellController.SILVER);
        H3.setBackground(sellController.SILVER);
        H4.setBackground(sellController.SILVER);
        H5.setBackground(sellController.SILVER);
        H6.setBackground(sellController.SILVER);
        G1.setBackground(sellController.SILVER);
        G2.setBackground(sellController.SILVER);
        G3.setBackground(sellController.SILVER);
        G4.setBackground(sellController.SILVER);
        G5.setBackground(sellController.SILVER);
        G6.setBackground(sellController.SILVER);
        
        H15.setBackground(sellController.SILVER);
        H16.setBackground(sellController.SILVER);
        H17.setBackground(sellController.SILVER);
        H18.setBackground(sellController.SILVER);
        H19.setBackground(sellController.SILVER);
        H20.setBackground(sellController.SILVER);
        G15.setBackground(sellController.SILVER);
        G16.setBackground(sellController.SILVER);
        G17.setBackground(sellController.SILVER);
        G18.setBackground(sellController.SILVER);
        G19.setBackground(sellController.SILVER);
        G20.setBackground(sellController.SILVER);
        
        //GOLD
        H7.setBackground(sellController.GOLD);
        H8.setBackground(sellController.GOLD);
        H9.setBackground(sellController.GOLD);
        H10.setBackground(sellController.GOLD);
        H11.setBackground(sellController.GOLD);
        H12.setBackground(sellController.GOLD);
        H13.setBackground(sellController.GOLD);
        H14.setBackground(sellController.GOLD);
        
        G7.setBackground(sellController.GOLD);
        G8.setBackground(sellController.GOLD);
        G9.setBackground(sellController.GOLD);
        G10.setBackground(sellController.GOLD);
        G11.setBackground(sellController.GOLD);
        G12.setBackground(sellController.GOLD);
        G13.setBackground(sellController.GOLD);
        G14.setBackground(sellController.GOLD);
        
        //DIAMOND
        F7.setBackground(sellController.DIAMOND);
        F8.setBackground(sellController.DIAMOND);
        F9.setBackground(sellController.DIAMOND);
        F10.setBackground(sellController.DIAMOND);
        F11.setBackground(sellController.DIAMOND);
        F12.setBackground(sellController.DIAMOND);
        F13.setBackground(sellController.DIAMOND);
        F14.setBackground(sellController.DIAMOND);
        
        E7.setBackground(sellController.DIAMOND);
        E8.setBackground(sellController.DIAMOND);
        E9.setBackground(sellController.DIAMOND);
        E10.setBackground(sellController.DIAMOND);
        E11.setBackground(sellController.DIAMOND);
        E12.setBackground(sellController.DIAMOND);
        E13.setBackground(sellController.DIAMOND);
        E14.setBackground(sellController.DIAMOND);
        
        D7.setBackground(sellController.DIAMOND);
        D8.setBackground(sellController.DIAMOND);
        D9.setBackground(sellController.DIAMOND);
        D10.setBackground(sellController.DIAMOND);
        D11.setBackground(sellController.DIAMOND);
        D12.setBackground(sellController.DIAMOND);
        D13.setBackground(sellController.DIAMOND);
        D14.setBackground(sellController.DIAMOND);
        
        //COPPER
        C7.setBackground(sellController.COPPER);
        C8.setBackground(sellController.COPPER);
        C9.setBackground(sellController.COPPER);
        C10.setBackground(sellController.COPPER);
        C11.setBackground(sellController.COPPER);
        C12.setBackground(sellController.COPPER);
        C13.setBackground(sellController.COPPER);
        C14.setBackground(sellController.COPPER);
        
        B7.setBackground(sellController.COPPER);
        B8.setBackground(sellController.COPPER);
        B9.setBackground(sellController.COPPER);
        B10.setBackground(sellController.COPPER);
        B11.setBackground(sellController.COPPER);
        B12.setBackground(sellController.COPPER);
        B13.setBackground(sellController.COPPER);
        B14.setBackground(sellController.COPPER);
        
        A7.setBackground(sellController.COPPER);
        A8.setBackground(sellController.COPPER);
        A9.setBackground(sellController.COPPER);
        A10.setBackground(sellController.COPPER);
        A11.setBackground(sellController.COPPER);
        A12.setBackground(sellController.COPPER);
        A13.setBackground(sellController.COPPER);
        A14.setBackground(sellController.COPPER);
        
        //CAN
        F1.setBackground(sellController.CAN);
        F2.setBackground(sellController.CAN);
        F3.setBackground(sellController.CAN);
        F4.setBackground(sellController.CAN);
        F5.setBackground(sellController.CAN);
        F6.setBackground(sellController.CAN);
        
        E1.setBackground(sellController.CAN);
        E2.setBackground(sellController.CAN);
        E3.setBackground(sellController.CAN);
        E4.setBackground(sellController.CAN);
        E5.setBackground(sellController.CAN);
        E6.setBackground(sellController.CAN);
        
        D1.setBackground(sellController.CAN);
        D2.setBackground(sellController.CAN);
        D3.setBackground(sellController.CAN);
        D4.setBackground(sellController.CAN);
        D5.setBackground(sellController.CAN);
        D6.setBackground(sellController.CAN);
        
        C1.setBackground(sellController.CAN);
        C2.setBackground(sellController.CAN);
        C3.setBackground(sellController.CAN);
        C4.setBackground(sellController.CAN);
        C5.setBackground(sellController.CAN);
        C6.setBackground(sellController.CAN);
        
        B1.setBackground(sellController.CAN);
        B2.setBackground(sellController.CAN);
        B3.setBackground(sellController.CAN);
        B4.setBackground(sellController.CAN);
        B5.setBackground(sellController.CAN);
        B6.setBackground(sellController.CAN);
        
        A1.setBackground(sellController.CAN);
        A2.setBackground(sellController.CAN);
        A3.setBackground(sellController.CAN);
        A4.setBackground(sellController.CAN);
        A5.setBackground(sellController.CAN);
        A6.setBackground(sellController.CAN);
                
        F15.setBackground(sellController.CAN);
        F16.setBackground(sellController.CAN);
        F17.setBackground(sellController.CAN);
        F18.setBackground(sellController.CAN);
        F19.setBackground(sellController.CAN);
        F20.setBackground(sellController.CAN);
        
        E15.setBackground(sellController.CAN);
        E16.setBackground(sellController.CAN);
        E17.setBackground(sellController.CAN);
        E18.setBackground(sellController.CAN);
        E19.setBackground(sellController.CAN);
        E20.setBackground(sellController.CAN);
        
        D15.setBackground(sellController.CAN);
        D16.setBackground(sellController.CAN);
        D17.setBackground(sellController.CAN);
        D18.setBackground(sellController.CAN);
        D19.setBackground(sellController.CAN);
        D20.setBackground(sellController.CAN);
        
        C15.setBackground(sellController.CAN);
        C16.setBackground(sellController.CAN);
        C17.setBackground(sellController.CAN);
        C18.setBackground(sellController.CAN);
        C19.setBackground(sellController.CAN);
        C20.setBackground(sellController.CAN);
        
        B15.setBackground(sellController.CAN);
        B16.setBackground(sellController.CAN);
        B17.setBackground(sellController.CAN);
        B18.setBackground(sellController.CAN);
        B19.setBackground(sellController.CAN);
        B20.setBackground(sellController.CAN);
        
        A15.setBackground(sellController.CAN);
        A16.setBackground(sellController.CAN);
        A17.setBackground(sellController.CAN);
        A18.setBackground(sellController.CAN);
        A19.setBackground(sellController.CAN);
        A20.setBackground(sellController.CAN);
    }
    
    public void changeColorSeatPerStatus(javax.swing.JButton asiento, String estatus){
        switch(estatus){
            case "Vendido":
                asiento.setBackground(sellController.SOLD);
                asiento.setEnabled(false);
                break;
            case "Reservado":
                asiento.setBackground(sellController.RESERVED);
                asiento.setEnabled(false);
                break;
        }
    }
    
    public final void setColorSeats(){
        sellController.seatBD = new SeatDAO();
        ArrayList<Seat> allAsientos = sellController.seatBD.getAllSeatOfFunction(sellController.idFunction);
        
        changeColorSeatPerStatus(H1, allAsientos.get(0).getStatus());
        changeColorSeatPerStatus(H2, allAsientos.get(1).getStatus());
        changeColorSeatPerStatus(H3, allAsientos.get(2).getStatus());
        changeColorSeatPerStatus(H4, allAsientos.get(3).getStatus());
        changeColorSeatPerStatus(H5, allAsientos.get(4).getStatus());
        changeColorSeatPerStatus(H6, allAsientos.get(5).getStatus());
        changeColorSeatPerStatus(H7, allAsientos.get(6).getStatus());
        changeColorSeatPerStatus(H8, allAsientos.get(7).getStatus());
        changeColorSeatPerStatus(H9, allAsientos.get(8).getStatus());
        changeColorSeatPerStatus(H10, allAsientos.get(9).getStatus());
        changeColorSeatPerStatus(H11, allAsientos.get(10).getStatus());
        changeColorSeatPerStatus(H12, allAsientos.get(11).getStatus());
        changeColorSeatPerStatus(H13, allAsientos.get(12).getStatus());
        changeColorSeatPerStatus(H14, allAsientos.get(13).getStatus());
        changeColorSeatPerStatus(H15, allAsientos.get(14).getStatus());
        changeColorSeatPerStatus(H16, allAsientos.get(15).getStatus());
        changeColorSeatPerStatus(H17, allAsientos.get(16).getStatus());
        changeColorSeatPerStatus(H18, allAsientos.get(17).getStatus());
        changeColorSeatPerStatus(H19, allAsientos.get(18).getStatus());
        changeColorSeatPerStatus(H20, allAsientos.get(19).getStatus());
        
        changeColorSeatPerStatus(G1, allAsientos.get(20).getStatus());
        changeColorSeatPerStatus(G2, allAsientos.get(21).getStatus());
        changeColorSeatPerStatus(G3, allAsientos.get(22).getStatus());
        changeColorSeatPerStatus(G4, allAsientos.get(23).getStatus());
        changeColorSeatPerStatus(G5, allAsientos.get(24).getStatus());
        changeColorSeatPerStatus(G6, allAsientos.get(25).getStatus());
        changeColorSeatPerStatus(G7, allAsientos.get(26).getStatus());
        changeColorSeatPerStatus(G8, allAsientos.get(27).getStatus());
        changeColorSeatPerStatus(G9, allAsientos.get(28).getStatus());
        changeColorSeatPerStatus(G10, allAsientos.get(29).getStatus());
        changeColorSeatPerStatus(G11, allAsientos.get(30).getStatus());
        changeColorSeatPerStatus(G12, allAsientos.get(31).getStatus());
        changeColorSeatPerStatus(G13, allAsientos.get(32).getStatus());
        changeColorSeatPerStatus(G14, allAsientos.get(33).getStatus());
        changeColorSeatPerStatus(G15, allAsientos.get(34).getStatus());
        changeColorSeatPerStatus(G16, allAsientos.get(35).getStatus());
        changeColorSeatPerStatus(G17, allAsientos.get(36).getStatus());
        changeColorSeatPerStatus(G18, allAsientos.get(37).getStatus());
        changeColorSeatPerStatus(G19, allAsientos.get(38).getStatus());
        changeColorSeatPerStatus(G20, allAsientos.get(39).getStatus());
        
        changeColorSeatPerStatus(F1, allAsientos.get(40).getStatus());
        changeColorSeatPerStatus(F2, allAsientos.get(41).getStatus());
        changeColorSeatPerStatus(F3, allAsientos.get(42).getStatus());
        changeColorSeatPerStatus(F4, allAsientos.get(43).getStatus());
        changeColorSeatPerStatus(F5, allAsientos.get(44).getStatus());
        changeColorSeatPerStatus(F6, allAsientos.get(45).getStatus());
        changeColorSeatPerStatus(F7, allAsientos.get(46).getStatus());
        changeColorSeatPerStatus(F8, allAsientos.get(47).getStatus());
        changeColorSeatPerStatus(F9, allAsientos.get(48).getStatus());
        changeColorSeatPerStatus(F10, allAsientos.get(49).getStatus());
        changeColorSeatPerStatus(F11, allAsientos.get(50).getStatus());
        changeColorSeatPerStatus(F12, allAsientos.get(51).getStatus());
        changeColorSeatPerStatus(F13, allAsientos.get(52).getStatus());
        changeColorSeatPerStatus(F14, allAsientos.get(53).getStatus());
        changeColorSeatPerStatus(F15, allAsientos.get(54).getStatus());
        changeColorSeatPerStatus(F16, allAsientos.get(55).getStatus());
        changeColorSeatPerStatus(F17, allAsientos.get(56).getStatus());
        changeColorSeatPerStatus(F18, allAsientos.get(57).getStatus());
        changeColorSeatPerStatus(F19, allAsientos.get(58).getStatus());
        changeColorSeatPerStatus(F20, allAsientos.get(59).getStatus());
        
        changeColorSeatPerStatus(E1, allAsientos.get(60).getStatus());
        changeColorSeatPerStatus(E2, allAsientos.get(61).getStatus());
        changeColorSeatPerStatus(E3, allAsientos.get(62).getStatus());
        changeColorSeatPerStatus(E4, allAsientos.get(63).getStatus());
        changeColorSeatPerStatus(E5, allAsientos.get(64).getStatus());
        changeColorSeatPerStatus(E6, allAsientos.get(65).getStatus());
        changeColorSeatPerStatus(E7, allAsientos.get(66).getStatus());
        changeColorSeatPerStatus(E8, allAsientos.get(67).getStatus());
        changeColorSeatPerStatus(E9, allAsientos.get(68).getStatus());
        changeColorSeatPerStatus(E10, allAsientos.get(69).getStatus());
        changeColorSeatPerStatus(E11, allAsientos.get(70).getStatus());
        changeColorSeatPerStatus(E12, allAsientos.get(71).getStatus());
        changeColorSeatPerStatus(E13, allAsientos.get(72).getStatus());
        changeColorSeatPerStatus(E14, allAsientos.get(73).getStatus());
        changeColorSeatPerStatus(E15, allAsientos.get(74).getStatus());
        changeColorSeatPerStatus(E16, allAsientos.get(75).getStatus());
        changeColorSeatPerStatus(E17, allAsientos.get(76).getStatus());
        changeColorSeatPerStatus(E18, allAsientos.get(77).getStatus());
        changeColorSeatPerStatus(E19, allAsientos.get(78).getStatus());
        changeColorSeatPerStatus(E20, allAsientos.get(79).getStatus());
        
        changeColorSeatPerStatus(D1, allAsientos.get(80).getStatus());
        changeColorSeatPerStatus(D2, allAsientos.get(81).getStatus());
        changeColorSeatPerStatus(D3, allAsientos.get(82).getStatus());
        changeColorSeatPerStatus(D4, allAsientos.get(83).getStatus());
        changeColorSeatPerStatus(D5, allAsientos.get(84).getStatus());
        changeColorSeatPerStatus(D6, allAsientos.get(85).getStatus());
        changeColorSeatPerStatus(D7, allAsientos.get(86).getStatus());
        changeColorSeatPerStatus(D8, allAsientos.get(87).getStatus());
        changeColorSeatPerStatus(D9, allAsientos.get(88).getStatus());
        changeColorSeatPerStatus(D10, allAsientos.get(89).getStatus());
        changeColorSeatPerStatus(D11, allAsientos.get(90).getStatus());
        changeColorSeatPerStatus(D12, allAsientos.get(91).getStatus());
        changeColorSeatPerStatus(D13, allAsientos.get(92).getStatus());
        changeColorSeatPerStatus(D14, allAsientos.get(93).getStatus());
        changeColorSeatPerStatus(D15, allAsientos.get(94).getStatus());
        changeColorSeatPerStatus(D16, allAsientos.get(95).getStatus());
        changeColorSeatPerStatus(D17, allAsientos.get(96).getStatus());
        changeColorSeatPerStatus(D18, allAsientos.get(97).getStatus());
        changeColorSeatPerStatus(D19, allAsientos.get(98).getStatus());
        changeColorSeatPerStatus(D20, allAsientos.get(99).getStatus());
        
        changeColorSeatPerStatus(C1, allAsientos.get(100).getStatus());
        changeColorSeatPerStatus(C2, allAsientos.get(101).getStatus());
        changeColorSeatPerStatus(C3, allAsientos.get(102).getStatus());
        changeColorSeatPerStatus(C4, allAsientos.get(103).getStatus());
        changeColorSeatPerStatus(C5, allAsientos.get(104).getStatus());
        changeColorSeatPerStatus(C6, allAsientos.get(105).getStatus());
        changeColorSeatPerStatus(C7, allAsientos.get(106).getStatus());
        changeColorSeatPerStatus(C8, allAsientos.get(107).getStatus());
        changeColorSeatPerStatus(C9, allAsientos.get(108).getStatus());
        changeColorSeatPerStatus(C10, allAsientos.get(109).getStatus());
        changeColorSeatPerStatus(C11, allAsientos.get(110).getStatus());
        changeColorSeatPerStatus(C12, allAsientos.get(111).getStatus());
        changeColorSeatPerStatus(C13, allAsientos.get(112).getStatus());
        changeColorSeatPerStatus(C14, allAsientos.get(113).getStatus());
        changeColorSeatPerStatus(C15, allAsientos.get(114).getStatus());
        changeColorSeatPerStatus(C16, allAsientos.get(115).getStatus());
        changeColorSeatPerStatus(C17, allAsientos.get(116).getStatus());
        changeColorSeatPerStatus(C18, allAsientos.get(117).getStatus());
        changeColorSeatPerStatus(C19, allAsientos.get(118).getStatus());
        changeColorSeatPerStatus(C20, allAsientos.get(119).getStatus());
        
        changeColorSeatPerStatus(B1, allAsientos.get(120).getStatus());
        changeColorSeatPerStatus(B2, allAsientos.get(121).getStatus());
        changeColorSeatPerStatus(B3, allAsientos.get(122).getStatus());
        changeColorSeatPerStatus(B4, allAsientos.get(123).getStatus());
        changeColorSeatPerStatus(B5, allAsientos.get(124).getStatus());
        changeColorSeatPerStatus(B6, allAsientos.get(125).getStatus());
        changeColorSeatPerStatus(B7, allAsientos.get(126).getStatus());
        changeColorSeatPerStatus(B8, allAsientos.get(127).getStatus());
        changeColorSeatPerStatus(B9, allAsientos.get(128).getStatus());
        changeColorSeatPerStatus(B10, allAsientos.get(129).getStatus());
        changeColorSeatPerStatus(B11, allAsientos.get(130).getStatus());
        changeColorSeatPerStatus(B12, allAsientos.get(131).getStatus());
        changeColorSeatPerStatus(B13, allAsientos.get(132).getStatus());
        changeColorSeatPerStatus(B14, allAsientos.get(133).getStatus());
        changeColorSeatPerStatus(B15, allAsientos.get(134).getStatus());
        changeColorSeatPerStatus(B16, allAsientos.get(135).getStatus());
        changeColorSeatPerStatus(B17, allAsientos.get(136).getStatus());
        changeColorSeatPerStatus(B18, allAsientos.get(137).getStatus());
        changeColorSeatPerStatus(B19, allAsientos.get(138).getStatus());
        changeColorSeatPerStatus(B20, allAsientos.get(139).getStatus());
        
        changeColorSeatPerStatus(A1, allAsientos.get(140).getStatus());
        changeColorSeatPerStatus(A2, allAsientos.get(141).getStatus());
        changeColorSeatPerStatus(A3, allAsientos.get(142).getStatus());
        changeColorSeatPerStatus(A4, allAsientos.get(143).getStatus());
        changeColorSeatPerStatus(A5, allAsientos.get(144).getStatus());
        changeColorSeatPerStatus(A6, allAsientos.get(145).getStatus());
        changeColorSeatPerStatus(A7, allAsientos.get(146).getStatus());
        changeColorSeatPerStatus(A8, allAsientos.get(147).getStatus());
        changeColorSeatPerStatus(A9, allAsientos.get(148).getStatus());
        changeColorSeatPerStatus(A10, allAsientos.get(149).getStatus());
        changeColorSeatPerStatus(A11, allAsientos.get(150).getStatus());
        changeColorSeatPerStatus(A12, allAsientos.get(151).getStatus());
        changeColorSeatPerStatus(A13, allAsientos.get(152).getStatus());
        changeColorSeatPerStatus(A14, allAsientos.get(153).getStatus());
        changeColorSeatPerStatus(A15, allAsientos.get(154).getStatus());
        changeColorSeatPerStatus(A16, allAsientos.get(155).getStatus());
        changeColorSeatPerStatus(A17, allAsientos.get(156).getStatus());
        changeColorSeatPerStatus(A18, allAsientos.get(157).getStatus());
        changeColorSeatPerStatus(A19, allAsientos.get(158).getStatus());
        changeColorSeatPerStatus(A20, allAsientos.get(159).getStatus());
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        E9 = new javax.swing.JButton();
        E10 = new javax.swing.JButton();
        E11 = new javax.swing.JButton();
        E12 = new javax.swing.JButton();
        E13 = new javax.swing.JButton();
        E14 = new javax.swing.JButton();
        E15 = new javax.swing.JButton();
        E16 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        E17 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        E18 = new javax.swing.JButton();
        C11 = new javax.swing.JButton();
        C12 = new javax.swing.JButton();
        C13 = new javax.swing.JButton();
        C14 = new javax.swing.JButton();
        C15 = new javax.swing.JButton();
        C16 = new javax.swing.JButton();
        C17 = new javax.swing.JButton();
        C18 = new javax.swing.JButton();
        C19 = new javax.swing.JButton();
        C20 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        H9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        H10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        H11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        H12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        H13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        H14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        H15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        H16 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        H17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        H18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        H19 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        H20 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        G9 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        G10 = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        G11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        G12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        G13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        G14 = new javax.swing.JButton();
        A15 = new javax.swing.JButton();
        G15 = new javax.swing.JButton();
        A16 = new javax.swing.JButton();
        G16 = new javax.swing.JButton();
        A17 = new javax.swing.JButton();
        G17 = new javax.swing.JButton();
        A18 = new javax.swing.JButton();
        G18 = new javax.swing.JButton();
        A19 = new javax.swing.JButton();
        G19 = new javax.swing.JButton();
        A20 = new javax.swing.JButton();
        G20 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        E19 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        E20 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        F10 = new javax.swing.JButton();
        F11 = new javax.swing.JButton();
        F12 = new javax.swing.JButton();
        F13 = new javax.swing.JButton();
        F14 = new javax.swing.JButton();
        F15 = new javax.swing.JButton();
        F16 = new javax.swing.JButton();
        D9 = new javax.swing.JButton();
        F17 = new javax.swing.JButton();
        D10 = new javax.swing.JButton();
        F18 = new javax.swing.JButton();
        D11 = new javax.swing.JButton();
        D12 = new javax.swing.JButton();
        D13 = new javax.swing.JButton();
        D14 = new javax.swing.JButton();
        D15 = new javax.swing.JButton();
        D16 = new javax.swing.JButton();
        D17 = new javax.swing.JButton();
        D18 = new javax.swing.JButton();
        F19 = new javax.swing.JButton();
        F20 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        D19 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        D20 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diamontCountLabel = new javax.swing.JLabel();
        goldCountLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        silverCountLabel = new javax.swing.JLabel();
        copperCountLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        canCountLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirmSellButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        directionTextField = new javax.swing.JTextField();
        chooseDirectionButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        E9.setText("E9");
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });

        E10.setText("E10");
        E10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E10ActionPerformed(evt);
            }
        });

        E11.setText("E11");
        E11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E11ActionPerformed(evt);
            }
        });

        E12.setText("E12");
        E12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E12ActionPerformed(evt);
            }
        });

        E13.setText("E13");
        E13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E13ActionPerformed(evt);
            }
        });

        E14.setText("E14");
        E14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E14ActionPerformed(evt);
            }
        });

        E15.setText("E15");
        E15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E15ActionPerformed(evt);
            }
        });

        E16.setText("E16");
        E16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E16ActionPerformed(evt);
            }
        });

        C9.setText("C9");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        E17.setText("E17");
        E17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E17ActionPerformed(evt);
            }
        });

        C10.setText("C10");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        E18.setText("E18");
        E18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E18ActionPerformed(evt);
            }
        });

        C11.setText("C11");
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        C12.setText("C12");
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        C13.setText("C13");
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });

        C14.setText("C14");
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });

        C15.setText("C15");
        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });

        C16.setText("C16");
        C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C16ActionPerformed(evt);
            }
        });

        C17.setText("C17");
        C17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C17ActionPerformed(evt);
            }
        });

        C18.setText("C18");
        C18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C18ActionPerformed(evt);
            }
        });

        C19.setText("C19");
        C19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C19ActionPerformed(evt);
            }
        });

        C20.setText("C20");
        C20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C20ActionPerformed(evt);
            }
        });

        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        H1.setText("H1");
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        H2.setText("H2");
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        H3.setText("H3");
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });

        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        H4.setText("H4");
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });

        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        H5.setText("H5");
        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });

        B6.setText("B6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        H6.setText("H6");
        H6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H6ActionPerformed(evt);
            }
        });

        B7.setText("B7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        H7.setText("H7");
        H7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H7ActionPerformed(evt);
            }
        });

        B8.setText("B8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        H8.setText("H8");
        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });

        B9.setText("B9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        H9.setText("H9");
        H9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H9ActionPerformed(evt);
            }
        });

        B10.setText("B10");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        H10.setText("H10");
        H10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H10ActionPerformed(evt);
            }
        });

        B11.setText("B11");
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        H11.setText("H11");
        H11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H11ActionPerformed(evt);
            }
        });

        B12.setText("B12");
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        H12.setText("H12");
        H12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H12ActionPerformed(evt);
            }
        });

        B13.setText("B13");
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        H13.setText("H13");
        H13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H13ActionPerformed(evt);
            }
        });

        B14.setText("B14");
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });

        H14.setText("H14");
        H14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H14ActionPerformed(evt);
            }
        });

        B15.setText("B15");
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        H15.setText("H15");
        H15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H15ActionPerformed(evt);
            }
        });

        B16.setText("B16");
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });

        H16.setText("H16");
        H16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H16ActionPerformed(evt);
            }
        });

        B17.setText("B17");
        B17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B17ActionPerformed(evt);
            }
        });

        H17.setText("H17");
        H17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H17ActionPerformed(evt);
            }
        });

        B18.setText("B18");
        B18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B18ActionPerformed(evt);
            }
        });

        H18.setText("H18");
        H18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H18ActionPerformed(evt);
            }
        });

        B19.setText("B19");
        B19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B19ActionPerformed(evt);
            }
        });

        H19.setText("H19");
        H19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H19ActionPerformed(evt);
            }
        });

        B20.setText("B20");
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });

        H20.setText("H20");
        H20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H20ActionPerformed(evt);
            }
        });

        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        G1.setText("G1");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        G2.setText("G2");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        G3.setText("G3");
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        G4.setText("G4");
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        G5.setText("G5");
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        A6.setText("A6");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        G6.setText("G6");
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });

        A7.setText("A7");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        G7.setText("G7");
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });

        A8.setText("A8");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        G8.setText("G8");
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });

        A9.setText("A9");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        G9.setText("G9");
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });

        A10.setText("A10");
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        G10.setText("G10");
        G10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G10ActionPerformed(evt);
            }
        });

        A11.setText("A11");
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });

        G11.setText("G11");
        G11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G11ActionPerformed(evt);
            }
        });

        A12.setText("A12");
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });

        G12.setText("G12");
        G12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G12ActionPerformed(evt);
            }
        });

        A13.setText("A13");
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });

        G13.setText("G13");
        G13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G13ActionPerformed(evt);
            }
        });

        A14.setText("A14");
        A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A14ActionPerformed(evt);
            }
        });

        G14.setText("G14");
        G14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G14ActionPerformed(evt);
            }
        });

        A15.setText("A15");
        A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A15ActionPerformed(evt);
            }
        });

        G15.setText("G15");
        G15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G15ActionPerformed(evt);
            }
        });

        A16.setText("A16");
        A16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A16ActionPerformed(evt);
            }
        });

        G16.setText("G16");
        G16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G16ActionPerformed(evt);
            }
        });

        A17.setText("A17");
        A17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A17ActionPerformed(evt);
            }
        });

        G17.setText("G17");
        G17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G17ActionPerformed(evt);
            }
        });

        A18.setText("A18");
        A18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A18ActionPerformed(evt);
            }
        });

        G18.setText("G18");
        G18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G18ActionPerformed(evt);
            }
        });

        A19.setText("A19");
        A19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A19ActionPerformed(evt);
            }
        });

        G19.setText("G19");
        G19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G19ActionPerformed(evt);
            }
        });

        A20.setText("A20");
        A20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A20ActionPerformed(evt);
            }
        });

        G20.setText("G20");
        G20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G20ActionPerformed(evt);
            }
        });

        F1.setText("F1");
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.setText("F2");
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3.setText("F3");
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        F4.setText("F4");
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F5.setText("F5");
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        F6.setText("F6");
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        E19.setText("E19");
        E19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E19ActionPerformed(evt);
            }
        });

        F7.setText("F7");
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        E20.setText("E20");
        E20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E20ActionPerformed(evt);
            }
        });

        F8.setText("F8");
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.setText("D2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D3.setText("D3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        D4.setText("D4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        D5.setText("D5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        D6.setText("D6");
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        D7.setText("D7");
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        D8.setText("D8");
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        F9.setText("F9");
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });

        F10.setText("F10");
        F10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F10ActionPerformed(evt);
            }
        });

        F11.setText("F11");
        F11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F11ActionPerformed(evt);
            }
        });

        F12.setText("F12");
        F12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F12ActionPerformed(evt);
            }
        });

        F13.setText("F13");
        F13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F13ActionPerformed(evt);
            }
        });

        F14.setText("F14");
        F14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F14ActionPerformed(evt);
            }
        });

        F15.setText("F15");
        F15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F15ActionPerformed(evt);
            }
        });

        F16.setText("F16");
        F16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F16ActionPerformed(evt);
            }
        });

        D9.setText("D9");
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        F17.setText("F17");
        F17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F17ActionPerformed(evt);
            }
        });

        D10.setText("D10");
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });

        F18.setText("F18");
        F18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F18ActionPerformed(evt);
            }
        });

        D11.setText("D11");
        D11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D11ActionPerformed(evt);
            }
        });

        D12.setText("D12");
        D12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D12ActionPerformed(evt);
            }
        });

        D13.setText("D13");
        D13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D13ActionPerformed(evt);
            }
        });

        D14.setText("D14");
        D14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D14ActionPerformed(evt);
            }
        });

        D15.setText("D15");
        D15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D15ActionPerformed(evt);
            }
        });

        D16.setText("D16");
        D16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D16ActionPerformed(evt);
            }
        });

        D17.setText("D17");
        D17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D17ActionPerformed(evt);
            }
        });

        D18.setText("D18");
        D18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D18ActionPerformed(evt);
            }
        });

        F19.setText("F19");
        F19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F19ActionPerformed(evt);
            }
        });

        F20.setText("F20");
        F20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F20ActionPerformed(evt);
            }
        });

        E1.setText("E1");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.setText("E2");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setText("E3");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setText("E4");
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        E5.setText("E5");
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        E6.setText("E6");
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        D19.setText("D19");
        D19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D19ActionPerformed(evt);
            }
        });

        E7.setText("E7");
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        D20.setText("D20");
        D20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D20ActionPerformed(evt);
            }
        });

        E8.setText("E8");
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setText("C2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setText("C3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setText("C4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setText("C5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setText("C6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setText("C7");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setText("C8");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulo de la obra");

        jLabel2.setText("Fecha y hora");

        jLabel3.setText("Diamante");

        diamontCountLabel.setText("0");

        goldCountLabel.setText("0");

        jLabel4.setText("Oro");

        jLabel5.setText("Plata");

        silverCountLabel.setText("0");

        copperCountLabel.setText("0");

        jLabel6.setText("Cobre");

        jLabel8.setText("Lata");

        canCountLabel.setText("0");

        totalLabel.setText("0");

        jLabel7.setText("Total a pagar");

        confirmSellButton.setText("Confirmar compra");
        confirmSellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmSellButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Ruta a guardar los tickets");

        directionTextField.setEnabled(false);

        chooseDirectionButton.setText("Seleccionar ruta");
        chooseDirectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDirectionButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre del pdf donde estaran los tickets");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(D1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(E1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E15)
                        .addGap(12, 12, 12)
                        .addComponent(E16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(F1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F2)
                        .addGap(12, 12, 12)
                        .addComponent(F3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(F6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(G1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(H1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8))
                                            .addGap(30, 30, 30)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(canCountLabel)
                                                .addComponent(copperCountLabel)
                                                .addComponent(silverCountLabel)
                                                .addComponent(goldCountLabel)
                                                .addComponent(diamontCountLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(totalLabel))
                                        .addComponent(jLabel2)
                                        .addComponent(confirmSellButton)))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(directionTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chooseDirectionButton)
                                        .addGap(121, 121, 121))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(H1)
                    .addComponent(H2)
                    .addComponent(H3)
                    .addComponent(H4)
                    .addComponent(H5)
                    .addComponent(H6)
                    .addComponent(H7)
                    .addComponent(H8)
                    .addComponent(H9)
                    .addComponent(H10)
                    .addComponent(H11)
                    .addComponent(H12)
                    .addComponent(H13)
                    .addComponent(H14)
                    .addComponent(H15)
                    .addComponent(H16)
                    .addComponent(H17)
                    .addComponent(H18)
                    .addComponent(H19)
                    .addComponent(H20))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1)
                    .addComponent(G2)
                    .addComponent(G3)
                    .addComponent(G4)
                    .addComponent(G5)
                    .addComponent(G6)
                    .addComponent(G7)
                    .addComponent(G8)
                    .addComponent(G9)
                    .addComponent(G10)
                    .addComponent(G11)
                    .addComponent(G12)
                    .addComponent(G13)
                    .addComponent(G14)
                    .addComponent(G15)
                    .addComponent(G16)
                    .addComponent(G17)
                    .addComponent(G18)
                    .addComponent(G19)
                    .addComponent(G20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F1)
                    .addComponent(F2)
                    .addComponent(F3)
                    .addComponent(F4)
                    .addComponent(F5)
                    .addComponent(F6)
                    .addComponent(F7)
                    .addComponent(F8)
                    .addComponent(F9)
                    .addComponent(F10)
                    .addComponent(F11)
                    .addComponent(F12)
                    .addComponent(F13)
                    .addComponent(F14)
                    .addComponent(F15)
                    .addComponent(F16)
                    .addComponent(F17)
                    .addComponent(F18)
                    .addComponent(F19)
                    .addComponent(F20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E1)
                    .addComponent(E2)
                    .addComponent(E3)
                    .addComponent(E4)
                    .addComponent(E5)
                    .addComponent(E6)
                    .addComponent(E7)
                    .addComponent(E8)
                    .addComponent(E9)
                    .addComponent(E10)
                    .addComponent(E11)
                    .addComponent(E12)
                    .addComponent(E13)
                    .addComponent(E14)
                    .addComponent(E15)
                    .addComponent(E16)
                    .addComponent(E17)
                    .addComponent(E18)
                    .addComponent(E19)
                    .addComponent(E20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D1)
                    .addComponent(D2)
                    .addComponent(D3)
                    .addComponent(D4)
                    .addComponent(D5)
                    .addComponent(D6)
                    .addComponent(D7)
                    .addComponent(D8)
                    .addComponent(D9)
                    .addComponent(D10)
                    .addComponent(D11)
                    .addComponent(D12)
                    .addComponent(D13)
                    .addComponent(D14)
                    .addComponent(D15)
                    .addComponent(D16)
                    .addComponent(D17)
                    .addComponent(D18)
                    .addComponent(D19)
                    .addComponent(D20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(C3)
                    .addComponent(C4)
                    .addComponent(C5)
                    .addComponent(C6)
                    .addComponent(C7)
                    .addComponent(C8)
                    .addComponent(C9)
                    .addComponent(C10)
                    .addComponent(C11)
                    .addComponent(C12)
                    .addComponent(C13)
                    .addComponent(C14)
                    .addComponent(C15)
                    .addComponent(C16)
                    .addComponent(C17)
                    .addComponent(C18)
                    .addComponent(C19)
                    .addComponent(C20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(B2)
                    .addComponent(B3)
                    .addComponent(B4)
                    .addComponent(B5)
                    .addComponent(B6)
                    .addComponent(B7)
                    .addComponent(B8)
                    .addComponent(B9)
                    .addComponent(B10)
                    .addComponent(B11)
                    .addComponent(B12)
                    .addComponent(B13)
                    .addComponent(B14)
                    .addComponent(B15)
                    .addComponent(B16)
                    .addComponent(B17)
                    .addComponent(B18)
                    .addComponent(B19)
                    .addComponent(B20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(A2)
                    .addComponent(A3)
                    .addComponent(A4)
                    .addComponent(A5)
                    .addComponent(A6)
                    .addComponent(A7)
                    .addComponent(A8)
                    .addComponent(A9)
                    .addComponent(A10)
                    .addComponent(A11)
                    .addComponent(A12)
                    .addComponent(A13)
                    .addComponent(A14)
                    .addComponent(A15)
                    .addComponent(A16)
                    .addComponent(A17)
                    .addComponent(A18)
                    .addComponent(A19)
                    .addComponent(A20))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(diamontCountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(goldCountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(silverCountLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(directionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseDirectionButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(copperCountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(canCountLabel)
                    .addComponent(jLabel10)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalLabel))
                .addGap(18, 18, 18)
                .addComponent(confirmSellButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
        sellController.addSellSeat(E9);
    }//GEN-LAST:event_E9ActionPerformed

    private void E10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E10ActionPerformed
        sellController.addSellSeat(E10);
    }//GEN-LAST:event_E10ActionPerformed

    private void E11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E11ActionPerformed
        sellController.addSellSeat(E11);
    }//GEN-LAST:event_E11ActionPerformed

    private void E12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E12ActionPerformed
        sellController.addSellSeat(E12);
    }//GEN-LAST:event_E12ActionPerformed

    private void E13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E13ActionPerformed
        sellController.addSellSeat(E13);
    }//GEN-LAST:event_E13ActionPerformed

    private void E14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E14ActionPerformed
        sellController.addSellSeat(E14);
    }//GEN-LAST:event_E14ActionPerformed

    private void E15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E15ActionPerformed
        sellController.addSellSeat(E15);
    }//GEN-LAST:event_E15ActionPerformed

    private void E16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E16ActionPerformed
        sellController.addSellSeat(E16);
    }//GEN-LAST:event_E16ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        sellController.addSellSeat(C9);
    }//GEN-LAST:event_C9ActionPerformed

    private void E17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E17ActionPerformed
        sellController.addSellSeat(E17);
    }//GEN-LAST:event_E17ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        sellController.addSellSeat(C10);
    }//GEN-LAST:event_C10ActionPerformed

    private void E18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E18ActionPerformed
        sellController.addSellSeat(E18);
    }//GEN-LAST:event_E18ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        sellController.addSellSeat(C11);
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        sellController.addSellSeat(C12);
    }//GEN-LAST:event_C12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        sellController.addSellSeat(C13);
    }//GEN-LAST:event_C13ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
        sellController.addSellSeat(C14);
    }//GEN-LAST:event_C14ActionPerformed

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
        sellController.addSellSeat(C15);
    }//GEN-LAST:event_C15ActionPerformed

    private void C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C16ActionPerformed
        sellController.addSellSeat(C16);
    }//GEN-LAST:event_C16ActionPerformed

    private void C17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C17ActionPerformed
        sellController.addSellSeat(C17);
    }//GEN-LAST:event_C17ActionPerformed

    private void C18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C18ActionPerformed
        sellController.addSellSeat(C18);
    }//GEN-LAST:event_C18ActionPerformed

    private void C19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C19ActionPerformed
        sellController.addSellSeat(C19);
    }//GEN-LAST:event_C19ActionPerformed

    private void C20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C20ActionPerformed
        sellController.addSellSeat(C20);
    }//GEN-LAST:event_C20ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        sellController.addSellSeat(B1);
    }//GEN-LAST:event_B1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        sellController.addSellSeat(H1);
    }//GEN-LAST:event_H1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        sellController.addSellSeat(B2);
    }//GEN-LAST:event_B2ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        sellController.addSellSeat(H2);
    }//GEN-LAST:event_H2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        sellController.addSellSeat(B3);
    }//GEN-LAST:event_B3ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        sellController.addSellSeat(H3);
    }//GEN-LAST:event_H3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        sellController.addSellSeat(B4);
    }//GEN-LAST:event_B4ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        sellController.addSellSeat(H4);
    }//GEN-LAST:event_H4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        sellController.addSellSeat(B5);
    }//GEN-LAST:event_B5ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        sellController.addSellSeat(H5);
    }//GEN-LAST:event_H5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        sellController.addSellSeat(B6);
    }//GEN-LAST:event_B6ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
        sellController.addSellSeat(H6);
    }//GEN-LAST:event_H6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        sellController.addSellSeat(B7);
    }//GEN-LAST:event_B7ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
        sellController.addSellSeat(H7);
    }//GEN-LAST:event_H7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        sellController.addSellSeat(B8);
    }//GEN-LAST:event_B8ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        sellController.addSellSeat(H8);
    }//GEN-LAST:event_H8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        sellController.addSellSeat(B9);
    }//GEN-LAST:event_B9ActionPerformed

    private void H9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H9ActionPerformed
        sellController.addSellSeat(H9);
    }//GEN-LAST:event_H9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        sellController.addSellSeat(B10);
    }//GEN-LAST:event_B10ActionPerformed

    private void H10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H10ActionPerformed
        sellController.addSellSeat(H10);
    }//GEN-LAST:event_H10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        sellController.addSellSeat(B11);
    }//GEN-LAST:event_B11ActionPerformed

    private void H11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H11ActionPerformed
        sellController.addSellSeat(H11);
    }//GEN-LAST:event_H11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        sellController.addSellSeat(B12);
    }//GEN-LAST:event_B12ActionPerformed

    private void H12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H12ActionPerformed
        sellController.addSellSeat(H12);
    }//GEN-LAST:event_H12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        sellController.addSellSeat(B13);
    }//GEN-LAST:event_B13ActionPerformed

    private void H13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H13ActionPerformed
        sellController.addSellSeat(H13);
    }//GEN-LAST:event_H13ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
        sellController.addSellSeat(B14);
    }//GEN-LAST:event_B14ActionPerformed

    private void H14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H14ActionPerformed
        sellController.addSellSeat(H14);
    }//GEN-LAST:event_H14ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        sellController.addSellSeat(B15);
    }//GEN-LAST:event_B15ActionPerformed

    private void H15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H15ActionPerformed
        sellController.addSellSeat(H15);
    }//GEN-LAST:event_H15ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
        sellController.addSellSeat(B16);
    }//GEN-LAST:event_B16ActionPerformed

    private void H16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H16ActionPerformed
        sellController.addSellSeat(H16);
    }//GEN-LAST:event_H16ActionPerformed

    private void B17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B17ActionPerformed
        sellController.addSellSeat(B17);
    }//GEN-LAST:event_B17ActionPerformed

    private void H17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H17ActionPerformed
        sellController.addSellSeat(H17);
    }//GEN-LAST:event_H17ActionPerformed

    private void B18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B18ActionPerformed
        sellController.addSellSeat(B18);
    }//GEN-LAST:event_B18ActionPerformed

    private void H18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H18ActionPerformed
        sellController.addSellSeat(H18);
    }//GEN-LAST:event_H18ActionPerformed

    private void B19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B19ActionPerformed
        sellController.addSellSeat(B19);
    }//GEN-LAST:event_B19ActionPerformed

    private void H19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H19ActionPerformed
        sellController.addSellSeat(H19);
    }//GEN-LAST:event_H19ActionPerformed

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        sellController.addSellSeat(B20);
    }//GEN-LAST:event_B20ActionPerformed

    private void H20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H20ActionPerformed
        sellController.addSellSeat(H20);
    }//GEN-LAST:event_H20ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        sellController.addSellSeat(A1);
    }//GEN-LAST:event_A1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        sellController.addSellSeat(G1);
    }//GEN-LAST:event_G1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        sellController.addSellSeat(A2);
    }//GEN-LAST:event_A2ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        sellController.addSellSeat(G2);
    }//GEN-LAST:event_G2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        sellController.addSellSeat(A3);
    }//GEN-LAST:event_A3ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        sellController.addSellSeat(G3);
    }//GEN-LAST:event_G3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        sellController.addSellSeat(A4);
    }//GEN-LAST:event_A4ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        sellController.addSellSeat(G4);
    }//GEN-LAST:event_G4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        sellController.addSellSeat(A5);
    }//GEN-LAST:event_A5ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        sellController.addSellSeat(G5);
    }//GEN-LAST:event_G5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        sellController.addSellSeat(A6);
    }//GEN-LAST:event_A6ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
        sellController.addSellSeat(G6);
    }//GEN-LAST:event_G6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        sellController.addSellSeat(A7);
    }//GEN-LAST:event_A7ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        sellController.addSellSeat(G7);
    }//GEN-LAST:event_G7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        sellController.addSellSeat(A8);
    }//GEN-LAST:event_A8ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        sellController.addSellSeat(G8);
    }//GEN-LAST:event_G8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        sellController.addSellSeat(A9);
    }//GEN-LAST:event_A9ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed
        sellController.addSellSeat(G9);
    }//GEN-LAST:event_G9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        sellController.addSellSeat(A10);
    }//GEN-LAST:event_A10ActionPerformed

    private void G10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G10ActionPerformed
        sellController.addSellSeat(G10);
    }//GEN-LAST:event_G10ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        sellController.addSellSeat(A11);
    }//GEN-LAST:event_A11ActionPerformed

    private void G11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G11ActionPerformed
        sellController.addSellSeat(G11);
    }//GEN-LAST:event_G11ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        sellController.addSellSeat(A12);
    }//GEN-LAST:event_A12ActionPerformed

    private void G12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G12ActionPerformed
        sellController.addSellSeat(G12);
    }//GEN-LAST:event_G12ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        sellController.addSellSeat(A13);
    }//GEN-LAST:event_A13ActionPerformed

    private void G13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G13ActionPerformed
        sellController.addSellSeat(G13);
    }//GEN-LAST:event_G13ActionPerformed

    private void A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A14ActionPerformed
        sellController.addSellSeat(A14);
    }//GEN-LAST:event_A14ActionPerformed

    private void G14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G14ActionPerformed
        sellController.addSellSeat(G14);
    }//GEN-LAST:event_G14ActionPerformed

    private void A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A15ActionPerformed
        sellController.addSellSeat(A15);
    }//GEN-LAST:event_A15ActionPerformed

    private void G15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G15ActionPerformed
        sellController.addSellSeat(G15);
    }//GEN-LAST:event_G15ActionPerformed

    private void A16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A16ActionPerformed
        sellController.addSellSeat(A16);
    }//GEN-LAST:event_A16ActionPerformed

    private void G16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G16ActionPerformed
        sellController.addSellSeat(G16);
    }//GEN-LAST:event_G16ActionPerformed

    private void A17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A17ActionPerformed
        sellController.addSellSeat(A17);
    }//GEN-LAST:event_A17ActionPerformed

    private void G17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G17ActionPerformed
        sellController.addSellSeat(G17);
    }//GEN-LAST:event_G17ActionPerformed

    private void A18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A18ActionPerformed
        sellController.addSellSeat(A18);
    }//GEN-LAST:event_A18ActionPerformed

    private void G18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G18ActionPerformed
        sellController.addSellSeat(G18);
    }//GEN-LAST:event_G18ActionPerformed

    private void A19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A19ActionPerformed
        sellController.addSellSeat(A19);
    }//GEN-LAST:event_A19ActionPerformed

    private void G19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G19ActionPerformed
        sellController.addSellSeat(G19);
    }//GEN-LAST:event_G19ActionPerformed

    private void A20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A20ActionPerformed
        sellController.addSellSeat(A20);
    }//GEN-LAST:event_A20ActionPerformed

    private void G20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G20ActionPerformed
        sellController.addSellSeat(G20);
    }//GEN-LAST:event_G20ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        sellController.addSellSeat(F1);
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        sellController.addSellSeat(F2);
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        sellController.addSellSeat(F3);
    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        sellController.addSellSeat(F4);
    }//GEN-LAST:event_F4ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        sellController.addSellSeat(F5);
    }//GEN-LAST:event_F5ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        sellController.addSellSeat(F6);
    }//GEN-LAST:event_F6ActionPerformed

    private void E19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E19ActionPerformed
        sellController.addSellSeat(E19);
    }//GEN-LAST:event_E19ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        sellController.addSellSeat(F7);
    }//GEN-LAST:event_F7ActionPerformed

    private void E20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E20ActionPerformed
        sellController.addSellSeat(E20);
    }//GEN-LAST:event_E20ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        sellController.addSellSeat(F8);
    }//GEN-LAST:event_F8ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        sellController.addSellSeat(D1);
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        sellController.addSellSeat(D2);
    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        sellController.addSellSeat(D3);
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        sellController.addSellSeat(D4);
    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        sellController.addSellSeat(D5);
    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        sellController.addSellSeat(D6);
    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        sellController.addSellSeat(D7);
    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        sellController.addSellSeat(D8);
    }//GEN-LAST:event_D8ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
        sellController.addSellSeat(F9);
    }//GEN-LAST:event_F9ActionPerformed

    private void F10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F10ActionPerformed
        sellController.addSellSeat(F10);
    }//GEN-LAST:event_F10ActionPerformed

    private void F11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F11ActionPerformed
        sellController.addSellSeat(F11);
    }//GEN-LAST:event_F11ActionPerformed

    private void F12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F12ActionPerformed
        sellController.addSellSeat(F12);
    }//GEN-LAST:event_F12ActionPerformed

    private void F13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F13ActionPerformed
        sellController.addSellSeat(F13);
    }//GEN-LAST:event_F13ActionPerformed

    private void F14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F14ActionPerformed
        sellController.addSellSeat(F14);
    }//GEN-LAST:event_F14ActionPerformed

    private void F15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F15ActionPerformed
        sellController.addSellSeat(F15);
    }//GEN-LAST:event_F15ActionPerformed

    private void F16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F16ActionPerformed
        sellController.addSellSeat(F16);
    }//GEN-LAST:event_F16ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        sellController.addSellSeat(D9);
    }//GEN-LAST:event_D9ActionPerformed

    private void F17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F17ActionPerformed
        sellController.addSellSeat(F17);
    }//GEN-LAST:event_F17ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        sellController.addSellSeat(D10);
    }//GEN-LAST:event_D10ActionPerformed

    private void F18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F18ActionPerformed
        sellController.addSellSeat(F18);
    }//GEN-LAST:event_F18ActionPerformed

    private void D11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D11ActionPerformed
        sellController.addSellSeat(D11);
    }//GEN-LAST:event_D11ActionPerformed

    private void D12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D12ActionPerformed
        sellController.addSellSeat(D12);
    }//GEN-LAST:event_D12ActionPerformed

    private void D13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D13ActionPerformed
        sellController.addSellSeat(D13);
    }//GEN-LAST:event_D13ActionPerformed

    private void D14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D14ActionPerformed
        sellController.addSellSeat(D14);
    }//GEN-LAST:event_D14ActionPerformed

    private void D15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D15ActionPerformed
        sellController.addSellSeat(D15);
    }//GEN-LAST:event_D15ActionPerformed

    private void D16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D16ActionPerformed
        sellController.addSellSeat(D16);
    }//GEN-LAST:event_D16ActionPerformed

    private void D17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D17ActionPerformed
        sellController.addSellSeat(D17);
    }//GEN-LAST:event_D17ActionPerformed

    private void D18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D18ActionPerformed
        sellController.addSellSeat(D18);
    }//GEN-LAST:event_D18ActionPerformed

    private void F19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F19ActionPerformed
        sellController.addSellSeat(F19);
    }//GEN-LAST:event_F19ActionPerformed

    private void F20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F20ActionPerformed
        sellController.addSellSeat(F20);
    }//GEN-LAST:event_F20ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        sellController.addSellSeat(E1);
    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        sellController.addSellSeat(E2);
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        sellController.addSellSeat(E3);
    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        sellController.addSellSeat(E4);
    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        sellController.addSellSeat(E5);
    }//GEN-LAST:event_E5ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        sellController.addSellSeat(E6);
    }//GEN-LAST:event_E6ActionPerformed

    private void D19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D19ActionPerformed
        sellController.addSellSeat(D19);
    }//GEN-LAST:event_D19ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        sellController.addSellSeat(E7);
    }//GEN-LAST:event_E7ActionPerformed

    private void D20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D20ActionPerformed
        sellController.addSellSeat(D20);
    }//GEN-LAST:event_D20ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        sellController.addSellSeat(E8);
    }//GEN-LAST:event_E8ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        sellController.addSellSeat(C1);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        sellController.addSellSeat(C2);
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        sellController.addSellSeat(C3);
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        sellController.addSellSeat(C4);
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        sellController.addSellSeat(C5);
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        sellController.addSellSeat(C6);
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        sellController.addSellSeat(C7);
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        sellController.addSellSeat(C8);
    }//GEN-LAST:event_C8ActionPerformed

    private void confirmSellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmSellButtonActionPerformed
        if(!nameTextField.getText().isEmpty() && !directionTextField.getText().isEmpty()){
            try {
                sellController.doSell(directionTextField.getText(), nameTextField.getText());
            } catch (IOException ex) {
                Logger.getLogger(SellController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(SellController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Nombre del archivo y/o ruta vacia");
        }
        
    }//GEN-LAST:event_confirmSellButtonActionPerformed

    private void chooseDirectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDirectionButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int option = fileChooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String directory = fileChooser.getSelectedFile().getAbsolutePath();
            directionTextField.setText(directory);
        }
    }//GEN-LAST:event_chooseDirectionButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SellView dialog = new SellView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton A1;
    public javax.swing.JButton A10;
    public javax.swing.JButton A11;
    public javax.swing.JButton A12;
    public javax.swing.JButton A13;
    public javax.swing.JButton A14;
    public javax.swing.JButton A15;
    public javax.swing.JButton A16;
    public javax.swing.JButton A17;
    public javax.swing.JButton A18;
    public javax.swing.JButton A19;
    public javax.swing.JButton A2;
    public javax.swing.JButton A20;
    public javax.swing.JButton A3;
    public javax.swing.JButton A4;
    public javax.swing.JButton A5;
    public javax.swing.JButton A6;
    public javax.swing.JButton A7;
    public javax.swing.JButton A8;
    public javax.swing.JButton A9;
    public javax.swing.JButton B1;
    public javax.swing.JButton B10;
    public javax.swing.JButton B11;
    public javax.swing.JButton B12;
    public javax.swing.JButton B13;
    public javax.swing.JButton B14;
    public javax.swing.JButton B15;
    public javax.swing.JButton B16;
    public javax.swing.JButton B17;
    public javax.swing.JButton B18;
    public javax.swing.JButton B19;
    public javax.swing.JButton B2;
    public javax.swing.JButton B20;
    public javax.swing.JButton B3;
    public javax.swing.JButton B4;
    public javax.swing.JButton B5;
    public javax.swing.JButton B6;
    public javax.swing.JButton B7;
    public javax.swing.JButton B8;
    public javax.swing.JButton B9;
    public javax.swing.JButton C1;
    public javax.swing.JButton C10;
    public javax.swing.JButton C11;
    public javax.swing.JButton C12;
    public javax.swing.JButton C13;
    public javax.swing.JButton C14;
    public javax.swing.JButton C15;
    public javax.swing.JButton C16;
    public javax.swing.JButton C17;
    public javax.swing.JButton C18;
    public javax.swing.JButton C19;
    public javax.swing.JButton C2;
    public javax.swing.JButton C20;
    public javax.swing.JButton C3;
    public javax.swing.JButton C4;
    public javax.swing.JButton C5;
    public javax.swing.JButton C6;
    public javax.swing.JButton C7;
    public javax.swing.JButton C8;
    public javax.swing.JButton C9;
    public javax.swing.JButton D1;
    public javax.swing.JButton D10;
    public javax.swing.JButton D11;
    public javax.swing.JButton D12;
    public javax.swing.JButton D13;
    public javax.swing.JButton D14;
    public javax.swing.JButton D15;
    public javax.swing.JButton D16;
    public javax.swing.JButton D17;
    public javax.swing.JButton D18;
    public javax.swing.JButton D19;
    public javax.swing.JButton D2;
    public javax.swing.JButton D20;
    public javax.swing.JButton D3;
    public javax.swing.JButton D4;
    public javax.swing.JButton D5;
    public javax.swing.JButton D6;
    public javax.swing.JButton D7;
    public javax.swing.JButton D8;
    public javax.swing.JButton D9;
    public javax.swing.JButton E1;
    public javax.swing.JButton E10;
    public javax.swing.JButton E11;
    public javax.swing.JButton E12;
    public javax.swing.JButton E13;
    public javax.swing.JButton E14;
    public javax.swing.JButton E15;
    public javax.swing.JButton E16;
    public javax.swing.JButton E17;
    public javax.swing.JButton E18;
    public javax.swing.JButton E19;
    public javax.swing.JButton E2;
    public javax.swing.JButton E20;
    public javax.swing.JButton E3;
    public javax.swing.JButton E4;
    public javax.swing.JButton E5;
    public javax.swing.JButton E6;
    public javax.swing.JButton E7;
    public javax.swing.JButton E8;
    public javax.swing.JButton E9;
    public javax.swing.JButton F1;
    public javax.swing.JButton F10;
    public javax.swing.JButton F11;
    public javax.swing.JButton F12;
    public javax.swing.JButton F13;
    public javax.swing.JButton F14;
    public javax.swing.JButton F15;
    public javax.swing.JButton F16;
    public javax.swing.JButton F17;
    public javax.swing.JButton F18;
    public javax.swing.JButton F19;
    public javax.swing.JButton F2;
    public javax.swing.JButton F20;
    public javax.swing.JButton F3;
    public javax.swing.JButton F4;
    public javax.swing.JButton F5;
    public javax.swing.JButton F6;
    public javax.swing.JButton F7;
    public javax.swing.JButton F8;
    public javax.swing.JButton F9;
    public javax.swing.JButton G1;
    public javax.swing.JButton G10;
    public javax.swing.JButton G11;
    public javax.swing.JButton G12;
    public javax.swing.JButton G13;
    public javax.swing.JButton G14;
    public javax.swing.JButton G15;
    public javax.swing.JButton G16;
    public javax.swing.JButton G17;
    public javax.swing.JButton G18;
    public javax.swing.JButton G19;
    public javax.swing.JButton G2;
    public javax.swing.JButton G20;
    public javax.swing.JButton G3;
    public javax.swing.JButton G4;
    public javax.swing.JButton G5;
    public javax.swing.JButton G6;
    public javax.swing.JButton G7;
    public javax.swing.JButton G8;
    public javax.swing.JButton G9;
    public javax.swing.JButton H1;
    public javax.swing.JButton H10;
    public javax.swing.JButton H11;
    public javax.swing.JButton H12;
    public javax.swing.JButton H13;
    public javax.swing.JButton H14;
    public javax.swing.JButton H15;
    public javax.swing.JButton H16;
    public javax.swing.JButton H17;
    public javax.swing.JButton H18;
    public javax.swing.JButton H19;
    public javax.swing.JButton H2;
    public javax.swing.JButton H20;
    public javax.swing.JButton H3;
    public javax.swing.JButton H4;
    public javax.swing.JButton H5;
    public javax.swing.JButton H6;
    public javax.swing.JButton H7;
    public javax.swing.JButton H8;
    public javax.swing.JButton H9;
    public javax.swing.JLabel canCountLabel;
    private javax.swing.JButton chooseDirectionButton;
    public javax.swing.JButton confirmSellButton;
    public javax.swing.JLabel copperCountLabel;
    public javax.swing.JLabel diamontCountLabel;
    private javax.swing.JTextField directionTextField;
    public javax.swing.JLabel goldCountLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextField;
    public javax.swing.JLabel silverCountLabel;
    public javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

}
