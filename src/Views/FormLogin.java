/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Ctrllogin;
import javax.swing.JOptionPane;

/**
 *
 * @author BAUTISTA TTRIANA
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCONTRASEÑA2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btINGRESAR2 = new javax.swing.JButton();
        btSALIR = new javax.swing.JButton();
        cbUSUARIOS = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("INGRESO DE USUARIOS");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 40, 40));
        jPanel4.add(txtCONTRASEÑA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 40, 40));

        btINGRESAR2.setText("INGRESAR");
        btINGRESAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btINGRESAR2ActionPerformed(evt);
            }
        });
        jPanel4.add(btINGRESAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        btSALIR.setText("SALIR");
        jPanel4.add(btSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 80, -1));

        jPanel4.add(cbUSUARIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, -1));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, 30));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btINGRESAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btINGRESAR2ActionPerformed

    }//GEN-LAST:event_btINGRESAR2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }
     String Usuario;
    String Clave;

    public void setusuario() {
        String usuario = cbUSUARIOS.getSelectedItem().toString();
        Ctrllogin obj = new Ctrllogin();
        obj.setUsuario(usuario);

    }

    public void setClave() {
        String Clave = txtCONTRASEÑA2.getText();
        Ctrllogin obj = new Ctrllogin();
        obj.setClave(Clave);

    }

    public void validar() {
        Ctrllogin obj = new Ctrllogin();
        int estado = obj.validar();
        if (estado == 1) {
            JOptionPane.showMessageDialog(null, "bienvenido  Usuario y contraseña correctos");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y contraseña son incorrectos");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btINGRESAR;
    private javax.swing.JButton btINGRESAR1;
    private javax.swing.JButton btINGRESAR2;
    private javax.swing.JButton btSALIR;
    private javax.swing.JComboBox cbUSUARIOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCONTRASEÑA;
    private javax.swing.JTextField txtCONTRASEÑA1;
    private javax.swing.JTextField txtCONTRASEÑA2;
    // End of variables declaration//GEN-END:variables
}
