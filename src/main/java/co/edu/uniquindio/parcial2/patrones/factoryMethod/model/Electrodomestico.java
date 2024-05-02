package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;

public abstract class Electrodomestico implements Producto {
    private String nombre;
    private String marca;
    private int precio;

    public Electrodomestico(String nombre, String marca, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
