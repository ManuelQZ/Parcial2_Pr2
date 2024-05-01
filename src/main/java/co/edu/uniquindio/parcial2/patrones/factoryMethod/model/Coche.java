package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public class Coche extends Producto {

    private int capacidadPasajeros;

    public Coche(String nombre, double precioAlquiler) {
        super(nombre, precioAlquiler);
        this.capacidadPasajeros = 5;
    }

    // Método para mostrar detalles específicos del coche
    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: Coche");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio de alquiler por día: $" + getPrecioAlquiler());
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}
