package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;

public class Vehiculo {
    private String nombre;
    private String marca;
    private String placa;

    private int precio;

    public Vehiculo(String nombre, String marca, String placa, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.placa = placa;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", precio=" + precio +
                '}';
    }
}
