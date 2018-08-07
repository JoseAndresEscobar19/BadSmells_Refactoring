/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest.BadSmell;

/**
 *
 * @author josea
 */
public class Desarrollador implements Empleado {

    private String name;
    private double salary;

    public Desarrollador(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void agregar(Empleado employee) {
        //No se usa en esta clase
    }

    @Override
    public Empleado getEmpleado(int i) {
        //No se usa en esta clase
        return null;
    }

    @Override
    public String getNombre() {
        return name;
    }

    @Override
    public double getSalario() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getNombre());
        System.out.println("Salary =" + getSalario());
        System.out.println("-------------");
    }

    @Override
    public void eliminar(Empleado empleado) {
        //No se usa en esta clase
    }
}
