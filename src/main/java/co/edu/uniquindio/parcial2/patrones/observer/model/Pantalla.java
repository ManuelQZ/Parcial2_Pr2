public class Pantalla implements Observador {
    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        System.out.println("Pantalla: Temperatura: " + temperatura + "C, Humedad: " + humedad + "%, Presión: " + presion + "Pa");
    }
}