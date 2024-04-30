package co.edu.uniquindio.parcial2.patrones.factoryMethod.models;

public class EmpleadoPermanente extends Empleado {
    private String bonos;
    public EmpleadoPermanente(String nombre, String apellido, String cedula, String email, String telefono, int salario, String bonos) {
        super(nombre, apellido, cedula, email, telefono, salario);
        this.bonos = bonos;
    }
}