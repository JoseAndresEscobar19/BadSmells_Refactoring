/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Refactorizado;

/**
 *
 * @author josea
 */
public class CalcularPrecioJuego {
    private Juego juego;

    public CalcularPrecioJuego(Juego juego) {
        this.juego = juego;
    }
    
    
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    public void obtenerPrecioTotal(){
        juego.mostrarDatosYPrecio();
    }
}
