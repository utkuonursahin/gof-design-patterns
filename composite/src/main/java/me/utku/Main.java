package me.utku;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite com = new Composite("Composite 1");
        com.add(new Leaf("Leaf C"));
        com.add(new Leaf("Leaf D"));

        root.add(com);
        root.add(new Leaf("Leaf E"));

        root.display(1);
    }
}