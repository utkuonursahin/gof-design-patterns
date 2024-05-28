package me.utku;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component){
        children.remove(component);
    }

    public void display(int depth){
        System.out.println("-".repeat(depth) + name);

        for (Component component : children) {
            component.display(depth);
        }
    }
}
