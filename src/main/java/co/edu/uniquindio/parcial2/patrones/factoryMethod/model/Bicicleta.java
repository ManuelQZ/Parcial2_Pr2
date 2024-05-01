package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public class Bicicleta extends Producto{

    private final int capacidadPasajeros;

    public Bicicleta(String nombre, double precioAlquiler) {
        super(nombre, precioAlquiler);
        this.capacidadPasajeros = 1;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: Bicicleta");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio de alquiler por día: $" + getPrecioAlquiler());
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}
