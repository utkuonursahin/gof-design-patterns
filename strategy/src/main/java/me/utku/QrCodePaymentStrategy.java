package me.utku;

public class QrCodePaymentStrategy implements PaymentStrategy{
    public void processPayment(double amount){
        System.out.println("Paying with Qr Code: " + amount);
    }
}
