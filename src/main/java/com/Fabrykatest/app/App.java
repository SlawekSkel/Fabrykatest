package com.Fabrykatest.app;

import com.Fabrykatest.app.Drinks.CoffeeType;
import com.Fabrykatest.app.Drinks.SoftDrink;

/**
 * Created by slawekskel on 9/26/16.
 */
public class App {

    public static void main(String[] args){


        AbstractDrinksMachineFactory Gfactory = new GourmetDrinksMachineFactory();
        CoffeeDrinksMachine CoffeeMachine = Gfactory.createCoffeeMachine();
        CoffeeMachine.dispenseDrink(CoffeeType.EXPRESSO);


        AbstractDrinksMachineFactory Bfactory = new BasicDrinksMachineFactory();
        SoftDrinksMachine softCoffeeDrinksMachine = Bfactory.createSoftDrinksMachine();
        softCoffeeDrinksMachine.dispenseDrink(SoftDrink.JUICE);



    }

}
