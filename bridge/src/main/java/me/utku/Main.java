package me.utku;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Red());
        Square square = new Square(new Blue());

        System.out.println(circle.toString());
        System.out.println(square.toString());
    }
}