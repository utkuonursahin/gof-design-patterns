package me.utku;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.attach(new CustomerObserver());
        product.attach(new CustomerObserver());

        product.changePrice();
    }
}