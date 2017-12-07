/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BDLocalidad;
import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class CtrlLocalidad {
    
     public ResultSet cargarcbxZonas(String idciudad) {
         BDLocalidad obj = new BDLocalidad();
         ResultSet datos = obj.cargarcbxZonas(idciudad);
         return datos;
     }
     
     public String getId_Zonas(String nom) {
         BDLocalidad obj = new BDLocalidad();
          return obj.getId_Zonas(nom);
     }
      
      public ResultSet cargarcbxciudad(String idDepartamento) {
         BDLocalidad obj = new BDLocalidad();
         ResultSet datos = obj.cargarcbxciudad(idDepartamento);
         return datos;
      }
     public String getId_ciudad(String nombre) {
         BDLocalidad obj = new BDLocalidad();
          return obj.getId_ciudad(nombre);
       
}
     public ResultSet cargardptos() {
         BDLocalidad obj = new BDLocalidad();
         ResultSet datos = obj.cargarcbxdptos();
         return datos;
     }
     
      public String getId_dptos(String nom) {
         BDLocalidad obj = new BDLocalidad();
         return obj.getId_dptos(nom);
     }
      
}
