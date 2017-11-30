/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.login;

/**
 *
 * @author USUARIO
 */
public class Ctrllogin {
    static String Usuario, Us;
    static String Clave, Cl;

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
        login obj = new login();
        obj.getCountUsu();
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
        login obj = new login();
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
}
