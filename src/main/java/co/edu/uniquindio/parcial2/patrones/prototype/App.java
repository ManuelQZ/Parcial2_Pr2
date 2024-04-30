package co.edu.uniquindio.parcial2.patrones.prototype;

public class App {
        public static void main(String[] args) {
        Vehiculo vehiculoOriginal = new Vehiculo("Toyota", "Corolla", "Blanco");
        vehiculoOriginal.mostrarInformacion();

        try {
            Vehiculo vehiculoClonado = vehiculoOriginal.clone();
            vehiculoClonado.mostrarInformacion();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}