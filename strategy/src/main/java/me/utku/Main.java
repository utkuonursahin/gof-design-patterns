package me.utku;

public class Main {
    public static void main(String[] args) {
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentProcessor p1 = new PaymentProcessor(creditCardPaymentStrategy);
        p1.processPayment(100.0);

        PaypalCardPaymentStrategy paypalCardPaymentStrategy = new PaypalCardPaymentStrategy();
        PaymentProcessor p2 = new PaymentProcessor(paypalCardPaymentStrategy);
        p2.processPayment(200.0);

        QrCodePaymentStrategy qrCodePaymentStrategy = new QrCodePaymentStrategy();
        PaymentProcessor p3 = new PaymentProcessor(qrCodePaymentStrategy);
        p3.processPayment(300.0);
    }
}