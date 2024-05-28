package me.utku;

public class ConcreteFont implements Font {
    private int size;
    private String style;
    private String color;

    public void setSize(int size) {
        this.size = size;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(String text){
        System.out.println(STR."Text \{text} displayed with size: \{size}, style: \{style}, color: \{color}");
    }
}
