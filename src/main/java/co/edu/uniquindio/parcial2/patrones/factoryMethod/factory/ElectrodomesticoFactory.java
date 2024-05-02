package co.edu.uniquindio.parcial2.patrones.factoryMethod.factory;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Factory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Bicicleta;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Coche;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Lavadora;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Refrigerador;

public class ElectrodomesticoFactory implements Factory {
    @Override
    public Producto crearProducto(String tipo) {
        switch (tipo) {
            case "lavar-ropa": {
                return new Lavadora("lavadora", "LG", 1500000);
            }
            case "almacenar-comida": {
                return new Refrigerador("refri-inteligente", "Samsung", 5000000);
            }
        }
        return null;
    }
}