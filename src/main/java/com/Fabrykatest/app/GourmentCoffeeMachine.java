package com.Fabrykatest.app;

import com.Fabrykatest.app.Drinks.Drink;
import com.Fabrykatest.app.Drinks.CoffeeType;
import com.Fabrykatest.app.Drinks.Expresso;
import com.Fabrykatest.app.Drinks.Latte;

public class GourmentCoffeeMachine extends CoffeeDrinksMachine {


	public Drink dispenseDrink(CoffeeType type) {
		Drink coffee = null;
		switch (type) {
			case EXPRESSO: coffee = new Expresso();
				break;
			case LATTE: coffee = new Latte();
				break;
		}
		return coffee;
	}


}