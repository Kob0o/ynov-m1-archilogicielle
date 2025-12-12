package org.example.structural;

public class EmailService {

    public void sendEmail(String email, String subject, String body) {
        System.out.println("mail");
        System.out.println("à: " + email);
        System.out.println("Sujet: " + subject);
        System.out.println("Corps: " + body);
    }
}
