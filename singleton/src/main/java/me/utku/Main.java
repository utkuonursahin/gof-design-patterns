package me.utku;

public class Main {
    public static void main(String[] args) {
        Log log = Log.getInstance();
        Log log2 = Log.getInstance();

        if (log == log2) {
            log.info("Singleton works!");
        }
    }
}