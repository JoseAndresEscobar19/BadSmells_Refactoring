/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Refactorizado;

import FeatureEnvy.BadSmell.*;

/**
 *
 * @author josea
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private float ingresos;
    private float tiempoTrabajando;

    public Usuario(String nombre, String apellido, float ingresos, float tiempoTrabajando) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ingresos = ingresos;
        this.tiempoTrabajando = tiempoTrabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public float ingresosTotales(float extras){
        float total=0;
        if(extras>0){
            this.ingresos+=extras;
        }
        total=this.ingresos+(tiempoTrabajando*0.07f);
        return total;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public float getTiempoTrabajando() {
        return tiempoTrabajando;
    }

    public void setTiempoTrabajando(float tiempoTrabajando) {
        this.tiempoTrabajando = tiempoTrabajando;
    }
    
    public String datosUser(){
        return "Nombre: "+this.nombre+"Apellido: "+this.apellido;
    }
    
    public void mostrarResultados(){
        if(ingresosTotales(10)>1000 && getIngresos()>600)
            System.out.println("El usuario "+datosUser()+" tiene grandes ganancias");
        else{
            System.out.println("El usuario "+datosUser()+" tiene ganancias normales");
        }
    }
    
}
