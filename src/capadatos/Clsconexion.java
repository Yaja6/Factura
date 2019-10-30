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
import java.sql.SQLException;



public class Clsconexion {
   private Connection base;
    private java.sql.Statement tabla;
    private ResultSet ventas;

   public Clsconexion(String dirbase) {
        try {
            base = DriverManager.getConnection("jdbc:ucanaccess://" + dirbase);
            System.out.println("***CONEXIÓN EXITOSA***");
            tabla = base.createStatement(ResultSet.FETCH_UNKNOWN, ResultSet.TYPE_SCROLL_SENSITIVE);

        } catch (Exception err) {
            System.out.println("***CONEXIÓN FALLIDA***" + err);
        }

    }

    public ResultSet _ventas() {
        return ventas;
    }

    
    public boolean consulta(String _tabla) throws SQLException {
        boolean comprobar = false;
        String comando = " SELECT * FROM " + _tabla;
        ventas = null;
        tabla.execute(comando);
        ventas = tabla.getResultSet();
        if (ventas != null) {
            comprobar = true;
        }
        return comprobar;
    }
    
     public boolean vercompra(int clave) throws SQLException {
        ventas = null;
        boolean comprobar = false;
        String comando = "SELECT * FROM TbProductos WHERE claveProducto  = " + clave;
        tabla.execute(comando);
        ventas = tabla.getResultSet();
        if (ventas != null) {
            comprobar = true;
        }
        return comprobar;
    }

}
