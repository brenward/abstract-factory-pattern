package com.bwardweb.abstractfactory.cake.fancy;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class FancyCoffeeCake extends Cake{
	CakeIngredientFactory ingredientFactory;
	
	public FancyCoffeeCake(CakeIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		type = "FancyCoffeeCake";
	}
	
	@Override
	public void prepare() {
		ingredientFactory.createCakeMix();
		ingredientFactory.addToppings();;
		ingredientFactory.addDecorations();
		ingredientFactory.addingCoffee();
	}

}
