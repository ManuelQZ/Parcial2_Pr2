package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public class Refrigerador extends Electrodomestico{

    public Refrigerador(String nombre, String marca, int precio) {
        super(nombre, marca, precio);
    }

    @Override
    public String mostrarDetalles() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Refrigerador{} " + super.toString();
    }
}
