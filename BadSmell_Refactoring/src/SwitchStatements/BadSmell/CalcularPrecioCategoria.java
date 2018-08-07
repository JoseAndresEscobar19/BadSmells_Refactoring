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
public class CalcularPrecioCategoria {

    private Juego juego;

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public void obtenerPrecioTotal() {
        switch (juego.getTipoJuego()) {
            case "Niños":
                System.out.println(juego.getTitulo() + " es para niños y cuesta " + juego.getPrecio() * 0.5);
                break;
            case "Adolescentes":
                System.out.println(juego.getTitulo() + " es para adolescentes y cuesta " + juego.getPrecio() * 0.7);
                break;
            case "Adultos":
                System.out.println(juego.getTitulo() + " es para adultos y cuesta " + juego.getPrecio());
                break;
        }
    }

}
