/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest.Refactorizado;

/**
 *
 * @author josea
 */
public class Empleado {

    private double salario;
    private String nombre;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getNombre());
        System.out.println("Salary =" + getSalario());
        System.out.println("-------------");
    }
}
