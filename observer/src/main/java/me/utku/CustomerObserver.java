package me.utku;

public class CustomerObserver extends Observer {
    @Override
    public void update() {
        System.out.println("CustomerObserver notified!");
    }
}
