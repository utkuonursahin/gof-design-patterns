package me.utku;

public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        realSubject.request("utku", "1234");

        Proxy proxy = new Proxy(realSubject);
        proxy.request("utku", "1234");
    }
}