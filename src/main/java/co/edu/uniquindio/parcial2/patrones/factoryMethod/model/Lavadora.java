package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public class Lavadora extends Electrodomestico{

    public Lavadora(String nombre, String marca, int precio) {
        super(nombre, marca, precio);
    }

    @Override
    public String mostrarDetalles() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Lavadora{} " + super.toString();
    }
}
