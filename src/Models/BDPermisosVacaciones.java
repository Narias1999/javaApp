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

    public ResultSet buscar(){
        ResultSet datos= null;
        try {
            String sql1 ="SELECT * FROM det_permiso_vacaciones";
            Statement st1 = conex.createStatement();
            datos = st1.executeQuery(sql1);
            
            String sql2 ="SELECT * FROM permisos_vaciones";
            Statement st2 = conex.createStatement();
            datos = st2.executeQuery(sql2);
            
        } catch (Exception e) {
           System.out.println("error en  BDPermisosVacaciones -- buscar " + e.getMessage()); 
        }
        return datos;
    }   
    
    public void guardar(String hor_fch_desde, String desc, String hor_fch_hasta, String num_doc, String tipo, int id_detalle) {
        try {
            String sql1= "INSERT INTO det_permiso_vacaciones (hor_fch_desde,desc,hor_fch_hasta)  VALUES (?,?,?)";
            PreparedStatement query1= conex.prepareStatement(sql1);
            query1.setString(1, hor_fch_desde);
            query1.setString(2, desc);
            query1.setString(3, hor_fch_hasta);
            query1.executeUpdate();
            
            String sql2 ="INSERT INTO permisos_vaciones (num_doc,tipo,detalle) VALUES (?,?,?)";
            PreparedStatement query2 = conex.prepareStatement(sql2);
            query2.setString(1, num_doc);
            query2.setString(2, tipo);
            query2.setInt(3, id_detalle);
            query2.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (Exception e) {
            System.out.println("error en  BDPermisosVacaciones -- guardar " + e.getMessage());
        }
        
    }
    public void actualizar(int id,String hor_fch_desde, String desc, String hor_fch_hasta, int cod, String num_doc, String tipo, int id_detalle){
        try {
            String sql1="UPDATE det_permiso_vacaciones SET hor_fch_desde='"+hor_fch_desde+", desc='"+desc+"', hor_fch_hasta='"+hor_fch_hasta+"' WHERE id ='"+id+"'  ";
            PreparedStatement query1 = conex.prepareStatement(sql1);
            query1.executeUpdate();
            
            String sql2="UPDATE permisos_vaciones SET num_doc='"+num_doc+", tipo='"+tipo+"', id_detalle='"+id_detalle+"' WHERE cod ='"+cod+"'  ";
            PreparedStatement query2 = conex.prepareStatement(sql2);
            JOptionPane.showMessageDialog(null,"Se Actualizo Correctamente");
            query2.executeUpdate();
        } catch (Exception e) {
             System.out.println("error en  BDPermisosVacaciones -- Actualizar " + e.getMessage());
        }
    }
    public void eliminar(int cod, int id){
        try {
            String sql1=  "DELETE FROM det_permiso_vacaciones WHERE id ='"+id+"' ";
            PreparedStatement query1= conex.prepareStatement(sql1);
            query1.executeUpdate();
            
            String sql2 = "DELETE FROM permisos_vaciones WHERE id ='"+id+"' ";
            PreparedStatement query2 = conex.prepareStatement(sql2);
            query2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente");
        } catch (Exception e) {
             System.out.println("error en  BDPermisosVacaciones -- eliminar " + e.getMessage());
        }
    }
}
