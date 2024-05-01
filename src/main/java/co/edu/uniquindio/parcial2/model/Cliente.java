package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;

public class Cliente extends Persona{

    ArrayList<Prestamo> listaPrestamosAsociados;
    private int  contadorPrestamo;

    public Cliente(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
        this.contadorPrestamo = 0;
    }

    public ArrayList<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }
    public void addPrestamo(Prestamo prestamo) {
        listaPrestamosAsociados.add(prestamo);
    }
    public int getContadorPrestamo() {
        return contadorPrestamo;
    }

    public void sumarPrestamo() {
        this.contadorPrestamo += 1;
    }
}
