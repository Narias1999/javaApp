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
 * @author ADMIN
 */
public class BDempleados_contratista {
     Conexion objcnx = new Conexion ();
     Connection conexion = objcnx.getCempBD();

    ResultSet datos;
    public void Guardar(String num_doc, String nom, String apellido, String tp_doc, String f_expedicion, String dpto_cod, int cod_ciudad, String f_nac, String cod_dptos, int cod_ciud, String RH, String genero, int edad, int num_hijos, String est_civil, String dir, String tlf, String correo, String foto, int tipo) {
        try {
            String sql = "insert into empleados_contratista values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.setString(1, num_doc);
            query.setString(2, nom);
            query.setString(3, apellido);
            query.setString(4, tp_doc);
            query.setString(5, f_expedicion);
            query.setString(6, dpto_cod);
            query.setInt(7, cod_ciud);
            query.setString(8, f_nac);
            query.setString(9, cod_dptos);
            query.setInt(10, cod_ciudad);
            query.setString(11, RH);
            query.setString(12, genero);
            query.setInt(13, edad);
            query.setInt(14, num_hijos);
            query.setString(15, est_civil);
            query.setString(16, dir);
            query.setString(17, tlf);
            query.setString(18, correo);
            query.setString(19, foto);
            query.setInt(20, tipo);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se Guardo con exito");
        } catch (Exception e) {
            System.out.println("Error BDempleados_contratista --> guardar " + e.getMessage());
        }
    }
    public void actualizar(String num_doc, String nom, String apellido, String tp_doc, String f_expedicion, String dpto_cod, int cod_ciudad, String f_nac, String cod_dptos, int cod_ciud, String RH, String genero, int edad, int num_hijos, String est_civil, String dir, String tlf, String correo, String foto, int tipo)  {
        try {
            PreparedStatement sql = conexion.prepareStatement("UPDATE empleados_contratista set nom ='" + nom + "' , apellido = '" + apellido + "', tp_doc = '" + dpto_cod + "' , f_expedicion ='" + f_expedicion + "' , dpto_cod= '" + dpto_cod + "', cod_ciudad = '" + cod_ciudad + "', f_nac= '" + f_nac + "',cod_dptos= '" + cod_dptos + "',cod_ciud= '" + cod_ciud + "',RH= '" + RH + "',genero= '" + genero + "',edad= '" + edad + "',num_hijos= '" + num_hijos + "',est_civil= '" + est_civil + "',dir= '" + dir + "',tlf= '" + tlf + "',correo= '" + correo + "',foto= '" + foto + "',tipo= '" + tipo + "' where num_doc = '" + num_doc + "'  ");
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado Exitosamente");
        } catch (Exception e) {
            System.out.println("Error Dempleados_contratista --> actualizar" + e.getMessage());
        }
    }
     public void eliminar(String num_doc) {
        try {
            String sql = "delete from empleados_contratista where num_doc ='" + num_doc + "' ";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.execute();
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Error en BDempleados_contratista --> Eliminar   " + e.getMessage());
        }
    }
     public ResultSet cargarDatos(String num_doc ) {
        ResultSet datos = null;
        try {
            String sql = "select * from empleados_contratista";
            Statement st = conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error en BDempleados_contratista --> cargarDatos --  " + e.getMessage());
        }
        return datos;
    }
      static ResultSet rsInfo;
    public ResultSet Buscar(String num_doc) {
        try {
            Statement st = conexion.createStatement();
            rsInfo = st.executeQuery("SELECT num_doc, nom, apellido from empleados_contratista where num_doc LIKE '%" + num_doc + "%'");
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return rsInfo;

    }
}


