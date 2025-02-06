package com.pizzeria.day2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pizza extends Article {

    @Id
    @GeneratedValue
    private long idPizza;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private List<Topping> toppingList;

    public Pizza(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
        this.toppingList = new ArrayList<Topping>();
    }

    public void addTopping(Topping t) {
        this.toppingList.add(t);
    }

    public String getName() {
        return name;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
