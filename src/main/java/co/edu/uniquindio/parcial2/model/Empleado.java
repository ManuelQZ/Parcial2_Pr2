package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;

public class Empleado extends Persona{

    ArrayList<Prestamo> listaPrestamosAsociados;


    public Empleado(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
    }

    public ArrayList<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }
}
