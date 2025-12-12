package org.example.structural;

import java.util.HashMap;
import java.util.Map;

public class NotificationAdapter implements SmsService {
    private EmailService emailService;

    private static final Map<String, String> phoneToEmailMap = new HashMap<>();

    static {
        phoneToEmailMap.put("0600000000", "test@exemple.com");
    }

    public NotificationAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    private String getEmailFromPhoneNumber(String number) {
        return phoneToEmailMap.getOrDefault(number, "default@exemple.com");
    }

    @Override
    public void sendSms(String number, String message) {
        String recipientEmail = getEmailFromPhoneNumber(number);
        String subject = "test";
        emailService.sendEmail(recipientEmail, subject, message);
    }
}
