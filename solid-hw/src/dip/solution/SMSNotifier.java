package dip.solution;

public class SMSNotifier implements Notifier {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }

}
