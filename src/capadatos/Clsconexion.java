/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class Clsconexion {
    private Connection base;
    private Statement tabla;
    private ResultSet ventas;
    
    public Clsconexion (String dirbase)
    {
        try {
            base = DriverManager.getConnection("jdbc:ucanacces://"+ dirbase);
            System.out.println("conexion exitosa");
           tabla = (Statement) base.createStatement(ResultSet.FETCH_UNKNOWN, ResultSet.TYPE_SCROLL_SENSITIVE);
            
        }catch (Exception err)
        {
            System.out.println("conexion fallida " + err);
        }
    }
    
    public ResultSet ventas ()
    {
        return ventas;
    }
}
