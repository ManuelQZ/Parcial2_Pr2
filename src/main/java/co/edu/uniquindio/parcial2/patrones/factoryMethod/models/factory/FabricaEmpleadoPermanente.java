class FabricaEmpleadosPermanentes implements FabricaEmpleados {
    @Override
    public Empleado crearEmpleado(String nombre, String apellido, String cedula, String email, String telefono, int salario, String bonos) {
        return new EmpleadoPermanente(nombre, apellido, cedula, email, telefono, salario, bonos);
    }
}