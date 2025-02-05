package com.pizzeria.day2;

import com.pizzeria.day2.Enumaration.StatoTv;
import com.pizzeria.day2.model.Article;
import com.pizzeria.day2.model.Drink;
import com.pizzeria.day2.model.Menu;
import com.pizzeria.day2.model.Tavolo;
import com.pizzeria.day2.service.DrinkService;
import com.pizzeria.day2.service.MenuService;
import com.pizzeria.day2.service.TavoloService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Day2ApplicationTests {


	@Autowired
	private MenuService menuService;
	@Autowired private TavoloService tavoloService;
	@Autowired private DrinkService drinkService;


	@Test
	void contextLoads() {
		assertThat(menuService).isNotNull();
	}

	@Test
	void test2(){
		Tavolo t1=tavoloService.createTable();
		assertEquals("1,4, StatoTv.LIBERO",t1);

	}
	@Test
	void test3(){
		Tavolo t1=tavoloService.createTable();
		assertNotEquals("1,4, StatoTv.LIBERO",t1);

	}
	@Test
	void test4(){
		Drink d=drinkService.water();
		assertTrue(d.getName().equals("Water"));
	}

	@ParameterizedTest
	@ValueSource(strings = "p")
	void searchForLetters(String letter){
		Menu m =menuService.createMenu();
		List<Article> art=m.getMenuList();
	   assertTrue(art.contains(letter));


	}



}
