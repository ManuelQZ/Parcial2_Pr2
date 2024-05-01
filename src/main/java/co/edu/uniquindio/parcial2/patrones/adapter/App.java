package co.edu.uniquindio.parcial2.patrones.adapter;

public class App {
    public static void App (String[] args) {
        // Crear una instancia del sistema de pago heredado
        LegacyPaymentSystem legacyPaymentSystem = new LegacyPaymentSystem();

        // Crear un adaptador para la pasarela de pagos moderna utilizando el sistema de pago heredado
        ModernPaymentGateway adapter = new PaymentAdapter(legacyPaymentSystem);

        // Utilizar el adaptador para procesar un pago utilizando la interfaz de la pasarela de pagos moderna
        adapter.processPayment(100.0);
    }
}