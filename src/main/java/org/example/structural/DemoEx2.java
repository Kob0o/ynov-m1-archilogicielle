package org.example.structural;

public class DemoEx2 {
    public static void main(String[] args) {
        EmailService nouveauServiceEmail = new EmailService();

        SmsService notificationSystem = new NotificationAdapter(nouveauServiceEmail);

        System.out.println("test");
        notificationSystem.sendSms("0600000000", "test");
    }
}

