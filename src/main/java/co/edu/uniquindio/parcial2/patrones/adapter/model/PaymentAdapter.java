package co.edu.uniquindio.parcial2.patrones.adapter.model.;

public class PaymentAdapter implements ModernPaymentGateway() {
    private LegacyPaymentSystem legacyPaymentSystem;

    public PaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        // Adaptación de la interfaz moderna al sistema heredado
        legacyPaymentSystem.makeLegacyPayment(amount);
    }
}