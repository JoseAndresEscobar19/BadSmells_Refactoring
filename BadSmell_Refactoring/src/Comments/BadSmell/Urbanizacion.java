/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.BadSmell;

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
    /**
     * Este metodo se utiliza para poder obtener las ganancias totales de las casas vendidas
     * teniendo en cuenta el modelo y el tipo de casa para conocer los descuentos
     * @return valor de las ganancias
     */
    public float calcularTotalCasa(){
        float total=0;
        /**
         * Se obtiene el valor de la casa y se lo multiplica por el descuento que tenga.
         * Luego se ve si tiene piscina y jardin, si es cierto, entonces no se realiza descuento adicional
         * Sino, se realiaz un descuento extra y se retorna el valor.
         */
        total = casas.stream().map((casa) -> (casa.getCosto()*casa.getDescuento())*((casa.isTieneJardin() && casa.tienePiscina())?1f:0.7f)).reduce(total, (accumulator, _item) -> accumulator + _item);
        return total;
    }
}
