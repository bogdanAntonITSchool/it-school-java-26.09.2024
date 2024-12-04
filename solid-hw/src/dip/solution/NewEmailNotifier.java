package dip.solution;

public class NewEmailNotifier implements Notifier {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }

}
