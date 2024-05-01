package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.ProductoFactory;

public class VehiculoFactory implements ProductoFactory {

    @Override
    public Producto createProducto() {
        // Lógica para crear un producto de la familia de vehículos
        // Puede ser un coche, motocicleta o bicicleta
        return new Coche("Coche estándar", 50.0); // O nueva Motocicleta() o nueva Bicicleta()
    }
}
