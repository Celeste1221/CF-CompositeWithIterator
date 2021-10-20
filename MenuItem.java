package com.company;

public class MenuItem implements MenuComponent {
    String name;
    String description;
    boolean vegetarian ;
    double price;


    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void add(MenuComponent menuComponent) {

    }

    @Override
    public void remove(MenuComponent menuComponent) {

    }

    @Override
    public MenuComponent getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print(boolean vegetarian) {  String veg = "";
        if (isVegetarian()) {
            veg = "(v)";
        }
        if((vegetarian && isVegetarian()) || !vegetarian) {
            System.out.println(getName() + veg + "..." + getPrice());
        }
        //could print description too
    }

    @Override
    public IIterator createIterator() {
        return new NullIterator();
    }
}
