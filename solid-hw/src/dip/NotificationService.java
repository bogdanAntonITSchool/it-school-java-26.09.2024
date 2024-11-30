package dip;

public class NotificationService {

    private EmailNotifier emailNotifier = new EmailNotifier();

    public void notify(String message) {
        emailNotifier.sendEmail(message);
    }

}