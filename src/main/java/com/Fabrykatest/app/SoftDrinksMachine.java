package com.Fabrykatest.app;

import com.Fabrykatest.app.Drinks.Drink;
import com.Fabrykatest.app.Drinks.SoftDrink;

public abstract class SoftDrinksMachine {

	public abstract Drink dispenseDrink(SoftDrink type);


	public String displayMessage(){
		return "Dziękuje.";
	}
}