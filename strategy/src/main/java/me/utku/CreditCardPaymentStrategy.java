package me.utku;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    public void processPayment(double amount){
        System.out.println("Paying with credit card: " + amount);
    }
}
