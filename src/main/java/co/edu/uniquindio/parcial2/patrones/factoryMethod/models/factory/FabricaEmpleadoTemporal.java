class FabricaEmpleadosTemporales implements FabricaEmpleados {
    @Override
    public Empleado crearEmpleado(String nombre, String apellido, String cedula, String email, String telefono, int salario, String finContrato) {
        return new EmpleadoTemporal(nombre, apellido, cedula, email, telefono, salario, finContrato);
    }
}