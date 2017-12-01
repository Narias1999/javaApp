/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers;

import Models.BDcontratodistin;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class Ctrlcontratodistin {
    
    public void guardar(String tp_ctto , String num_doc , String nom_pers , String dir , String cel , String correo , String fch_ini , String fch_term , String serv_ctto , int val_ctto , int aporte_soc , int aporte_arl , int aporte_pension , int arl , String vto_soat , String vto_tecno , int tipo){      
        BDcontratodistin objctrl=new BDcontratodistin();
        objctrl.guardar(tp_ctto, num_doc, nom_pers, dir, cel, correo, fch_ini, fch_term, serv_ctto, val_ctto, aporte_soc, aporte_arl, aporte_pension, arl, vto_soat, vto_tecno, tipo);
    }
    public void actualizar(String tp_ctto , String num_doc , String nom_pers , String dir , String cel , String correo , String fch_ini , String fch_term , String serv_ctto , int val_ctto , int aporte_soc , int aporte_arl , int aporte_pension , int arl , String vto_soat , String vto_tecno , int tipo){
        BDcontratodistin objctrl=new BDcontratodistin();
        objctrl.actualizar(tipo, tp_ctto, num_doc, nom_pers, dir, cel, correo, fch_ini, fch_term, serv_ctto, val_ctto, aporte_soc, aporte_arl, aporte_pension, arl, vto_soat, vto_tecno, tipo);
        
    }
    public ResultSet cargartabla(int id){
        ResultSet datos;
        BDcontratodistin objctrl=new BDcontratodistin();
         datos= objctrl.cargartabla(id);
        return datos;
        
    }
    public void eliminar(int id){
     BDcontratodistin objctrl=new BDcontratodistin();
     objctrl.eliminar(id);
    }
}
