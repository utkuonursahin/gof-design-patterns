package me.utku;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
    }

}
