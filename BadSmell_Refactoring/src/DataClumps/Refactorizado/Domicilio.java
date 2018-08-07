/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Refactorizado;

/**
 *
 * @author josea
 */
public class Domicilio {
    
    String codigoPostal;
    String ciudad;
    String pais;

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

    public String mostrarDireccionTotal() {
        return this.pais + ", " + this.ciudad + ", " + this.codigoPostal;
    }
    
}
