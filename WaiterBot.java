package com.company;

import java.util.ArrayList;

//copy paste waitress code from example
public class WaiterBot {

    MenuComponent allMenus;

    public WaiterBot(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print(false);
    }

    public void printVegetarianMenu() {
        IIterator iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu");

        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print(true);
        }
    }

}
