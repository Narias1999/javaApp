/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.CtrlPermisosVacaciones;
import datechooser.beans.DateChooserCombo;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author BAUTISTA TTRIANA
 */
public class FormVacaciones extends javax.swing.JFrame {

    /**
     * Creates new form FormVacaciones
     */
    public FormVacaciones() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("INTERFACE-VACACIONES");  
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombremp = new javax.swing.JTextField();
        txtcelemple = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttpd = new javax.swing.JTextField();
        txtnumdocu = new javax.swing.JTextField();
        txtdirecempl = new javax.swing.JTextField();
        txtcorreoem = new javax.swing.JTextField();
        btelim = new javax.swing.JButton();
        btguar = new javax.swing.JButton();
        btbusc = new javax.swing.JButton();
        btmod = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();
        dtfecdesde = new datechooser.beans.DateChooserCombo();
        dtfechasta = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("                                VACACIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 430, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("OBSEVACIONES:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("# DE DOCUMENTO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CELULAR DEL EMPLEADO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("HORA/FECHA HASTA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        txtnombremp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnombremp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, -1));

        txtcelemple.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtcelemple, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("TIPO DE DOCUMENTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("NOMBRE DE EMPLEADO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("DIRECCION EMPLEADO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CORREO EMPLEADO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("HORA/FECHA DESDE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txttpd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txttpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, -1));

        txtnumdocu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnumdocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 170, -1));

        txtdirecempl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtdirecempl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 170, -1));

        txtcorreoem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtcorreoem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, -1));

        btelim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btelim.setText("ELIMINAR");
        jPanel1.add(btelim, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 110, -1));

        btguar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btguar.setText("GUARDAR");
        btguar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguarActionPerformed(evt);
            }
        });
        jPanel1.add(btguar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 110, -1));

        btbusc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btbusc.setText("BUSCAR");
        jPanel1.add(btbusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 100, -1));

        btmod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmod.setText("MODIFICAR");
        jPanel1.add(btmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 110, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 680, -1));

        txtobs.setColumns(20);
        txtobs.setRows(5);
        jScrollPane1.setViewportView(txtobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 510, 80));

        dtfecdesde.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    jPanel1.add(dtfecdesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, -1));

    dtfechasta.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel1.add(dtfechasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 170, -1));

jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 60, 40));

jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 60, 40));

jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 60, 40));

jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 60, 40));

getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

pack();
}// </editor-fold>//GEN-END:initComponents

    private void btguarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguarActionPerformed
        guardar();
        getDate(dtfechasta);
        getDate(dtfecdesde);
    }//GEN-LAST:event_btguarActionPerformed

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
            java.util.logging.Logger.getLogger(FormVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVacaciones().setVisible(true);
            }
        });
    }
void guardar(){
    CtrlPermisosVacaciones objCtrl = new CtrlPermisosVacaciones();
        String tipodoc = txttpd.getText();
        String nombreem = txtnombremp.getText();
        String celemp = txtcelemple.getText();
        String dateDesde = getDate(dtfecdesde);
        String datehasta = getDate(dtfechasta);
        int numdocu = Integer.parseInt(txtnumdocu.getText());
        String direcemp = txtdirecempl.getText();
        String correoem = txtcorreoem.getText();
        String observa= txtobs.getText();
        objCtrl.guardar(dateDesde, celemp, datehasta, tipodoc, tipodoc, numdocu);
}
String getDate(DateChooserCombo dateChooser){
    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
    Calendar dateS = dateChooser.getSelectedDate();
    String date = format1.format(dateS.getTime());
    return date;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbusc;
    private javax.swing.JButton btelim;
    private javax.swing.JButton btguar;
    private javax.swing.JButton btmod;
    private datechooser.beans.DateChooserCombo dtfecdesde;
    private datechooser.beans.DateChooserCombo dtfechasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcelemple;
    private javax.swing.JTextField txtcorreoem;
    private javax.swing.JTextField txtdirecempl;
    private javax.swing.JTextField txtnombremp;
    private javax.swing.JTextField txtnumdocu;
    private javax.swing.JTextArea txtobs;
    private javax.swing.JTextField txttpd;
    // End of variables declaration//GEN-END:variables
}
