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
public class HacerRegalo {

    private Regalo tipoRegalo;

    public Regalo getTipoRegalo() {
        return tipoRegalo;
    }

    public void setTipoRegalo(Regalo tipoRegalo) {
        this.tipoRegalo = tipoRegalo;
    }

    public void HacerRegalo(){
        tipoRegalo.hacerRegalo();
    }

}
