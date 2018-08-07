/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest.BadSmell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author josea
 */
public class Gerente implements Empleado {

    private String name;
    private double salary;
    List<Empleado> employees = new ArrayList<>();

    public Gerente(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void agregar(Empleado employee) {
        employees.add(employee);
    }

    @Override
    public Empleado getEmpleado(int i) {
        return employees.get(i);
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

        Iterator<Empleado> empleadoIterator = employees.iterator();
        while (empleadoIterator.hasNext()) {
            Empleado empleado = empleadoIterator.next();
            empleado.print();
        }
    }

    @Override
    public void eliminar(Empleado empleado) {
        employees.remove(empleado);
    }

}
