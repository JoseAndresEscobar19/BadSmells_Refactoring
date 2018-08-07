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
public class Desarrollador {

    Empleado empleado;

    public Desarrollador(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void printInfo() {
        empleado.print();
    }

}
