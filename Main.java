package com.company;

public class Main {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu: ", "breakfast menu");
        MenuComponent dinerMenu = new Menu("Diner menu: ", "breakfast and lunch menu");
        MenuComponent cafeMenu = new Menu("Cafe menu: ", "lunch and dinner menu");
        MenuComponent dessertMenu = new Menu("Dessert menu: ", "enjoy dessert!!");

        //create a new menu that prints all the breakfast items - only available from PancakeHouse and Diner
        MenuComponent breakfastItems = new Menu("Breakfast: ", "from PancakeHouse and Diner");
        breakfastItems.add(pancakeHouseMenu);
        breakfastItems.add(dinerMenu);

        //create a new menu to print only lunch items - only from diner and cafe
        MenuComponent lunchItems = new Menu("Lunch: ", "from diner and cafe");
        lunchItems.add(cafeMenu);
        lunchItems.add(dinerMenu);

        //create a new menu that prints out only vegetarian desserts
        MenuComponent vegetarianDesserts = new Menu("Vegetarian Desserts: ", "from dessert menu");
        vegetarianDesserts.add(dessertMenu);

        //print all vegetarian items from every menu
        MenuComponent allVegetarianItems = new Menu("vegetarian items: ", "vegetarian items");
        allVegetarianItems.add(pancakeHouseMenu);
        allVegetarianItems.add(cafeMenu);
        allVegetarianItems.add(dinerMenu);



        pancakeHouseMenu.add(new MenuItem("Green eggs and ham", "eggs and ham", false,
                3.89));
        pancakeHouseMenu.add(new MenuItem("Blueberry muffin", "blueberry muffin", true,
                3.89));

        dinerMenu.add(new MenuItem("pasta", "pasta with bread", true, 3.89));
        dinerMenu.add(new MenuItem("pasta meat", "pasta with meatballs", false, 3.89));
        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("Ham and Cheese", "ham and cheese sandwich",
                false,  1.59));
        cafeMenu.add(new MenuItem("Chef Salad", "veggie salad",
                true, 1.59));

        dessertMenu.add(new MenuItem("apple pie", "apple pie with vanilla ice cream", true,
                1.59));
        dessertMenu.add(new MenuItem("Mince meat pie", "pie with meat",
                false, 1.59));

        //breakfast items
        System.out.println("Breakfast items: ");
        WaiterBot waiter2 = new WaiterBot(breakfastItems);
        waiter2.print();
        //waiter2.printVegetarianMenu();
        System.out.println("\n");

        //lunch items
        System.out.println("Lunch items: ");
        WaiterBot waiter3 = new WaiterBot(lunchItems);
        waiter3.print();
        //waiter3.printVegetarianMenu();
        System.out.println("\n");

        //print all vegetarian items
        System.out.println("All vegetarian items: ");
        WaiterBot waiter = new WaiterBot(allVegetarianItems);
        waiter.printVegetarianMenu();

    }
}
