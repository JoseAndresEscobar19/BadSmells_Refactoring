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
public class JuegoAdolescentes extends Juego{

    @Override
    public void mostrarDatosYPrecio() {
        System.out.println(this.titulo + " es para adolescentes y cuesta " + (this.precio * this.descuento));
    }
    
}
