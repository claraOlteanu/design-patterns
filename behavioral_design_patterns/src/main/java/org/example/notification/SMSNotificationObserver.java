package org.example.notification;

public class SMSNotificationObserver implements Observer {
    private final String phoneNumber;

    public SMSNotificationObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}

