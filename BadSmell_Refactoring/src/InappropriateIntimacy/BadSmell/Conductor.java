/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropriateIntimacy.BadSmell;

/**
 *
 * @author josea
 */
public class Conductor {

    private String nombre;
    private String apellido;
    public Licencia licencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public String RiesgoDePerderLicencia() {
        if (licencia.getPuntosEliminados() > 10) {
            return "Alto";
        }
        if (licencia.getPuntosEliminados() > 5) {
            return "Medio";
        }
        return "Bajo";

    }

}
