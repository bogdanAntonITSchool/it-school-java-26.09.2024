package isp.solution;

public class PaypalPaymentProcessor implements NewPaymentProcessor{

    @Override
    public void processPayment() {
        System.out.println("Processing payment with Paypal");
    }

}
