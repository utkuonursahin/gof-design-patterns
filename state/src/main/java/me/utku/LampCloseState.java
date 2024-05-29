package me.utku;

public class LampCloseState implements LampState{

    public void onOpen(){
        System.out.println("Lamp is opening...");
    }
    public void onClose(){
        System.out.println("Lamp is already closed");
    }
}
