/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.awt.Color;


/**
 *
 * @author Rumyn
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        btn_Empresa.setBackground(Color.DARK_GRAY);
        btn_GDB.setBackground(Color.DARK_GRAY);
        btn_Salir.setBackground(Color.DARK_GRAY);
        btn_Ventas.setBackground(Color.DARK_GRAY);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Empresa = new javax.swing.JButton();
        btn_GDB = new javax.swing.JButton();
        btn_Ventas = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setForeground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        btn_Empresa.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Empresa.setForeground(new java.awt.Color(204, 204, 204));
        btn_Empresa.setText("Empresa");
        btn_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmpresaActionPerformed(evt);
            }
        });

        btn_GDB.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_GDB.setForeground(new java.awt.Color(204, 204, 204));
        btn_GDB.setText("Gestionar DB");
        btn_GDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GDBActionPerformed(evt);
            }
        });

        btn_Ventas.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Ventas.setForeground(new java.awt.Color(204, 204, 204));
        btn_Ventas.setText("Ventas");

        btn_Salir.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 102, 102));
        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_GDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(btn_Empresa)
                .addGap(18, 18, 18)
                .addComponent(btn_GDB)
                .addGap(18, 18, 18)
                .addComponent(btn_Ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GDBActionPerformed

        this.hide();
        Menu_db menu = new Menu_db();
        menu.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GDBActionPerformed

    private void btn_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmpresaActionPerformed

        Empresa em = new Empresa();
        em.show();
        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EmpresaActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed

        System.exit(0);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Empresa;
    private javax.swing.JButton btn_GDB;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Ventas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
