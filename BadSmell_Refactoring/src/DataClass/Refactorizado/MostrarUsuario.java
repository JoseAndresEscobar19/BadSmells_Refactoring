/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Refactorizado;

import DataClass.BadSmell.*;

/**
 *
 * @author josea
 */
public class MostrarUsuario {
    private DatosUsuario datos;

    public MostrarUsuario(DatosUsuario datos) {
        this.datos = datos;
    }
    
    public String datosCompletos(){
        return datos.datosCompletos();
    }
}
