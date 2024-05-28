package me.utku;

public class Main {
    public static void main(String[] args) {
        Crypt crypt = new CryptA();
        crypt.encrypt("Hello World");
        crypt.decrypt("Hello World");

        crypt = new CryptB();
        crypt.encrypt("World");
        crypt.decrypt("World");

        SuperCrypt superCrypt = new SuperCrypt();
        crypt = new SuperCryptAdapter(superCrypt);
        crypt.encrypt("Hello");
        crypt.decrypt("Hello");
    }
}