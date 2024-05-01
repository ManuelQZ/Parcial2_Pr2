package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;

public class Empleado extends Persona{

    ArrayList<Prestamo> listaPrestamosAsociados;
    private int  contadorPrestamo;

    public Empleado(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
        this.contadorPrestamo = 0;
    }

    public ArrayList<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }
    public int getContadorPrestamo() {
        return contadorPrestamo;
    }

    public void sumarPrestamo() {
        this.contadorPrestamo += 1;
    }
}
