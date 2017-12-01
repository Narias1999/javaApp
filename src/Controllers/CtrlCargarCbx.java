/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BDCargarCbx;
import java.sql.ResultSet;

/**
 *
 * @author Mariela-pc
 */
public class CtrlCargarCbx {

    public ResultSet cargarCBX_FondoSalud() {
        BDCargarCbx obj = new BDCargarCbx();
        ResultSet datos = obj.cargarCBX_FondoSalud();
        return datos;
    }

    public ResultSet cargarCBX_aseguradora() {
        BDCargarCbx Obj = new BDCargarCbx();
        ResultSet datos = Obj.cargarCBX_aseguradora();
        return datos;
    }

    public ResultSet cargarCBX_caja_comp() {
        BDCargarCbx obj = new BDCargarCbx();
        ResultSet datos = obj.cargarCBX_caja_comp();
        return datos;
    }

    public ResultSet cargarCBX_fondop() {
        BDCargarCbx obj = new BDCargarCbx();
        ResultSet datos = obj.cargarCBX_fondop();
        return datos;
    }

    public ResultSet cargarCBX_bancos() {
        BDCargarCbx obj = new BDCargarCbx();
        ResultSet datos = obj.cargarCBX_bancos();
        return datos;
    }

    public ResultSet cargarCBX_arl() {
        BDCargarCbx obj = new BDCargarCbx();
        ResultSet datos = obj.cargarCBX_arl();
        return datos;
    }

    public ResultSet getId_FondoSalud(String nom) {
        BDCargarCbx ObjId = new BDCargarCbx();
        ResultSet datos = ObjId.getId_FondoSalud(nom);
        return datos;
    }

    public ResultSet getId_aseguradora(String nom) {
        BDCargarCbx ObjId = new BDCargarCbx();
        ResultSet datos = ObjId.getId_aseguradora(nom);
        return datos;
    }

    public ResultSet getId_caja_comp(String nom) {
        BDCargarCbx ObjId = new BDCargarCbx();
        ResultSet datos = ObjId.getId_caja_comp(nom);
        return datos;
    }

    public ResultSet getId_fondop(String nom) {
        BDCargarCbx ObjId = new BDCargarCbx();
        ResultSet datos = ObjId.getId_fondop(nom);
        return datos;
    }

    public ResultSet getId_bancos(String nom) {
        BDCargarCbx ObjId = new BDCargarCbx();
        ResultSet datos = ObjId.getId_bancos(nom);
        return datos;
    }
    
        public ResultSet getId_arl(String nom) {
        BDCargarCbx ObjId = new BDCargarCbx();
        ResultSet datos = ObjId.getId_arl(nom);
        return datos;
    }

}
