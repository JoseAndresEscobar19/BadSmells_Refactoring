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
public interface Empleado {

    public void agregar(Empleado empleado);

    public void eliminar(Empleado empleado);

    public Empleado getEmpleado(int i);

    public String getNombre();

    public double getSalario();

    public void print();
}
