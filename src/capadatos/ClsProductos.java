package capadatos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClsProductos {

    private int _claveProducto;
    private String _nomProducto;
    private String _precioProducto;
    private int _cantProducto;
    private String _uniProducto;

    public ClsProductos() {
        _claveProducto = 0;
        _nomProducto = null;
        _precioProducto = null;
        _cantProducto = 0;
        _uniProducto = null;

    }
    
    public void leerProducto(ResultSet producto) throws SQLException{
        _claveProducto = producto.getInt("claveProducto");
        _nomProducto = producto.getString("nomProducto");
        _precioProducto = producto.getString("precioProducto");
        _cantProducto = producto.getInt("cantProducto");
        _uniProducto = producto.getString("unidProducto");       
    }

}
