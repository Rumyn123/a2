/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

/**
 *
 * @author Rumyn
 */
public class Empresa_m extends javax.swing.JFrame {
    String prfc = null; //Variable utilizada para ver si la empresa ya fué creada o no, sino ha sido subida a la db prfc será igual a "No Cargado"
    /**
     * Creates new form Cliente_m
     */
    public Empresa_m() {
        initComponents();
        prfc = null;
        setLocationRelativeTo(null);
    }

    public Empresa_m(String rfcc, String rrCamara, String rcEstatal, String rrLegal, String rdFisica, String rcp, String rtel){
        initComponents();
        prfc = rfcc;
        metodo.mensaje("Si se paso el rfc "+ prfc);
        lbl_rfc.setText(prfc);
        lbl_rCamara.setText(rrCamara);
        lbl_cEstatal.setText(rcEstatal);
        lbl_rLegal.setText(rrLegal);
        lbl_dFisica.setText(rdFisica);
        lbl_cp.setText(rcp);
        lbl_tel.setText(rtel);
        setLocationRelativeTo(null);
    }
    
    Metodos metodo = new Metodos();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_rfc = new javax.swing.JTextField();
        lbl_rCamara = new javax.swing.JTextField();
        lbl_cEstatal = new javax.swing.JTextField();
        lbl_rLegal = new javax.swing.JTextField();
        lbl_dFisica = new javax.swing.JTextField();
        lbl_cp = new javax.swing.JTextField();
        lbl_tel = new javax.swing.JTextField();
        btn_Salir = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RFC");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("R. CAMARA");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("C. Estatal");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("R. Legal");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D. Fisica");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Codigo Postal");

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Telefono");

        lbl_rfc.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_rfc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbl_rfc.setText("0");
        lbl_rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_rfcActionPerformed(evt);
            }
        });

        lbl_rCamara.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_rCamara.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_cEstatal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_cEstatal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbl_cEstatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_cEstatalActionPerformed(evt);
            }
        });

        lbl_rLegal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_rLegal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_dFisica.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_dFisica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_cp.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_cp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_tel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lbl_tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_Salir.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 51, 51));
        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_Guardar.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(102, 255, 153));
        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cEstatal, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_rCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_rLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_dFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_rfc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_rCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_cEstatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_rLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_dFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed

        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void lbl_cEstatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_cEstatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_cEstatalActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        Conexion conn = new Conexion();
        String rfc, rCamara, cEstatal, dFisica, rLegal, cp, tel;
        rfc = lbl_rfc.getText().toString();
        rCamara = lbl_rCamara.getText().toString();
        cEstatal = lbl_cEstatal.getText().toString();
        dFisica = lbl_dFisica.getText().toString();
        rLegal = lbl_rLegal.getText().toString();
        cp = lbl_cp.getText().toString();
        tel = lbl_tel.getText().toString();
        
        if(rfc.trim().length() != 0 && rCamara.trim().length() != 0 && cEstatal.trim().length() != 0 && dFisica.trim().length() != 0 && rLegal.trim().length() != 0 && cp.trim().length() != 0 && tel.trim().length() != 0){
            if(prfc.equals("No Cargado")){
                conn.guardar_empresa(rfc, rCamara, cEstatal, rLegal, dFisica, cp, tel);
                metodo.mensaje("Empresa registrada con exito");
            }else{
                conn.actualizar_empresa(rfc, rCamara, cEstatal, rLegal, dFisica, cp, tel);
                metodo.mensaje("Cambios realizados con exito");
            }
        }else {
            metodo.mensaje("Porfavor, llene todos los campos");
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void lbl_rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_rfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_rfcActionPerformed

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
            java.util.logging.Logger.getLogger(Empresa_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa_m.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa_m().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lbl_cEstatal;
    private javax.swing.JTextField lbl_cp;
    private javax.swing.JTextField lbl_dFisica;
    private javax.swing.JTextField lbl_rCamara;
    private javax.swing.JTextField lbl_rLegal;
    private javax.swing.JTextField lbl_rfc;
    private javax.swing.JTextField lbl_tel;
    // End of variables declaration//GEN-END:variables
}
