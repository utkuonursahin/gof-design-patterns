package me.utku;

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Adding features of Sports Car.");
    }
}
