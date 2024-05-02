package co.edu.uniquindio.parcial2.patrones.factoryMethod;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.ElectrodomesticoFactory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.VehiculoFactory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Electrodomestico;

public class App {

    public static void main(String[] args) {
        ElectrodomesticoFactory fabrica_electrodomesticos = new ElectrodomesticoFactory();
        Producto nevera = fabrica_electrodomesticos.crearProducto("almacenar-comida");
        System.out.println(nevera.mostrarDetalles());
        Producto lavadora = fabrica_electrodomesticos.crearProducto("lavar-ropa");
        System.out.println(lavadora.mostrarDetalles());

        VehiculoFactory fabrica_vehiculos = new VehiculoFactory();
        Producto micarrito = fabrica_vehiculos.crearProducto("clasico");
        System.out.println(micarrito.mostrarDetalles());
        Producto bici = fabrica_vehiculos.crearProducto("eco-friendly");
        System.out.println(bici.mostrarDetalles());
    }
}