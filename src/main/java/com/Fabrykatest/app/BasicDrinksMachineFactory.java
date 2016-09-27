package com.Fabrykatest.app;

public class BasicDrinksMachineFactory implements AbstractDrinksMachineFactory {

	public CoffeeDrinksMachine createCoffeeMachine() {
		return new BasicCoffeeMachine();
	}
	
	public SoftDrinksMachine createSoftDrinksMachine() {
		return new BasicSoftDrinksMachine();
	}
}
