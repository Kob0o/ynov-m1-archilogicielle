package org.example.structural;

public class PaymentAdapter implements OldPaymentGateway {
    private NewPaymentGateway newGateway;

    public PaymentAdapter(NewPaymentGateway newGateway) {
        this.newGateway = newGateway;
    }

    @Override
    public boolean makePayment(String accountNumber, double amount) {
        boolean result = newGateway.sendPayment(amount);

        if (result) {
            System.out.println("Paiement OK");
        }
        return result;
    }
}
