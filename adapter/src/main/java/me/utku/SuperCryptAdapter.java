package me.utku;

public class SuperCryptAdapter implements Crypt{
    private final SuperCrypt superCrypt;

    public SuperCryptAdapter(SuperCrypt superCrypt) {
        this.superCrypt = superCrypt;
    }

    public void encrypt(String text) {
        superCrypt.superCryptEncryptText(text);
    }

    public void decrypt(String text) {
        superCrypt.superCryptDecryptText(text);
    }
}
