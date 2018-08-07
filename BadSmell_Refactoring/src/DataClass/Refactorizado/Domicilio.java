/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Refactorizado;

import DataClass.BadSmell.*;

/**
 *
 * @author josea
 */
public class Domicilio {
    private String codigoPostal;
    private String ciudad;
    private String pais;

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String datosDomicilio(){
        return getPais()+","+getCiudad()+","+getCodigoPostal();
    }
}
