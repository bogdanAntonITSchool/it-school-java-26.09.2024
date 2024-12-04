package isp;

import isp.solution.CreditCardProcessor;
import isp.solution.NewPaymentProcessor;
import isp.solution.PaypalPaymentProcessor;

/**
 * Refactor the PaymentProcessor interface to adhere to ISP.
 */
public class Main {

    public static void main(String[] args) {

        NewPaymentProcessor creditCardProcessor = new CreditCardProcessor();
        NewPaymentProcessor paypalPaymentProcessor = new PaypalPaymentProcessor();

        creditCardProcessor.processPayment();
        paypalPaymentProcessor.processPayment();
    }

}
