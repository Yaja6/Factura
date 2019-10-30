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

    public void leerProducto(ResultSet producto) throws SQLException {
        _claveProducto = producto.getInt("claveProducto");
        _nomProducto = producto.getString("nomProducto");
        _precioProducto = producto.getString("precioProducto");
        _cantProducto = producto.getInt("cantProducto");
        _uniProducto = producto.getString("unidProducto");
    }

    public int getClaveProducto() {
        return _claveProducto;
    }

    public void setClaveProducto(int _claveProducto) {
        this._claveProducto = _claveProducto;
    }

    public String getNomProducto() {
        return _nomProducto;
    }

    public void setNomProducto(String _nomProducto) {
        this._nomProducto = _nomProducto;
    }

    public String getPrecioProducto() {
        return _precioProducto;
    }

    public void setPrecioProducto(String _precioProducto) {
        this._precioProducto = _precioProducto;
    }

    public int getCantProducto() {
        return _cantProducto;
    }

    public void setCantProducto(int _cantProducto) {
        this._cantProducto = _cantProducto;
    }

    public String getUniProducto() {
        return _uniProducto;
    }

    public void setUniProducto(String _uniProducto) {
        this._uniProducto = _uniProducto;
    }

}
