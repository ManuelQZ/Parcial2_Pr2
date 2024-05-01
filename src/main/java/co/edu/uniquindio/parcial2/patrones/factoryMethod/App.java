package co.edu.uniquindio.parcial2.patrones.factoryMethod;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.ElectrodomesticoFactory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.VehiculoFactory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.ProductoFactory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Producto;

public class App {

    public static void main(String[] args) {
        ProductoFactory vehiculoFactory = new VehiculoFactory();
        Producto coche = vehiculoFactory.createProducto();
        coche.mostrarDetalles();

        ProductoFactory electrodomesticoFactory = new ElectrodomesticoFactory();
        Producto refrigerador = electrodomesticoFactory.createProducto();
        refrigerador.mostrarDetalles();
    }
}