package me.utku;

public class Main {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Font font1 = fontFactory.getFont("Arial");
        Font font2 = fontFactory.getFont("Times New Roman");
        Font font3 = fontFactory.getFont("Arial");

        font1.setSize(12);
        font1.setStyle("Regular");
        font1.setColor("Black");

        font2.setSize(14);
        font2.setStyle("Italic");
        font2.setColor("Red");

        font1.display("Hello World!");
        font2.display("Hello World!");
    }
}