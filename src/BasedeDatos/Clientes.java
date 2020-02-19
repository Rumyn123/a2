/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rumyn
 */
public class Clientes extends javax.swing.JFrame {

    String id = null;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
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
        jTable1 = new javax.swing.JTable();
        btn_NCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Clientes = new javax.swing.JTable();
        btn_MCliente = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_NCliente.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_NCliente.setForeground(new java.awt.Color(102, 255, 102));
        btn_NCliente.setText("Nuevo Cliente");
        btn_NCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NClienteActionPerformed(evt);
            }
        });

        tabla_Clientes.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        tabla_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_Clientes.setRowHeight(100);
        jScrollPane2.setViewportView(tabla_Clientes);

        btn_MCliente.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_MCliente.setForeground(new java.awt.Color(51, 153, 255));
        btn_MCliente.setText("Modificar Cliente");
        btn_MCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MClienteActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 51, 51));
        btn_Salir.setText("REGRESAR");
        btn_Salir.setActionCommand("REGRESAR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_Actualizar.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Actualizar.setForeground(new java.awt.Color(255, 102, 102));
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_NCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(btn_MCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_Actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_NCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_MCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NClienteActionPerformed

        Cliente_m cli = new Cliente_m();
        cli.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NClienteActionPerformed

    private void btn_MClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MClienteActionPerformed

        DefaultTableModel dt = (DefaultTableModel) tabla_Clientes.getModel();
        try{
            if(tabla_Clientes.getSelectedRow() != (-1)){
                id = dt.getValueAt(tabla_Clientes.getSelectedRow(), 0).toString();

                if (id != null){
                    Cliente_m cli = new Cliente_m(id);
                    cli.show(); 
                } else {
                    Metodos.mensaje("Actualice primero la tabla y seleccione un usuario");
                }
            } else {
                Metodos.mensaje("Selecciona un usuario primero");
            }
            
        }catch(Exception ex){
            Metodos.mensaje("Actualice primero la tabla ex2");
        }
        id = null;

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MClienteActionPerformed

    private void actualizarTabla(){
        VerTabla v = new VerTabla();
        v.visualizar_clientes(tabla_Clientes);
    }
    
    
    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed

        try{
            actualizarTabla();
        }catch (Exception ex){
            Metodos.mensaje("No se pudo cargar la tabla");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed

        Menu_db men = new Menu_db();
        men.show();
        this.hide();

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_MCliente;
    private javax.swing.JButton btn_NCliente;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla_Clientes;
    // End of variables declaration//GEN-END:variables
}
