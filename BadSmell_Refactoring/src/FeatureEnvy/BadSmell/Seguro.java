/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.BadSmell;

/**
 *
 * @author josea
 */
public class Seguro {
    private Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public void mostrarResultados(){
        if(user.ingresosTotales(10)>1000 && user.getIngresos()>600)
            System.out.println("El usuario "+user.datosUser()+" tiene grandes ganancias");
        else{
            System.out.println("El usuario "+user.datosUser()+" tiene ganancias normales");
        }
    }
}
