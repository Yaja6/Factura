/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Freddy Alejandro
 */
public class ClsVendedores {
    private int _claveVendedores;
    private String _nomVendedores;
    private String _apellVendedores;
    private String _dirVendedores;
    private String _fechaVendedores;
    private String _numVendedores;
    private String _emailVendedores;
    
    public ClsVendedores(){
       _claveVendedores=0;
     _nomVendedores=null;
     _apellVendedores=null;
     _dirVendedores=null;
     _fechaVendedores=null;
    _numVendedores=null;
     _emailVendedores=null;
    }
    public void leer(ResultSet cliente) throws SQLException{
     _claveVendedores=cliente.getInt("claveVendedores");
     _nomVendedores=cliente.getString("nomVendedores");
     _apellVendedores=cliente.getString("apellVendedores");
     _dirVendedores=cliente.getString("dirVendedores");
     _fechaVendedores=cliente.getString("fechaVendedores");
    _numVendedores=cliente.getString("celVendedores");
     _emailVendedores=cliente.getString("emailVendedores");
    }

    public int getClaveVendedores() {
        return _claveVendedores;
    }

    public void setClaveVendedores(int _claveVendedores) {
        this._claveVendedores = _claveVendedores;
    }

    public String getNomVendedores() {
        return _nomVendedores;
    }

    public void setNomVendedores(String _nomVendedores) {
        this._nomVendedores = _nomVendedores;
    }

    public String getApellVendedores() {
        return _apellVendedores;
    }

    public void setApellVendedores(String _apellVendedores) {
        this._apellVendedores = _apellVendedores;
    }
    public String getDirVendedores() {
        return _dirVendedores;
    }

    public void setDirVendedores(String _dirVendedores) {
        this._dirVendedores = _dirVendedores;
    }

    public String getFechaVendedores() {
        return _fechaVendedores;
    }

    public void setFechaVendedores(String _fechaVendedores) {
        this._fechaVendedores = _fechaVendedores;
    }

    public String getNumVendedores() {
        return _numVendedores;
    }

    public void setNumVendedores(String _numVendedores) {
        this._numVendedores = _numVendedores;
    }

    public String getEmailVendedores() {
        return _emailVendedores;
    }

    public void setEmailVendedores(String _emailVendedores) {
        this._emailVendedores = _emailVendedores;
    }
    
}
