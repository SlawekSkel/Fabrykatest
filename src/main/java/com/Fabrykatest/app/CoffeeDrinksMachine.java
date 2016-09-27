package com.Fabrykatest.app;

import com.Fabrykatest.app.Drinks.Drink;
import com.Fabrykatest.app.Drinks.CoffeeType;

public abstract class CoffeeDrinksMachine {

	public abstract Drink dispenseDrink(CoffeeType type);


	public String displayMessage(){
		return "Dziękuje.";
	}
}