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
 * @author DUHUM
 */
public class BDPermisosVacaciones {

    Conexion objCNX = new Conexion();
    Connection conex = objCNX.ConexBD;

    public void guardar(String hor_fch_desde, String desc, String hor_fch_hasta, int cod, String num_doc, String tipo) {
        int id_detalle = 0;
        ResultSet datos = null;
        try {
            String sql1 = "INSERT INTO det_permiso_vacaciones (hor_fch_desde,desc,hor_fch_hasta)  VALUES (?,?,?)";
            PreparedStatement query1 = conex.prepareStatement(sql1);
            query1.setString(1, hor_fch_desde);
            query1.setString(2, desc);
            query1.setString(3, hor_fch_hasta);
            query1.executeUpdate();

            String sqlE = " SELECT id FROM det_permiso_vacaciones WHERE hor_fch_desde ='" + hor_fch_desde + "' and  desc='" + desc + "' and hor_fch_hasta= '" + hor_fch_hasta + "' ";
            Statement st1 = conex.createStatement();
            datos = st1.executeQuery(sqlE);
            while (datos.next()) {
                id_detalle = datos.getInt("id");
            }

            String sql2 = "INSERT INTO permisos_vaciones (cod,num_doc,tipo,detalle) VALUES (?,?,?,?)";
            PreparedStatement query2 = conex.prepareStatement(sql2);
            query2.setInt(1, cod);
            query2.setString(2, num_doc);
            query2.setString(3, tipo);
            query2.setInt(4, id_detalle);
            query2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (Exception e) {
            System.out.println("error en  BDPermisosVacaciones -- guardar " + e.getMessage());
        }

    }

    public void actualizar(String hor_fch_desde, String desc, String hor_fch_hasta, int cod, String num_doc, String tipo) {
        int id_detalle = 0;
        ResultSet datos = null;
        try {

            String sqlE = " SELECT id FROM det_permiso_vacaciones WHERE hor_fch_desde ='" + hor_fch_desde + "' and  desc='" + desc + "' and hor_fch_hasta= '" + hor_fch_hasta + "' ";
            Statement st1 = conex.createStatement();
            datos = st1.executeQuery(sqlE);
            while (datos.next()) {
                id_detalle = datos.getInt("id");
            }
            String sql1 = "UPDATE det_permiso_vacaciones SET hor_fch_desde='" + hor_fch_desde + ", desc='" + desc + "', hor_fch_hasta='" + hor_fch_hasta + "' WHERE id ='" + id_detalle + "'  ";
            PreparedStatement query1 = conex.prepareStatement(sql1);
            query1.executeUpdate();

            String sql2 = "UPDATE permisos_vaciones SET num_doc='" + num_doc + ", tipo='" + tipo + "', id_detalle='" + id_detalle + "' WHERE cod ='" + cod + "'  ";
            PreparedStatement query2 = conex.prepareStatement(sql2);
            JOptionPane.showMessageDialog(null, "Se Actualizo Correctamente");
            query2.executeUpdate();
        } catch (Exception e) {
            System.out.println("error en  BDPermisosVacaciones -- Actualizar " + e.getMessage());
        }
    }

    public void eliminar(int cod) {
        int id_detalle = 0;
        ResultSet datos = null;
        try {
            String sqlE = " SELECT id_detalle FROM permisos_vaciones WHERE cod= '" + cod + "' ";
            Statement st1 = conex.createStatement();
            datos = st1.executeQuery(sqlE);
            while (datos.next()) {
                id_detalle = datos.getInt("id_detalle");
            }

            String sql1 = "DELETE FROM det_permiso_vacaciones WHERE id ='" + id_detalle + "' ";
            PreparedStatement query1 = conex.prepareStatement(sql1);
            query1.executeUpdate();

            String sql2 = "DELETE FROM permisos_vaciones WHERE cod='" + cod + "' ";
            PreparedStatement query2 = conex.prepareStatement(sql2);
            query2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        } catch (Exception e) {
            System.out.println("error en  BDPermisosVacaciones -- eliminar " + e.getMessage());
        }
    }

    public ResultSet buscar() {
        ResultSet datos = null;

        try {
            String sql1 = "SELECT * FROM det_permiso_vacaciones";
            Statement st1 = conex.createStatement();
            datos = st1.executeQuery(sql1);

            String sql2 = "SELECT * FROM permisos_vaciones";
            Statement st2 = conex.createStatement();
            datos = st2.executeQuery(sql2);

        } catch (Exception e) {
            System.out.println("error en  BDPermisosVacaciones -- buscar " + e.getMessage());
        }
        return datos;
    }

    public ResultSet cargarDatosEmpleado(int NmDoc) {
        ResultSet datos = null;
        try {
            String sql = "SELECT  * FROM empleados_contratista ";
            Statement st = conex.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
        }
        return datos;
    }
}
