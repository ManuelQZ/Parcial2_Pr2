public class EstacionCentral implements Observador {
    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        System.out.println("Estación Central: Temperatura: " + temperatura + "C, Humedad: " + humedad + "%, Presión: " + presion + "Pa");
    }
}