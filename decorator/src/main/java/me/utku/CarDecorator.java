package me.utku;

public class CarDecorator implements Car{
protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public void print(){
        car.print();
    }
}
