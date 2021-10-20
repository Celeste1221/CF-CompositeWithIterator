package com.company;

import java.util.ArrayList;

//Menu is a collection of MenuItems
public class Menu implements MenuComponent {

    private ArrayList menuComponents = new ArrayList(); //every menu has a list
    private String name; //menu name
    private String description; //menu description

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return false; //throw new UnsupportedOperationException();
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print(boolean vegetarian) {
        System.out.println(getName() + getDescription());
        for(Object mc: menuComponents) {
            ((MenuComponent)mc).print(vegetarian);
        }

    }
    @Override
    public IIterator createIterator() {
        return new CompositeIterator(menuComponents);
    }
}
