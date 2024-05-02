package co.edu.uniquindio.parcial2.patrones.factoryMethod.factory;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Factory;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.factory.services.Producto;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Bicicleta;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.Coche;

public class VehiculoFactory implements Factory {

    @Override
    public Producto crearProducto(String tipo) {
        switch (tipo) {
            case "eco-friendly": {
                return new Bicicleta("todoterreno","GW","342-123-153",2000000);
            }
            case "clasico": {
                return new Coche("Camioneta", "Toyota", "GHF208", 120000000);
            }
        }
        return null;
    }
}
