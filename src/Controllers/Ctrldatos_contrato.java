/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BDdatos_contrato;
import java.sql.ResultSet;

/**
 *
 * @author USUARIO
 */
public class Ctrldatos_contrato {

    public void getfrmduracionobras(String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {
        BDdatos_contrato objebd = new BDdatos_contrato();
        objebd.guardar1(tp_ctto, num_doc, fch_ing, fch_retiro, institucion, tp_cta, cod_zona, cod_ciudad, salario_basico, cod_bancos, tp_cta, num_cta, periodo_pago, cod_fon_salud, cod_arl, atep, tipo);
    }

    public void actualizar(int id, String tp_ctto, String num_doc, String fch_ing, String fch_retiro, String institucion, int cod_zona, int cod_ciudad, int salario_basico, String cod_bancos, String tp_cta, int num_cta, String periodo_pago, String cod_fon_salud, String cod_arl, int atep, int tipo) {
        BDdatos_contrato objebd = new BDdatos_contrato();
        objebd.actualizar(id, tp_ctto, num_doc, fch_ing, fch_retiro, institucion, tp_cta, cod_zona, cod_ciudad, salario_basico, cod_bancos, tp_cta, num_cta, periodo_pago, cod_fon_salud, cod_arl, atep, tipo);
    }

    public void eliminar(int id) {
        BDdatos_contrato objbd = new BDdatos_contrato();
        objbd.eliminar(id);
    }

    public ResultSet cargarDatos(int id) {
        ResultSet datos;

        BDdatos_contrato obje = new BDdatos_contrato();
        datos = obje.cargarDatos(id);
        return datos;
    }
}
