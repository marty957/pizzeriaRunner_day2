package com.pizzeria.day2.service;

import com.pizzeria.day2.model.Pizza;
import com.pizzeria.day2.repository.PizzaDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    PizzaDAOrepository db;
     @Autowired @Qualifier("pizza_margherita")
    ObjectProvider<Pizza> pizzaMargProvider;
     @Autowired @Qualifier("pizza_salami") ObjectProvider<Pizza> pizzaSalamiProvider;

     public Pizza margherita(){
         return pizzaMargProvider.getObject();
     }
     public Pizza salamiPizza(){
         return pizzaSalamiProvider.getObject();
     }


     public void insertPizza(Pizza pizza){
         db.save(pizza);
         System.out.println("pizza inserita");
     }
     public void update(Pizza pizza){
         db.save(pizza);
         System.out.println("pizza modificata");
     }

     public void deletePizza(Pizza pizza){
         db.delete(pizza);
     }
}
