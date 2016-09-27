package com.Fabrykatest.app;

public interface AbstractDrinksMachineFactory {
	CoffeeDrinksMachine createCoffeeMachine();
	SoftDrinksMachine createSoftDrinksMachine();
}