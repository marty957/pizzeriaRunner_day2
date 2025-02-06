package com.pizzeria.day2.repository;

import com.pizzeria.day2.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingDAOrepository extends JpaRepository<Topping,Long> {
}
