package me.utku;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    private void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    public void changePrice() {
        notifyObservers();
    }
}
