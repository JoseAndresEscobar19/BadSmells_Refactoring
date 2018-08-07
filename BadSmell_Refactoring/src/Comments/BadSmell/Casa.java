/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.BadSmell;

/**
 *
 * @author josea
 */
public class Casa {
    private float costo;
    private int numeroPisos;
    private boolean tienePiscina;
    private boolean tieneJardin;
    private float descuento;

    public Casa(float costo, int numeroPisos, boolean tienePiscina, boolean tieneJardin, float descuento) {
        this.costo = costo;
        this.numeroPisos = numeroPisos;
        this.tienePiscina = tienePiscina;
        this.tieneJardin = tieneJardin;
        this.descuento = descuento;
    }
    
    
    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public boolean tienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public boolean isTieneJardin() {
        return tieneJardin;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
}
