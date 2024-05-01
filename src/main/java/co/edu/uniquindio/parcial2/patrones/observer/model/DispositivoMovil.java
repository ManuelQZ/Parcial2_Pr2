public class DispositivoMovil implements Observador {
    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        System.out.println("Dispositivo Móvil: Temperatura: " + temperatura + "C, Humedad: " + humedad + "%, Presión: " + presion + "Pa");
    }
}