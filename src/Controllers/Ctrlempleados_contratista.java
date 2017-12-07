/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BDempleados_contratista;

/**
 *
 * @author ADMIN
 */
public class Ctrlempleados_contratista {

    BDempleados_contratista obj = new BDempleados_contratista();

    String num_doc, nom, apellido, tp_doc, f_expedicion, dpto_cod, f_nac, cod_dptos, RH, genero, est_civil, dir, tlf, correo, foto;
    int cod_ciudad, cod_ciud, edad, num_hijos, tipo;

    public void Guadar() {
        obj.Guardar(num_doc, nom, apellido, tp_doc, f_expedicion, dpto_cod, 0, f_nac, cod_dptos, 0, RH, genero, 0, 0, est_civil, dir, tlf, correo, foto, 0);
    }

    public void Actualizar() {
        obj.actualizar(num_doc, nom, apellido, tp_doc, f_expedicion, dpto_cod, 0, f_nac, cod_dptos, 0, RH, genero, 0, 0, est_civil, dir, tlf, correo, foto, 0);
    }

    public void Eliminar() {
        obj.eliminar(num_doc);
    }

    public void CargarDatos() {
        obj.cargarDatos(num_doc);
    }

    public void Buscar() {
        obj.Buscar(num_doc);
    }
}
