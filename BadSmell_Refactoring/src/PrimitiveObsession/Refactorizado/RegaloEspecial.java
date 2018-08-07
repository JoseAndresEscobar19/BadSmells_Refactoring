/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession.Refactorizado;

/**
 *
 * @author josea
 */
public class RegaloEspecial extends Regalo {

    @Override
    public void hacerRegalo() {
        System.out.println("Con mucho aprecio de " + this.origen + " para " + this.destino + "\n" + this.dedicatoria);
    }

}
