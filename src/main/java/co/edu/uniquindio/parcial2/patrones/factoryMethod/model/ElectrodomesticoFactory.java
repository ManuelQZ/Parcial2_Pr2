package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.ProductoFactory;

public class ElectrodomesticoFactory implements ProductoFactory {

    @Override
    public Producto createProducto() {
        // Lógica para crear un producto de la familia de electrodomésticos
        // Puede ser un refrigerador, televisor o lavadora
        return new Refrigerador("Refrigerador básico", 30.0); // O nuevo Televisor() o nueva Lavadora()
    }
}
