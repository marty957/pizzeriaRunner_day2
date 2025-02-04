package com.pizzeria.day2.service;


import com.pizzeria.day2.model.Article;
import com.pizzeria.day2.model.Menu;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired @Qualifier("menu")
    ObjectProvider<Menu> menuObjectProvider;

    public Menu createMenu(){
        return menuObjectProvider.getObject();
    }
}
