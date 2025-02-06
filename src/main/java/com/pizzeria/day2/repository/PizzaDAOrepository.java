package com.pizzeria.day2.repository;

import com.pizzeria.day2.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaDAOrepository extends JpaRepository<Pizza,Long> {
}
