package isp.solution;

import isp.PaymentProcessor;

public class CreditCardProcessor implements NewPaymentProcessor {

    @Override
    public void processPayment() {
        System.out.println("Processing payment with credit card");
    }

}
