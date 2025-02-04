package com.pizzeria.day2.service;

import com.pizzeria.day2.model.Ordine;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrdineService {

    @Autowired @Qualifier("createOrder")
    ObjectProvider<Ordine> ordineProvider;

    public Ordine createOrder(){
        return ordineProvider.getObject();
    }
}
