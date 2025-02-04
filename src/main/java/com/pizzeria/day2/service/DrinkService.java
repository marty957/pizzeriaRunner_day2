package com.pizzeria.day2.service;


import com.pizzeria.day2.model.Drink;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {

    @Autowired @Qualifier("water")
    ObjectProvider<Drink> waterProvider;
    @Autowired @Qualifier("lemonade") ObjectProvider<Drink> lemonadeProvider;

    public Drink water(){
        return waterProvider.getObject();
    }

    public Drink lemonade(){
        return lemonadeProvider.getObject();
    }
}
