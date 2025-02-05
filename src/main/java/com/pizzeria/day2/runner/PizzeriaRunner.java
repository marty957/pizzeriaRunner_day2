package com.pizzeria.day2.runner;


import com.pizzeria.day2.Enumaration.StatoOrdine;
import com.pizzeria.day2.Enumaration.StatoTv;
import com.pizzeria.day2.model.*;
import com.pizzeria.day2.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@PropertySource("application.properties")
public class PizzeriaRunner implements CommandLineRunner {

    @Autowired private MenuService menuService;
    @Autowired private TavoloService tavoloService;
    @Autowired private OrdineService ordineService;
    @Autowired private DrinkService drinkService;
    @Autowired private ToppingsService toppingsService;
    @Autowired private PizzaService pizzaService;

    @Value("${costo.coperto}") private int costoCoperto;
    @Override
    public void run(String... args) throws Exception {

        Topping t1=toppingsService.tomato();
        Topping t2=toppingsService.cheese();
        Topping t3=toppingsService.salami();
        List<Article> ArticoliOrdinati=new ArrayList();

        Pizza p1=pizzaService.salamiPizza();
        Pizza p2=pizzaService.margherita();

        Drink d1=drinkService.water();
        Drink d2=drinkService.lemonade();
   /*     toppingsService.insertTopping(t1);
        toppingsService.insertTopping(t2);
        toppingsService.insertTopping(t3);*/

//        pizzaService.insertPizza(p1);
        /*pizzaService.insertPizza(p2);*/

      /*  drinkService.insertDrink(d1);
        drinkService.insertDrink(d2);*/

        ArticoliOrdinati.addAll(Arrays.asList(p1,p2,d1,d2,t1));

        Menu menu=menuService.createMenu();

        Tavolo tavolo1=tavoloService.createTable().builder().numeroTavolo(1).numeroMaxCoperti(4).stato(StatoTv.OCCUPATO).build();
        Tavolo tavolo2=tavoloService.createTable().builder().numeroTavolo(2).numeroMaxCoperti(2).stato(StatoTv.OCCUPATO).build();
        Tavolo tavolo3=tavoloService.createTable().builder().numeroTavolo(3).numeroMaxCoperti(6).stato(StatoTv.LIBERO).build();


        Ordine o1=ordineService.createOrder().builder().numeroOrdine(1).tavolo(tavolo1)
                .statoOrdine(StatoOrdine.INCORSO).numeroCoperti(3).oraOrdinazione(LocalDateTime.now()).
                articoliOrdinati(ArticoliOrdinati).costoTotale(costoCoperto).build();


        menu.printMenu();
        System.out.println(o1);
        o1.printOrder();





    }
}
