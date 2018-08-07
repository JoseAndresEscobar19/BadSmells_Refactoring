/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Refactorizado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josea
 */
public class Urbanizacion {
    private List<Casa> casas;
    private int numeroDeHabitantes;
    private int numeroDeVisitas;

    public Urbanizacion() {
        casas=new ArrayList<>();
    }
    
    
    public void agregarCasa(Casa casa){
        casas.add(casa);
    }
    
    public float calcularGananciasTotalesVentas(){
        float total=0;
        for (Casa casa : casas) {
            float totalDescuento=casa.getCosto()*casa.getDescuento();
            if(!(casa.tienePiscina() && casa.isTieneJardin()))
                totalDescuento*=0.7f;
            total+=totalDescuento;
        }
        return total;
    }
}
