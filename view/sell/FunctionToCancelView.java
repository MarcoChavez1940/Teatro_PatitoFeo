/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sell;

import controller.sell.CancelTicketController;
import controller.sell.FunctionToCancelController;
import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class FunctionToCancelView extends javax.swing.JDialog {

    FunctionToCancelController functionToCancelController;
    
    /**
     * Creates new form FunctionToCancelView
     */
    public FunctionToCancelView(java.awt.Frame parent, boolean modal, FunctionToCancelController controller) {
        super(parent, modal);
        initComponents();
        this.functionToCancelController = controller;
        functionToCancelController.getFunctionsToSell(tableFunctions);
        this.setResizable(false);
    }

    private FunctionToCancelView(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableFunctions = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cancelTicketButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableFunctions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "fecha", "hora comiezo", "show"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFunctions);

        jLabel2.setText("Seleccione primero una funcion y proceda cancelar los boletos deseados.");

        cancelTicketButton.setText("Cancelar boletos");
        cancelTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(cancelTicketButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelTicketButton)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTicketButtonActionPerformed
        int functionSelected = tableFunctions.getSelectedRow();
            
        if(functionSelected != -1){
            
            Date dateFunction = (Date) tableFunctions.getValueAt(functionSelected, 1);
            java.sql.Date currentDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                       
            long diff = Math.abs(dateFunction.getTime() - currentDate.getTime());
            long diffDays = diff / (24 * 60 * 60 * 1000);
            
            if(diffDays > 2){
                int idFunction = (int) tableFunctions.getValueAt(functionSelected, 0);            
                functionToCancelController.cancelTicketController = new CancelTicketController(this, idFunction);
                return;
            }
            
            if(diffDays + 1 == 2){
                Time timeFunction = (Time) tableFunctions.getValueAt(functionSelected, 2);
                java.sql.Time currentTime = new java.sql.Time(Calendar.getInstance().getTimeInMillis());
                
                int differenceHours = timeFunction.getHours() - currentTime.getHours();
                int differenceMinutes = timeFunction.getMinutes() - currentTime.getMinutes();
                
                if(differenceHours >= 0 && differenceMinutes >=0){
                    //CASO BUENO
                    int idFunction = (int) tableFunctions.getValueAt(functionSelected, 0);            
                    functionToCancelController.cancelTicketController = new CancelTicketController(this, idFunction);
                }else{
                    JOptionPane.showMessageDialog(this, "Ya no se encuentra dentro de las 48 horas \n"
                        + "permitidas para cancelaciones, disculpe :c");
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Ya no se encuentra dentro de las 48 horas \n"
                        + "permitidas para cancelaciones, disculpe :c");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione primero una funcion");
        }
    }//GEN-LAST:event_cancelTicketButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FunctionToCancelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunctionToCancelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunctionToCancelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunctionToCancelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FunctionToCancelView dialog = new FunctionToCancelView(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton cancelTicketButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableFunctions;
    // End of variables declaration//GEN-END:variables
}