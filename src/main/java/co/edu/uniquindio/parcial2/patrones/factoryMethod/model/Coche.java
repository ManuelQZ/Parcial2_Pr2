package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;

public class Coche extends Vehiculo implements Producto {

    public Coche(String nombre, String marca, String placa, int precio) {
        super(nombre, marca, placa, precio);
    }

    @Override
    public String mostrarDetalles() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Coche{} " + super.toString();
    }
}
