/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest.Refactorizado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author josea
 */
public class Gerente {
    Empleado empleado;
    List<Empleado> empleados = new ArrayList<>();

    public Gerente(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }


    public void print(String nombre,double salario) {
        empleado.print();

        Iterator<Empleado> empleadoIterator = empleados.iterator();
        while (empleadoIterator.hasNext()) {
            Empleado emp = empleadoIterator.next();
            emp.print();
        }
    }

}
