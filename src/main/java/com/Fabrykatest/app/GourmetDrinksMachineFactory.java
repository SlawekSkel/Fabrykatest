package com.Fabrykatest.app;

public class GourmetDrinksMachineFactory implements AbstractDrinksMachineFactory {

	public CoffeeDrinksMachine createCoffeeMachine() {
		return new GourmentCoffeeMachine();
	}
	
	public SoftDrinksMachine createSoftDrinksMachine() {
		return new GourmentSoftDrinksMachine();
	}
}
