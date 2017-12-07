/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class BDlogin {
    Conexion Objcnx = new Conexion();
    Connection conexion = Objcnx.getCempBD();
    
    int CountUsu;
    public void validarLogin(String usuario , String contraseña ){
        try {
            String sql ="select count(usuario) from user where usuario = '"+usuario+"' and contraseña = '"+contraseña+"' ";
            Statement st = conexion.createStatement();
            ResultSet rsUsu = st.executeQuery(sql);
            
            while (rsUsu.next()) {
                CountUsu = rsUsu.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println("error en BDlogin"+e.getMessage());
        }
        
    }

    public int getCountUsu() {
        return CountUsu;
    }
    public ResultSet loadcombobox() {
        ResultSet datos = null;
        try {
            String sql = "Select usuario from usuarios";
            Statement st = conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error BD_t_login -- loadcbx1 " + e.getMessage());
        }
        return datos;
    }
}
