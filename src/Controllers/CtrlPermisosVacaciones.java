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
    
    public void guardar(String hor_fch_desde, String desc, String hor_fch_hasta, int cod, String num_doc, String tipo){
        objBD.guardar(hor_fch_desde, desc, hor_fch_hasta, cod, num_doc, tipo);  
    }
    
    public void actualizar(String hor_fch_desde, String desc, String hor_fch_hasta, int cod, String num_doc, String tipo){
        objBD.actualizar(hor_fch_desde, desc, hor_fch_hasta, cod, num_doc, tipo);
        
    }
    public void eliminar(int cod){
        objBD.eliminar(cod);
    }
    public ResultSet buscar(){
        ResultSet datos = objBD.buscar();
        return datos;
    }
    
    
    public ResultSet cargarDatosEmpleado(int NmDoc) {
        ResultSet datos = objBD.cargarDatosEmpleado(NmDoc);
        return datos;
    }
    
}
