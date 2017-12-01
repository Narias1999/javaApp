/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class Conexion {

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        Connection ConexBD = null;
    public Connection getCempBD (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            ConexBD = DriverManager.getConnection("jdbc:mysql://localhost/sena_adsi","root","");
        }catch (Exception e){
            System.out.println("Error de conexion"+e.getMessage());
        }
        return ConexBD;
    }
}
