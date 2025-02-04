package com.pizzeria.day2.service;


import com.pizzeria.day2.model.Tavolo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TavoloService {


    @Autowired @Qualifier("tavolo") ObjectProvider<Tavolo> tavoloProvider;

    public Tavolo createTable(){
        return tavoloProvider.getObject();
    }



}
