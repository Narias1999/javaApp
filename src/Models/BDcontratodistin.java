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

/**
 *
 * @author hp
 */
public class BDcontratodistin {
    Conexion objconex= new Conexion();
    Connection conexion = objconex.getCempBD();
    
    public void guardar(String tp_ctto , String num_doc , String nom_pers , String dir , String cel , String correo , String fch_ini , String fch_term , String serv_ctto , int val_ctto , int aporte_soc , int aporte_arl , int aporte_pension , int arl , String vto_soat , String vto_tecno , int tipo) {
        try {
            String sql = "insert into contrato_diferente (tp_ctto, num_doc , nom_pers , dir , cel , correo , fch_ini , fch_term , serv_obj_ctto , val_ctto , aporte_seg_soc , aporte_arl, aporte_pension , arl , vto_soat , vto_tecnomecanica , tipo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.setString(1,tp_ctto);
            query.setString(2, num_doc);
            query.setString(3, nom_pers);
            query.setString(4, dir);
            query.setString(5, cel);
            query.setString(6, correo);
            query.setString(7, fch_ini);
            query.setString(8, fch_term);
            query.setString(9, serv_ctto);
            query.setInt(10, val_ctto);
            query.setInt(11, aporte_soc);
            query.setInt(12, aporte_arl);
            query.setInt(13, aporte_pension);
            query.setInt(14, arl);
            query.setString(15, vto_soat);
            query.setString(16, vto_tecno);
            query.setInt(17, tipo);
            query.executeUpdate();
            
        } catch (Exception e) {
             System.out.println("error bd_contratodistin -- guardar  " + e.getMessage());
        }
        
    }
    
    public void actualizar(int id , String tp_ctto , String num_doc , String nom_pers , String dir , String cel , String correo , String fch_ini , String fch_term , String serv_ctto , int val_ctto , int aporte_soc , int aporte_arl , int aporte_pension , int arl , String vto_soat , String vto_tecno , int tipo){
        try {
            String sql ="update contrato_diferente set tp_ctto='"+tp_ctto+"' , num_doc ='"+num_doc+"' , nom_pers= '"+nom_pers+"' , dir='"+dir+"' , cel ='"+cel+"' , correo='"+correo+"' , fch_ini='"+fch_ini+"' , fch_term='"+fch_term+"' , serv_obj_ctto='"+ serv_ctto+"' , val_ctto='"+val_ctto+"' , aporte_seg_soc ='"+aporte_soc+"' , aporte_arl='"+aporte_arl+"' , aporte_pension='"+aporte_pension+"' , arl ='"+arl+"' , vto_soat='"+ vto_soat+"' , vto_tecnomecanica='"+ vto_tecno+"' ,tipo='"+tipo+"' where id='"+id+"' ";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error bdcontratodistin-- actualiza" + e.getMessage());
        }
        
    }
    
    public ResultSet cargartabla(int id){
        ResultSet datos = null;
        try {
            String sql = "select * from contrato_diferente where id ='"+id+"' ";
            Statement st = conexion.createStatement();
            datos = st.executeQuery(sql);
            
        } catch (Exception e) {
            System.out.println("error bd_contratodistin -- cargartabla" + e.getMessage());
        }
        return datos;
        
    }
    
    public void eliminar(int id ) {
        try {
            String sql="delete from contrato_diferente where id ='"+id+"' ";
            PreparedStatement query = conexion.prepareStatement(sql);
            query.executeUpdate();
            
        } catch (Exception e) {
             System.out.println("Error BD_contratodistin - - Eliminar" + e.getMessage());
        }
        
    }
    
}
