package com.Fabrykatest.app;

import com.Fabrykatest.app.Drinks.*;

public class GourmentSoftDrinksMachine extends SoftDrinksMachine {


	public Drink dispenseDrink(SoftDrink type) {
		Drink soft = null;
		switch (type) {
			case JUICE: soft = new Juice();
				break;
			case TEA: soft = new Tea();
				break;
		}
		return soft;
	}
}