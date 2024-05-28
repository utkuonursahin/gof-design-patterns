package me.utku;

public class CryptA implements Crypt{
    public void encrypt(String text) {
        System.out.println("Encrypting with A");
    }

    public void decrypt(String text) {
        System.out.println("Decrypting with A");
    }
}
