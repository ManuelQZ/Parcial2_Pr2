package co.edu.uniquindio.parcial2.factory;

import co.edu.uniquindio.parcial2.model.*;

import java.util.Date;

public class ModelFactory {

    private static ModelFactory instance;
    private PrestamoUq prestamoUq;

    private ModelFactory() {
        this.prestamoUq = new PrestamoUq();
        this.generarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public PrestamoUq getPrestamoUq() {
        return prestamoUq;
    }

    public void generarDatos() {
        // Generar datos para Cliente
        Cliente cliente1 = new Cliente("Juan", "García", "123456789", "30");
        Cliente cliente2 = new Cliente("María", "López", "987654321", "25");
        Cliente cliente3 = new Cliente("Pedro", "Martínez", "567891234", "40");
        Cliente cliente4 = new Cliente("Ana", "Rodríguez", "456789123", "35");
        Cliente cliente5 = new Cliente("Luis", "Gómez", "321654987", "28");

        prestamoUq.getListaClientes().add(cliente1);
        prestamoUq.getListaClientes().add(cliente2);
        prestamoUq.getListaClientes().add(cliente3);
        prestamoUq.getListaClientes().add(cliente4);
        prestamoUq.getListaClientes().add(cliente5);

        // Generar datos para Empleado
        Empleado empleado1 = new Empleado("Carlos", "González", "111111111", "35");
        Empleado empleado2 = new Empleado("Laura", "Martínez", "222222222", "28");
        Empleado empleado3 = new Empleado("Pedro", "Díaz", "333333333", "40");

        prestamoUq.getListaEmpleados().add(empleado1);
        prestamoUq.getListaEmpleados().add(empleado2);
        prestamoUq.getListaEmpleados().add(empleado3);

        // Generar datos para Prestamo
        Prestamo prestamo1 = new Prestamo("001", new Date(), new Date(), "Prestamo 1", cliente1, empleado1);
        Prestamo prestamo2 = new Prestamo("002", new Date(), new Date(), "Prestamo 2", cliente2, empleado2);
        Prestamo prestamo3 = new Prestamo("003",new Date(), new Date(), "Prestamo 3", cliente1, empleado3);
        Prestamo prestamo4 = new Prestamo("004", new Date(), new Date(), "Prestamo 4", cliente2, empleado1);

        prestamoUq.getListaPrestamos().add(prestamo1);
        prestamoUq.getListaPrestamos().add(prestamo2);
        prestamoUq.getListaPrestamos().add(prestamo3);
        prestamoUq.getListaPrestamos().add(prestamo4);

        // Generar datos para Objeto
        Objeto portatil = new Objeto("001", "Portátil Universitario", prestamo1, Objeto.Estado.DISPONIBLE);
        Objeto microscopio = new Objeto("002", "Microscopio Avanzado", prestamo2, Objeto.Estado.NODISPONIBLE);
        Objeto calculadora = new Objeto("003", "Calculadora Científica", prestamo3, Objeto.Estado.DISPONIBLE);
        Objeto libro = new Objeto("004", "Libro de Texto", prestamo4, Objeto.Estado.NODISPONIBLE);
        Objeto cuaderno = new Objeto("005", "Cuaderno de Apuntes", prestamo1, Objeto.Estado.DISPONIBLE);

        prestamoUq.addObjeto(portatil);
        prestamoUq.addObjeto(microscopio);
        prestamoUq.addObjeto(calculadora);
        prestamoUq.addObjeto(libro);
        prestamoUq.addObjeto(cuaderno);
    }
}