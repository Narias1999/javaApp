/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Andres
 */
public class FormRegistroPasantia extends javax.swing.JFrame {

    /**
     * Creates new form FormRegistroPasantia
     */
    public FormRegistroPasantia() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("INTERFACE REGISTRO DE CONTRATO PASANTIA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCONTRATO = new javax.swing.JTextField();
        txtINSTITUCION = new javax.swing.JTextField();
        txtSALARIO = new javax.swing.JTextField();
        txtATEP = new javax.swing.JTextField();
        txtNCUENTA = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        cbxARL = new javax.swing.JComboBox();
        cbxDOCUMENTO = new javax.swing.JComboBox();
        cbxZONALABORES = new javax.swing.JComboBox();
        cbxTIPOCUENTA = new javax.swing.JComboBox();
        cbxPERIODOPAGO = new javax.swing.JComboBox();
        txtNDOCUMENTO = new javax.swing.JTextField();
        cbxCIUDAD = new javax.swing.JComboBox();
        cbxTIPOCONTRATO = new javax.swing.JComboBox();
        cbxFONDOSALUD = new javax.swing.JComboBox();
        cbxBANCOCUENTA = new javax.swing.JComboBox();
        btELIMINAR = new javax.swing.JButton();
        btGUARDAR = new javax.swing.JButton();
        btBUSCAR = new javax.swing.JButton();
        btMODIFICAR = new javax.swing.JButton();
        datacRETIRO = new datechooser.beans.DateChooserCombo();
        dtINGRESO = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS DEL CONTRATO CONTRATISTA PASANTIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ARL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("No DE CONTRATO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TIPO DE DOCUMENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("FECHA DE INGRESO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("INSTITUCION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ZONA DE LABORES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("SALARIO BASICO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("TIPO DE CUENTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("PERIODO DE PAGO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("% ATEP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 160, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("FONDO DE SALUD");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 160, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("NUMERO DE CUENTA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 160, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("BANCO CUENTA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("CIUDAD");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 160, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("NIT");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("FECHA DE RETIRO");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 160, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("# DE DOCUMENTO");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("TIPO DE CONTRATO");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 160, -1));
        jPanel1.add(txtCONTRATO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, -1));
        jPanel1.add(txtINSTITUCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, -1));

        txtSALARIO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtSALARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, -1));
        jPanel1.add(txtATEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 140, -1));
        jPanel1.add(txtNCUENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 140, -1));
        jPanel1.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 140, -1));

        cbxARL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        cbxDOCUMENTO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        cbxDOCUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDOCUMENTOActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDOCUMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, -1));

        cbxZONALABORES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxZONALABORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));

        cbxTIPOCUENTA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxTIPOCUENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 140, -1));

        cbxPERIODOPAGO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxPERIODOPAGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 140, -1));
        jPanel1.add(txtNDOCUMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, -1));

        cbxCIUDAD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxCIUDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 140, -1));

        cbxTIPOCONTRATO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxTIPOCONTRATO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 140, -1));

        cbxFONDOSALUD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxFONDOSALUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 140, -1));

        cbxBANCOCUENTA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxBANCOCUENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 140, -1));

        btELIMINAR.setText("ELIMINAR");
        jPanel1.add(btELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 130, -1));

        btGUARDAR.setText("GUARDAR");
        jPanel1.add(btGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, -1));

        btBUSCAR.setText("BUSCAR");
        btBUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 120, -1));

        btMODIFICAR.setText("MODIFICAR");
        jPanel1.add(btMODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 130, -1));
        jPanel1.add(datacRETIRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 140, -1));
        jPanel1.add(dtINGRESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 368, 40, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDOCUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDOCUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDOCUMENTOActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegistroPasantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistroPasantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistroPasantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistroPasantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistroPasantia().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBUSCAR;
    private javax.swing.JButton btELIMINAR;
    private javax.swing.JButton btGUARDAR;
    private javax.swing.JButton btMODIFICAR;
    private javax.swing.JComboBox cbxARL;
    private javax.swing.JComboBox cbxBANCOCUENTA;
    private javax.swing.JComboBox cbxCIUDAD;
    private javax.swing.JComboBox cbxDOCUMENTO;
    private javax.swing.JComboBox cbxFONDOSALUD;
    private javax.swing.JComboBox cbxPERIODOPAGO;
    private javax.swing.JComboBox cbxTIPOCONTRATO;
    private javax.swing.JComboBox cbxTIPOCUENTA;
    private javax.swing.JComboBox cbxZONALABORES;
    private datechooser.beans.DateChooserCombo datacRETIRO;
    private datechooser.beans.DateChooserCombo dtINGRESO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtATEP;
    private javax.swing.JTextField txtCONTRATO;
    private javax.swing.JTextField txtINSTITUCION;
    private javax.swing.JTextField txtNCUENTA;
    private javax.swing.JTextField txtNDOCUMENTO;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtSALARIO;
    // End of variables declaration//GEN-END:variables
}
