package co.edu.uniquindio.parcial2.patrones.factoryMethod;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.models.Empleado;

public class App {
    public static <FabricaEmpleado> void main(String[] args) {
        // Crear fábrica de empleados temporales
        FabricaEmpleado fabricaTemporales = new FabricaEmpleadosTemporales();
        // Crear empleado temporal utilizando la fábrica
        Empleado empleadoTemporal = fabricaTemporales.crearEmpleado("Juan", "Perez", "123456789", "juan@example.com", "123456789", 1500, "2024-12-31");
        System.out.println(empleadoTemporal.descripcion());

        // Crear fábrica de empleados permanentes
        FabricaEmpleado fabricaPermanentes = new FabricaEmpleadosPermanentes();
        // Crear empleado permanente utilizando la fábrica
        Empleado empleadoPermanente = fabricaPermanentes.crearEmpleado("Maria", "Gomez", "987654321", "maria@example.com", "987654321", 2000, "500");
        System.out.println(empleadoPermanente.descripcion());
    }
}