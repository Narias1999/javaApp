/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;


/**
 *
 * @author PC
 */
public class BDLocalidad {

    Conexion conexion = new Conexion();
    Connection conex = conexion.getCempBD();

    public ResultSet cargarcbxZonas(String idciudad) {
        ResultSet datos = null;
        try {

            String sql = "select nom from zonas where cod_ciudad='"+idciudad+"'";
            Statement st = conex.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error cargarcbxdepartamento -- BDLocalidad" + e.getMessage());
        }
        return datos;

    }

    public String getId_Zonas(String nom) {
        String id = null;
        try {

            String sql = "select cod from zonas where nom = '" + nom + "'";
            Statement st = conex.createStatement();
           ResultSet data = st.executeQuery(sql);
           while(data.next()){
               id = data.getString("cod");
           }
        } catch (Exception e) {
            System.out.println("Error getId_Zonas -- BDLocalidad" + e.getMessage());
        }
        return id;

    }

    public ResultSet cargarcbxciudad(String idDepartamento) {
        ResultSet datos = null;
        try {

            String sql = "select nom from ciudad where dpto='"+idDepartamento+"'";
            Statement st = conex.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error cargarcbxciudad -- BDLocalidad" + e.getMessage());
        }
        return datos;

    }

    public String getId_ciudad(String nom) {
        String id = null;
        try {

            String sql = "select cod from ciudad where nom = '" + nom + "'";
            Statement st = conex.createStatement();
            ResultSet data = st.executeQuery(sql);
            while(data.next()){
            id = data.getString("cod");
            
        }
        } catch (Exception e) {
            System.out.println("Error getId_ciudad -- BDLocalidad" + e.getMessage());
        }
        return id;
    }

    public ResultSet cargarcbxdptos() {
        ResultSet datos = null;
        try {

            String sql = "select nom from dptos";
            Statement st = conex.createStatement();
            datos = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error cargarcbxdptos-- BDLocalidad" + e.getMessage());
        }
        return datos;

    }

    public String getId_dptos(String nom) {
        String id = null;
        try {

            String sql = "select cod from dptos where nom = '" + nom + "'";
            Statement st = conex.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                id = data.getString("cod");
            }
        } catch (Exception e) {
            System.out.println("Error getId_dptos -- BDLocalidad" + e.getMessage());
        }
        return id;

    }

}
