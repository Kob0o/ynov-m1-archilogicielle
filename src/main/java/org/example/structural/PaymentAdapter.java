package org.example.structural;

public class PaymentAdapter implements OldPaymentGateway {
    private NewPaymentProcessor newProcessor;
    private static final String API_KEY = "api-key";

    public PaymentAdapter(NewPaymentProcessor newProcessor) {
        this.newProcessor = newProcessor;
    }

    @Override
    public boolean makePayment(String accountNumber, double amount) {
        if (!newProcessor.authenticate(API_KEY)) {
            System.out.println("Échec de l'authentification");
            return false;
        }

        boolean result = newProcessor.sendPayment(amount);

        if (result) {
            System.out.println("Paiement OK");
        }
        return result;
    }
}
