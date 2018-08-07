/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.BadSmell;

/**
 *
 * @author josea
 */
public class Juego {
    private String titulo;
    private String tipoJuego;
    private float precio;
    private String desarrollador;
    private String año;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

}
