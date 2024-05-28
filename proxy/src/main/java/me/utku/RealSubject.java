package me.utku;

public class RealSubject implements Subject{
    @Override
    public void request(String username, String password) {
        System.out.println("RealSubject: Handling request.");
    }
}
