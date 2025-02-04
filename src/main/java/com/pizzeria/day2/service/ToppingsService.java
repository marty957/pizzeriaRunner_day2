package com.pizzeria.day2.service;


import com.pizzeria.day2.model.Topping;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ToppingsService {

    @Autowired @Qualifier("topping_tomato")
    ObjectProvider<Topping> toppingTomatoProvider;
    @Autowired @Qualifier("topping_cheese")
    ObjectProvider<Topping> toppingCheeseProvider;
    @Autowired @Qualifier ("topping_salami") ObjectProvider<Topping> toppingSalamiProvider;

    public Topping tomato(){
        return toppingTomatoProvider.getObject();
    }
    public Topping cheese(){
        return toppingCheeseProvider.getObject();
    }

    public Topping salami(){
        return toppingSalamiProvider.getObject();
    }
}
