/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BDlogin;
import Models.BDlogin;
import java.sql.ResultSet;

/**
 *
 * @author USUARIO
 */
public class Ctrllogin {
    static String Usuario, Us;
    static String Clave, Cl;

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
        BDlogin obj = new BDlogin();
        obj.getCountUsu();
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
        BDlogin obj = new BDlogin();
        obj.getCountUsu();
    }

    public int validar() {
        int x;
        if (Usuario.equals(Us) && Clave.equals(Cl)) {
            x = 1;

        } else {
            x = 0;

        }
        return x;

    }
    public ResultSet getcombobox() {
        BDlogin obBD = new BDlogin();
        ResultSet rs = obBD.loadcombobox();
        return rs;
    }
}
