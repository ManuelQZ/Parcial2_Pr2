package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public class Producto {

    private String nombre;
    private double precioAlquiler;

    public Producto(String nombre, double precioAlquiler) {
        this.nombre = nombre;
        this.precioAlquiler = precioAlquiler;
    }

    // Métodos para obtener y establecer atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    // Método para mostrar detalles del producto
    public void mostrarDetalles() {

    }
}


