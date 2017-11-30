/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class Conexion {
        Connection ConexBD = null;
    public Connection getCempBD (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            ConexBD = DriverManager.getConnection("jdbc:mysql://localhost/Sena_ADSI","root","");
        }catch (Exception e){
            System.out.println("Error de conexion"+e.getMessage());
        }
        return ConexBD;
    }
}
