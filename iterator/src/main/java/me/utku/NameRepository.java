package me.utku;

public class NameRepository implements Container{
    public static String[] names = {"Robert", "John", "Julie", "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next(){
            return this.hasNext() ? names[index++] : null;
        }
    }
}
