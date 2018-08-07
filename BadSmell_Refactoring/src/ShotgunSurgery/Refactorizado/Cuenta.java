/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.Refactorizado;

import ShotgunSurgery.BadSmell.*;

/**
 *
 * @author josea
 */
public class Cuenta {

    private String tipo;
    private String numeroCuenta;
    private int cantidad;

    public Cuenta(String tipo, String numeroCuenta, int cantidad) {
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.cantidad = cantidad;
    }

    private boolean dineroDisponible() {
        return cantidad <= 500;
    }
    
    public void mensajeAlerta() {
        System.out.println("La cantidad disponible debe ser mayor a 200");
    }

    public void debitar(int debit) {
        if (dineroDisponible()) {
            mensajeAlerta();
        }
        cantidad = cantidad - debit;
        System.out.println("Su saldo es " + cantidad);
    }

    public void transferir(Cuenta origen, Cuenta destino, int cantidadAcreditar) {
        if (dineroDisponible()) {
            mensajeAlerta();
        }
        destino.cantidad = cantidad + cantidadAcreditar;
    }

    
}
