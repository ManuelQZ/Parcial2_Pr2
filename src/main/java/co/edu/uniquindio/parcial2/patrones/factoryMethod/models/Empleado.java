public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String email;
    protected String telefono;
    protected int salario;

    public Empleado(String nombre, String apellido, String cedula, String email, String telefono, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.salario = salario;
    }

}