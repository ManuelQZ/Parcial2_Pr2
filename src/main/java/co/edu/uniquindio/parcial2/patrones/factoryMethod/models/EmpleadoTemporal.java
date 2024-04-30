package co.edu.uniquindio.parcial2.patrones.factoryMethod.models;

public class EmpleadoTemporal extends Empleado {
    private String finContrato;
    public EmpleadoTemporal(String nombre, String apellido, String cedula, String email, String telefono, int salario, String finContrato) {
        super(nombre, apellido, cedula, email, telefono, salario);
        this.finContrato = finContrato;
    }
}