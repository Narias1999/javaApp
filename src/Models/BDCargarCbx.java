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
 * @author Mariela-pc
 */
public class BDCargarCbx {
    
    Conexion Conx = new Conexion();
    Connection Conexion = Conx.getCempBD();

    public ResultSet cargarCBX_FondoSalud() {
        ResultSet datos = null;
        try {
            String sql = "select nom from fondo_salud";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx-- cargarCBX_FondoSalud " + e.getMessage());
        }
        return datos;
    }

    public ResultSet getId_FondoSalud(String nom) {
        ResultSet datos = null;
        try {
            String sql = "select cod from fondo_salud where nom ='" + nom + "'";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx -- getId_FondoSalud " + e.getMessage());
        }
        return datos;
    }

    public ResultSet cargarCBX_aseguradora() {
        ResultSet datos = null;
        try {
            String sql = "select nom from aseguradora";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx-- cargarCBX_aseguradora " + e.getMessage());
        }
        return datos;
    }

    public ResultSet getId_aseguradora(String nom) {
        ResultSet datos = null;
        try {
            String sql = "select cod from aseguradora where nom ='" + nom + "' ";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx -- getId_aseguradora " + e.getMessage());
        }
        return datos;
    }

    public ResultSet cargarCBX_caja_comp() {
        ResultSet datos = null;
        try {
            String sql = "select nom from caja_compensacion";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx-- cargarCBX_caja_comp " + e.getMessage());
        }
        return datos;
    }

    public ResultSet getId_caja_comp(String nom) {
        ResultSet datos = null;
        try {
            String sql = "select cod from caja_compensacion where nom ='" + nom + "' ";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx -- getId_caja_comp " + e.getMessage());
        }
        return datos;
    }

    public ResultSet cargarCBX_fondop() {
        ResultSet datos = null;
        try {
            String sql = "select nom from fondo_pensiones";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx-- cargarCBX_fondop " + e.getMessage());
        }
        return datos;
    }

    public ResultSet getId_fondop(String nom) {
        ResultSet datos = null;
        try {
            String sql = "select cod from fondo_pensiones where nom ='" + nom + "' ";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx -- getId_fondop " + e.getMessage());
        }
        return datos;
    }

    public ResultSet cargarCBX_bancos() {
        ResultSet datos = null;
        try {
            String sql = "select nom from bancos";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx-- cargarCBX_bancos " + e.getMessage());
        }
        return datos;
    }

    public ResultSet getId_bancos(String nom) {
        ResultSet datos = null;
        try {
            String sql = "select cod from bancos where nom ='" + nom + "' ";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx -- getId_bancos " + e.getMessage());
        }
        return datos;
    }

    public ResultSet cargarCBX_arl() {
        ResultSet datos = null;
        try {
            String sql = "select nom from arl";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx-- cargarCBX_arl " + e.getMessage());
        }
        return datos;
    }

    public ResultSet getId_arl(String nom) {
        ResultSet datos = null;
        try {
            String sql = "select cod from arl where nom ='" + nom + "' ";
            Statement st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("error e BDCargarCbx -- getId_arl" + e.getMessage());
        }
        return datos;
    }
}
