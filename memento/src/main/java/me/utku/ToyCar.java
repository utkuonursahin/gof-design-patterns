package me.utku;

public class ToyCar {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color set to: " + color);
    }

    public ToyCarMemento saveState(){
        return new ToyCarMemento(color);
    }

    public void restoreState(ToyCarMemento memento){
        setColor(memento.getColor());
    }
}
