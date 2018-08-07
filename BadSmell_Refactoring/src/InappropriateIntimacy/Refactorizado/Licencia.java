/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropriateIntimacy.Refactorizado;

/**
 *
 * @author josea
 */
public class Licencia {

    private int puntosEliminados;

    public int getPuntosEliminados() {
        return puntosEliminados;
    }

    public void setPuntosEliminados(int puntosEliminados) {
        this.puntosEliminados = puntosEliminados;
    }

    public String RiesgoDePerderLicencia() {
        if (getPuntosEliminados() > 10) {
            return "Alto";
        }
        if (getPuntosEliminados() > 5) {
            return "Medio";
        }
        return "Bajo";

    }
}
