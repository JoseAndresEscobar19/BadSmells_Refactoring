/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.BadSmell;

/**
 *
 * @author josea
 */
public class DatosUsuario {

    private String nombre;
    private String apellido;
    private String correo;
    private Domicilio dom;

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Domicilio getDomicilio() {
        return dom;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.dom = domicilio;
    }
}
