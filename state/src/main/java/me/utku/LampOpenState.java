package me.utku;

public class LampOpenState implements LampState {

    public void onOpen(){
        System.out.println("Lamp is already open");
    }

    public void onClose(){
        System.out.println("Lamp is closing...");
    }
}
