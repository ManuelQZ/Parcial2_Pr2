package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;

public class Bicicleta extends Vehiculo implements Producto {

    public Bicicleta(String nombre, String marca, String placa, int precio) {
        super(nombre, marca, placa, precio);
    }

    @Override
    public String mostrarDetalles() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Bicicleta{} " + super.toString();
    }
}
