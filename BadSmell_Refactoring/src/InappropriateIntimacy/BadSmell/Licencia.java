/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropriateIntimacy.BadSmell;

/**
 *
 * @author josea
 */
public class Licencia {

    public Conductor conductor;
    private int puntosEliminados;

    public int getPuntosEliminados() {
        return puntosEliminados;
    }

    public void setPuntosEliminados(int puntosEliminados) {
        this.puntosEliminados = puntosEliminados;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    public String datosConductor(){
        return conductor.getNombre() + "," + conductor.getApellido()+", "+puntosEliminados;
    }
    
}
