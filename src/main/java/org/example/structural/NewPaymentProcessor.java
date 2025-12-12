package org.example.structural;

public class NewPaymentProcessor {

    public boolean authenticate(String apiKey) {
        return true;
    }

    public boolean sendPayment(double amount) {
        System.out.println("Paiement de " + amount + "€");
        return true;
    }
}
