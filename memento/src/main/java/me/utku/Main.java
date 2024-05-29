package me.utku;

public class Main {
    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar();
        ColorChanger colorChanger = new ColorChanger();
        colorChanger.changeColor(toyCar, "Red");
        ToyCarMemento savedState = toyCar.saveState();
        colorChanger.changeColor(toyCar, "Blue");
        colorChanger.changeColor(toyCar, "Green");

        colorChanger.undo(toyCar);
        colorChanger.undo(toyCar);

        System.out.println("Current color: " + toyCar.getColor());

        toyCar.restoreState(savedState);

        System.out.println("Current color: " + toyCar.getColor());
    }
}