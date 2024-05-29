package me.utku;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turning on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off TV");
    }

    public void changeChannel() {
        System.out.println("Changing channel");
    }
}
