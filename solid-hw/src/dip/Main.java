package dip;

import dip.solution.NewEmailNotifier;
import dip.solution.NewNotificationService;
import dip.solution.SMSNotifier;

/**
 * Refactor the NotificationService to depend on an abstraction.
 * Implement a new notifier for SMS without changing NotificationService.
 */
public class Main {

    public static void main(String[] args) {

        NewEmailNotifier emailNotifier = new NewEmailNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();

        NewNotificationService notificationService = new NewNotificationService(emailNotifier);
        notificationService.notify("Hello, world!");

        notificationService.setNotifier(smsNotifier);
        notificationService.notify("Hello, world!");
    }

}
