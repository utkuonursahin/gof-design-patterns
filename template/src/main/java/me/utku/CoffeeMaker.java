package me.utku;

public class CoffeeMaker extends BeverageMaker{
    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
