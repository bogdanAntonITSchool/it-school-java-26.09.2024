package dip.solution;

public class NewNotificationService {

    private Notifier notifier;

    public NewNotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String message) {

        // validation and business logic here

        notifier.sendMessage(message);
    }
}
