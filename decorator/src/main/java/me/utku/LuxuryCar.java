package me.utku;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Adding features of Luxury Car.");
    }
}
