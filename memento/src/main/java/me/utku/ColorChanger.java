package me.utku;

public class ColorChanger {
    private ToyCarMemento memento;

    public void changeColor(ToyCar car, String color){
        memento = car.saveState();
        car.setColor(color);
    }

    public void undo(ToyCar car){
        car.restoreState(memento);
    }
}
