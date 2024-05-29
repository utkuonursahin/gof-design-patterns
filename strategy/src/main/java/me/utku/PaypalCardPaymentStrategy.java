package me.utku;

public class PaypalCardPaymentStrategy implements PaymentStrategy{
    public void processPayment(double amount){
        System.out.println("Paying with Paypal Card: " + amount);
    }
}
