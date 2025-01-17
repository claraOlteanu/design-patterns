package org.example;

import org.example.notification.EmailNotificationObserver;
import org.example.notification.NotificationService;
import org.example.notification.SMSNotificationObserver;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.addObserver(new EmailNotificationObserver("userX@instance.com"));
        notificationService.addObserver(new SMSNotificationObserver("0745367987"));

        notificationService.notifyObservers("Your order was shipped!");
    }
}
