/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yarelis Contreras
 */
public class BD_Datos_contrato {

    Conexion obj = new Conexion();
    Connection ConexBD = obj.getCempBD();

    public void guardar(String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, String nit, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {

        try {
            String sql = "insert into datos_contrato (tp_ctto,num_doc,fch_ing,fch_retiro,institucion,nit,cod_zona,cod_ciudad,salario_basico,cod_bancos,tp_cta,num_cta,periodo_pago,cod_fon_salud,cod_arl,atep,tipo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement query = ConexBD.prepareStatement(sql);
            query.setString(1, tp_ctto);
            query.setString(2, num_doc);
            query.setString(3, fch_ing);
            query.setString(4, fch_retiro);
            query.setString(5, institucion);
            query.setString(6, nit);
            query.setInt(7, cod_zona);
            query.setInt(8, cod_ciudad);
            query.setInt(9, salario_basico);
            query.setString(10, cod_bancos);
            query.setString(11, tp_cta);
            query.setInt(12, num_cta);
            query.setString(13, periodo_pago);
            query.setString(14, cod_fon_salud);
            query.setString(15, cod_arl);
            query.setInt(16, atep);
            query.setInt(17, tipo);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "guardado exitosamente");
        } catch (Exception e) {
            System.out.println("Error BD_Datos_contrato - - guardar" + e.getMessage());
        }
    }

    public void actualizar( String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, String nit, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {
        try {

            String sql = "update datos_contratos set tp_ctto = '" + tp_ctto + "',fch_ing ='" + fch_ing + "',fch_retiro ='" + fch_retiro + "',institucion ='" + institucion + "',nit = ' " + nit + "',cod_zona ='" + cod_zona + "',cod_ciudad = ' " + cod_ciudad + "',salario_basico ='" + salario_basico + "',cod_bancos = ' " + cod_bancos + "',tp_cta ='" + tp_cta + "',mun_cta = ' " + num_cta + "',periodo_pago ='" + periodo_pago + "',cod_fon_salud = ' " + cod_fon_salud + "',cod_arl ='" + cod_arl + "',atep = ' " + atep + "',tipo ='" + tipo + "' Where num_doc= '" + num_doc + "'";
            PreparedStatement query = ConexBD.prepareStatement(sql);
            query.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error BD_Datos_contrato - - actualizar" + e.getMessage());
        }
    }

    public ResultSet cargarDatos(String num_doc) {
        ResultSet datos = null;
        try {
            String sql = "select * from datos_contrato where num_doc = '" + num_doc + "'";
            Statement st = ConexBD.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error BD_Datos_contrato --cagar datos" + e.getMessage());
        }

        return datos;
    }

    public void Eliminar(String num_doc) {
        try {
            String sql = "delete from datos_contrato where num_doc = '" + num_doc + "'";
            PreparedStatement query = ConexBD.prepareStatement(sql);
            query.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error BD_Datos_contrato - - Eliminar" + e.getMessage());
        }

    }

}
