package com.pizzeria.day2.service;


import com.pizzeria.day2.model.Topping;
import com.pizzeria.day2.repository.ToppingDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ToppingsService {


    @Autowired
    ToppingDAOrepository db;
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


    public void insertTopping(Topping topping){
        db.save(topping);
        System.out.println("topping aggiunto nel db");
    }

    public void updateTopping(Topping topping){
        db.save(topping);
        System.out.println("topping modificato nel db");
    }
    public void deleteTopping(Topping topping){
        db.delete(topping);
        System.out.println("topping eleiminato dal db");;
    }
}
