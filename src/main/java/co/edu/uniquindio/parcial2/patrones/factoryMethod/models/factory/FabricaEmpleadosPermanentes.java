package co.edu.uniquindio.parcial2.patrones.factoryMethod.models.factory;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.models.Empleado;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.models.EmpleadoPermanente;

public class FabricaEmpleadosPermanentes implements FabricaEmpleados {
    @Override
    public Empleado crearEmpleado(String nombre, String apellido, String cedula, String email, String telefono, int salario, String bonos) {
        return new EmpleadoPermanente(nombre, apellido, cedula, email, telefono, salario, bonos);
    }
}