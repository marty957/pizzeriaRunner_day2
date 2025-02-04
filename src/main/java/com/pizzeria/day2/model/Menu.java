package com.pizzeria.day2.model;


import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Article> menuList;

    public Menu() {
        this.menuList = new ArrayList<Article>();
    }

    public List<Article> getMenuList() {
        return menuList;
    }

    public void printMenu() {
        System.out.println("---------- Menu --------");
        //this.menuList.forEach(ele -> System.out.println(ele));
        System.out.println("Pizzas");
        this.menuList.forEach(ele -> {
            if(ele instanceof Pizza) {
                System.out.print(((Pizza) ele).getName() + " - ");
                System.out.print(((Pizza) ele).getCalories() + " - ");
                System.out.println(((Pizza) ele).getPrice());
            }
        });
        System.out.println("Toppings");
        this.menuList.forEach(ele -> {
            if(ele instanceof Topping) {
                System.out.print(((Topping) ele).getName() + " - ");
                System.out.print(((Topping) ele).getCalories() + " - ");
                System.out.println(((Topping) ele).getPrice());
            }
        });
        System.out.println("Drinks");
        this.menuList.forEach(ele -> {
            if(ele instanceof Drink) {
                System.out.print(((Drink) ele).getName() + " - ");
                System.out.print(((Drink) ele).getCalories() + " - ");
                System.out.println(((Drink) ele).getPrice());
            }
        });
    }
}
