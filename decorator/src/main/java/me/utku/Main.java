package me.utku;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.print();

        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.print();
    }
}