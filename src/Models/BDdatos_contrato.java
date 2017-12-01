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
 * @author USUARIO
 */
public class BDdatos_contrato {

    Conexion objconx = new Conexion();
    Connection conexion = objconx.getCempBD();

    public void guardar1(String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, String nit, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {

        try {
            String sq1 = "Insert into datos_contrato (tp_ctto,num_doc,fch_ing ,fch_retiro,institucion,cod_zona,cod_ciudad,salario_basico,cod_bancos,tp_cta,num_cta,periodo_pago,cod_fon_salud,cod_arl,atep,tipo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement query = conexion.prepareStatement(sq1);
            query.setString(1, tp_ctto);
            query.setString(2, num_doc);
            query.setString(3, fch_ing);
            query.setString(4, fch_retiro);
            query.setString(5, institucion);
            query.setInt(6, cod_zona);
            query.setInt(7, cod_ciudad);
            query.setInt(8, salario_basico);
            query.setString(9, cod_bancos);
            query.setString(10, tp_cta);
            query.setInt(11, num_cta);
            query.setString(12, periodo_pago);
            query.setString(13, cod_fon_salud);
            query.setString(14, cod_arl);
            query.setInt(15, atep);
            query.setInt(16, tipo);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");

        } catch (Exception e) {
            System.out.println("Error BDdatos_contrato -- Actualizar " + e.getMessage());
        }
    }

    public void actualizar(int id, String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, String nit, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {
        try {
            String sql = "update datos_contrato set  num_doc = '" + num_doc + "', fch_ing = '" + fch_ing + "', fch_retiro = '" + fch_retiro + "', nit = '" + nit + "', cod_zona = '" + cod_zona + "', cod_ciudad = '" + cod_ciudad + "', salario_basico = '" + salario_basico + "', cod_bancos = '" + cod_bancos + "', tp_cta = '" + tp_cta + "', num_cta = '" + num_cta + "', periodo_pago = '" + periodo_pago + "', cod_fon_salud = '" + cod_fon_salud + "', cod_arl = '" + cod_arl + "', atep = '" + atep + "', tipo = '" + tipo + "' where id= '" + id + "' ";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado");
        } catch (Exception e) {
            System.out.println("Error BDdatos_contrato -- Actualizar " + e.getMessage());
        }
    }

    public ResultSet cargarDatos(int id) {
        ResultSet datos = null;
        try {
            String sql = "Select * from datos_contrato where id = '" + id + "' ";
            Statement st = conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error BDdatos_contrato-- Cargar datos " + e.getMessage());
        }
        return datos;
    }

    public void eliminar(int id) {
        try {
            String sql = "delete from datos_contrato where id='" + id + "'";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        } catch (Exception e) {
            System.out.println("Error BDdatos_contrato eliminar " + e.getMessage());
        }
    }
}
