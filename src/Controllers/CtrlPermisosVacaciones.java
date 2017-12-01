/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BDPermisosVacaciones;
import java.sql.ResultSet;

/**
 *
 * @author DUHUM
 */
public class CtrlPermisosVacaciones {
    
    BDPermisosVacaciones objBD = new BDPermisosVacaciones();
    
    public void guardar(String hor_fch_desde, String desc, String hor_fch_hasta, String num_doc, String tipo, int id_detalle){
        objBD.guardar(hor_fch_desde, desc, hor_fch_hasta, num_doc, tipo, id_detalle);
    }
    
    public void actualizar(int id,String hor_fch_desde, String desc, String hor_fch_hasta, int cod, String num_doc, String tipo, int id_detalle){
        objBD.actualizar(id, hor_fch_desde, desc, hor_fch_hasta, cod, num_doc, tipo, id_detalle);
        
    }
    public void eliminar(int cod, int id){
        objBD.eliminar(cod, id);
    }
    public ResultSet buscar(){
        ResultSet datos = objBD.buscar();
        return datos;
    }
    
}
