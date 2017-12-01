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
public class login {
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
            System.out.println("Login BD"+e.getMessage());
        }
        
    }

    public int getCountUsu() {
        return CountUsu;
    }
}
