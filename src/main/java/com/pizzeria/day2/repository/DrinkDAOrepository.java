package com.pizzeria.day2.repository;

import com.pizzeria.day2.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkDAOrepository extends JpaRepository<Drink,Long> {
}
