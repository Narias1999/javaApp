/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Andres Felipe
 */
public class Frm_RegistroContrato extends javax.swing.JFrame {

    /**
     * Creates new form Frm_RegistroContrato
     */
    public Frm_RegistroContrato() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxTipodeContrato = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDireccionContratista = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCorreoContratista = new javax.swing.JTextField();
        txtValorContrato = new javax.swing.JTextField();
        txtAporteARL = new javax.swing.JTextField();
        txtARL = new javax.swing.JTextField();
        txtNoContrato = new javax.swing.JTextField();
        txtTipoDocumento = new javax.swing.JTextField();
        txtNombreContratista = new javax.swing.JTextField();
        txtCelularContratista = new javax.swing.JTextField();
        txtNoDocumento = new javax.swing.JTextField();
        txtServicioObjContrato = new javax.swing.JTextField();
        txtAporteSeguridadSocial = new javax.swing.JTextField();
        txtAportePension = new javax.swing.JTextField();
        DateInicio = new datechooser.beans.DateChooserCombo();
        DateRetiro = new datechooser.beans.DateChooserCombo();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATOS DEL CONTRATO DE TRACTO SUCESIVO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 430, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("APORTE PENSION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("% ARL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("FECHA DE INICIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NOMBRE DEL CONTRATISTA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("TIPO DE DOCUMENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CELULAR DEL CONTRATISTA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("SERVICIO OBJETO DEL CONTRATO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("APORTE SEGURIDAD SOCIAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("No DE CONTRATO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("TIPO DE CONTRATO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, 30));

        cbxTipodeContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxTipodeContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 150, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("# DE DOCUMENTO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, 30));
        jPanel1.add(txtDireccionContratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 150, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("DIRECCION CONTRATISTA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("CORREO CONTRATISTA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("FECHA DE TERMINACION");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("VALOR CONTRATO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("APORTE ARL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 90, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("GUARDAR");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 100, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("BUSCAR");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 90, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("MODIFICAR");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 100, 30));
        jPanel1.add(txtCorreoContratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 150, 30));
        jPanel1.add(txtValorContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 150, 30));
        jPanel1.add(txtAporteARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 150, 30));
        jPanel1.add(txtARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 150, 30));
        jPanel1.add(txtNoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 150, 30));
        jPanel1.add(txtTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, 30));
        jPanel1.add(txtNombreContratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, 30));
        jPanel1.add(txtCelularContratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, 30));
        jPanel1.add(txtNoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 150, 30));
        jPanel1.add(txtServicioObjContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));
        jPanel1.add(txtAporteSeguridadSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, 30));
        jPanel1.add(txtAportePension, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 150, 30));

        DateInicio.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    jPanel1.add(DateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 150, 30));

    DateRetiro.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel1.add(DateRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 150, 30));

jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 30, 70));

jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 50, 70));

jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 60, 70));

jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 50, 70));

getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 860, 600));

pack();
}// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_RegistroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_RegistroContrato().setVisible(true);
            }
        });
    }
     void setGuardar() {
//        Ctrl objCtrl = new Ctrl();
//        int nodecontacto = Integer.parseInt(txtNoContrato.getText());
//        String tipo_documento = txtTipoDocumento.getSelectedItem().toString();
//        String nombre_contratista=txtNombreContratista.getText();
//        String celular_contratista=txtCelularContratista.getText();
//        int año = dateInicio.getSelectedDate().get(Calendar.YEAR);
//        int mes = dateInicio.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia = dateInicio.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha = año + "-" + mes + "-" + dia;

//        String  servicio_objet= txtServicioObjContrato.getText();
//        String  aporte_seguridad= txtAporteSeguridadSocial.getText();        
//        String  aporte_pencion=  txtAportePension.getText();
//        String tipo_contrato= cbxTipodeContrato.getSelectedItem().toString();;
//        String  numero_documento= txtNoDocumento.getText();
//        String periodo_pago = cbxPeriodoPago.getSelectedItem().toString();
//        int direccion_contratista = txtDireccionContratista.getText();
//        String correo_contratista = txtCorreoContratista.getText();
//        int año2 = dateRetiro.getSelectedDate().get(Calendar.YEAR);
//        int mes2 = dateRetiro.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia2 = dateRetiro.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha2 = año2 + "-" + mes2 + "-" + dia2;
//        int valor_contratot = Integer.parseInt(txtValorContrato.getText());
//        int AporteARL = Integer.parseInt(txtAporteARL.getText());
//        String arl= txtARL.getText();
//        Ctrl.guardar();

    }
    
    void actualizar() {
             // Ctrl objCtrl = new Ctrl();
        int nodecontacto = Integer.parseInt(txtNoContrato.getText());
        String tipo_documento = txtTipoDocumento.getText();
        String nombre_contratista=txtNombreContratista.getText();
        String celular_contratista=txtCelularContratista.getText();
//        int año = dateInicio.getSelectedDate().get(Calendar.YEAR);
//        int mes = dateInicio.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia = dateInicio.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha = año + "-" + mes + "-" + dia;
         String  servicio_objet= txtServicioObjContrato.getText();
         String  aporte_seguridad= txtAporteSeguridadSocial.getText();        
         String  aporte_pencion=  txtAportePension.getText();         
         String  numero_documento= txtNoDocumento.getText();
         String direccion_contrat = txtDireccionContratista.getText();
         String correo_contratista = txtCorreoContratista.getText();
//        int año2 = dateRetiro.getSelectedDate().get(Calendar.YEAR);
//        int mes2 = dateRetiro.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia2 = dateRetiro.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha2 = año2 + "-" + mes2 + "-" + dia2;
          int valor_contratot = Integer.parseInt(txtValorContrato.getText());
          int AporteARL = Integer.parseInt(txtAporteARL.getText());
          String arl= txtARL.getText();
//        Ctrl.guardar();
    }
        
    
    
        public void cargarDatos() {
//        Ctrl objectrl = new Ctrl();
//        String no_contacto = txtNoContrato.getText();
//        ResultSet datos = objectrl.cargarDatos(no_contacto);
//
//        try {
//            while () {
//               
//            }
//        } catch (Exception e) {
//        }
            
        
    }    
       void elimina(){
//         Ctrl objctrl = new Ctrl();
        String no_contacto =  txtNoContrato.getText();
//        objctrl.elimnar(no_contacto);
      } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo DateInicio;
    private datechooser.beans.DateChooserCombo DateRetiro;
    private javax.swing.JComboBox<String> cbxTipodeContrato;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtARL;
    private javax.swing.JTextField txtAporteARL;
    private javax.swing.JTextField txtAportePension;
    private javax.swing.JTextField txtAporteSeguridadSocial;
    private javax.swing.JTextField txtCelularContratista;
    private javax.swing.JTextField txtCorreoContratista;
    private javax.swing.JTextField txtDireccionContratista;
    private javax.swing.JTextField txtNoContrato;
    private javax.swing.JTextField txtNoDocumento;
    private javax.swing.JTextField txtNombreContratista;
    private javax.swing.JTextField txtServicioObjContrato;
    private javax.swing.JTextField txtTipoDocumento;
    private javax.swing.JTextField txtValorContrato;
    // End of variables declaration//GEN-END:variables
}
