/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BD_Datos_contrato;
import java.sql.ResultSet;

/**
 *
 * @author HERMANOS ALBA
 */
public class Ctrl_Datos_contrato {
    public void guardar(String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, String nit, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {
        BD_Datos_contrato  ObjBD_datos  = new BD_Datos_contrato();
        ObjBD_datos.guardar( tp_ctto, num_doc, fch_ing, fch_retiro, institucion, nit, cod_zona, cod_ciudad, salario_basico, cod_bancos, tp_cta, num_cta, periodo_pago, cod_fon_salud, cod_arl, atep, tipo);
    }

    public void actualizar(String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, String nit, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {
        BD_Datos_contrato ObjBD = new BD_Datos_contrato();
        ObjBD.actualizar(tp_ctto, num_doc, fch_ing, fch_retiro, institucion, nit, cod_zona, cod_ciudad, salario_basico, cod_bancos, tp_cta, num_cta, periodo_pago, cod_fon_salud, cod_arl, atep, tipo);

    }
     public ResultSet cargarDatos(String num_doc) {
        ResultSet datos;
        BD_Datos_contrato ObjBD = new BD_Datos_contrato();
        datos = ObjBD.cargarDatos(num_doc);
        return datos;
    }
    public void Eliminar(String num_doc){
        BD_Datos_contrato ObjBD= new BD_Datos_contrato();
        ObjBD.Eliminar(num_doc);
    }
}
