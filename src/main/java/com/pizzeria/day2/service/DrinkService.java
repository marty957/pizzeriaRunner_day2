package com.pizzeria.day2.service;


import com.pizzeria.day2.model.Drink;
import com.pizzeria.day2.repository.DrinkDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {

    @Autowired
    DrinkDAOrepository db;
    @Autowired @Qualifier("water")
    ObjectProvider<Drink> waterProvider;
    @Autowired @Qualifier("lemonade") ObjectProvider<Drink> lemonadeProvider;

    public Drink water(){
        return waterProvider.getObject();
    }

    public Drink lemonade(){
        return lemonadeProvider.getObject();
    }


    public void insertDrink(Drink drink){
        db.save(drink);
        System.out.println("drink aggiunto");
    }

    public void updateDrink(Drink drink){
        db.save(drink);
        System.out.println("drink aggiornato");
    }

    public void deleteDrink(Drink drink){
        db.delete(drink);
        System.out.println("drink elimanto");
    }
}
