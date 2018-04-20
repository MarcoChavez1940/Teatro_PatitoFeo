/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author marco
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        watchShowsMenu = new javax.swing.JMenuItem();
        addShowsMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        watchFunctionsMenu = new javax.swing.JMenuItem();
        addFunctionMenu = new javax.swing.JMenuItem();
        updateFunctionMenu = new javax.swing.JMenuItem();
        printFunctionsMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sellMenu = new javax.swing.JMenuItem();
        cancelMenu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        reportMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teatro Patito Feo");
        setResizable(false);

        welcomeLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        welcomeLabel.setText("Bienvenido al Teatro Patito Feo");

        jMenu1.setText("Admin");

        jMenu3.setText("Shows");

        watchShowsMenu.setText("Ver");
        watchShowsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchShowsMenuActionPerformed(evt);
            }
        });
        jMenu3.add(watchShowsMenu);

        addShowsMenu.setText("Crear");
        addShowsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addShowsMenuActionPerformed(evt);
            }
        });
        jMenu3.add(addShowsMenu);

        jMenu1.add(jMenu3);

        jMenu4.setText("Funciones");

        watchFunctionsMenu.setText("Ver");
        watchFunctionsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchFunctionsMenuActionPerformed(evt);
            }
        });
        jMenu4.add(watchFunctionsMenu);

        addFunctionMenu.setText("Crear");
        jMenu4.add(addFunctionMenu);

        updateFunctionMenu.setText("Modificar");
        jMenu4.add(updateFunctionMenu);

        printFunctionsMenu.setText("Imprimir calendario");
        jMenu4.add(printFunctionsMenu);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Venta");

        sellMenu.setText("Vender boletos");
        jMenu2.add(sellMenu);

        cancelMenu.setText("Cancelar boletos");
        jMenu2.add(cancelMenu);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Reportes");

        reportMenu.setText("Reportes por obra");
        jMenu5.add(reportMenu);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void watchShowsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchShowsMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_watchShowsMenuActionPerformed

    private void addShowsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addShowsMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addShowsMenuActionPerformed

    private void watchFunctionsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchFunctionsMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_watchFunctionsMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem addFunctionMenu;
    public javax.swing.JMenuItem addShowsMenu;
    public javax.swing.JMenuItem cancelMenu;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem printFunctionsMenu;
    public javax.swing.JMenuItem reportMenu;
    public javax.swing.JMenuItem sellMenu;
    public javax.swing.JMenuItem updateFunctionMenu;
    public javax.swing.JMenuItem watchFunctionsMenu;
    public javax.swing.JMenuItem watchShowsMenu;
    public javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}