package org.example.structural;

public class NewPaymentGateway {

    public boolean authenticate(String apiKey) {
        return true;
    }

    public boolean sendPayment(double amount) {
        System.out.println("Paiement de " + amount + "€");
        return true;
    }
}
