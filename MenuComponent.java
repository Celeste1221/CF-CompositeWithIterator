package com.company;

public interface MenuComponent {
    //treats a menu item and a menu in the same way

    //all functions needed to support a collection of MenuComponents
    void add(MenuComponent menuComponent);
    void remove(MenuComponent menuComponent);
    MenuComponent getChild(int i);

    //all functions needed to support an individual MenuItem
    String getName();
    String getDescription();
    boolean isVegetarian();
    double getPrice();
    void print(boolean vegetarian);
    IIterator createIterator();
}
