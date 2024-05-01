package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public class Refrigerador extends Producto{

    private int capacidadLitros;

    public Refrigerador(String nombre, double precioAlquiler) {
        super(nombre, precioAlquiler);
        this.capacidadLitros = 200;
    }

    // Método para mostrar detalles específicos del refrigerador
    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: Refrigerador");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio de alquiler por día: $" + getPrecioAlquiler());
        System.out.println("Capacidad en litros: " + capacidadLitros);
    }
}
