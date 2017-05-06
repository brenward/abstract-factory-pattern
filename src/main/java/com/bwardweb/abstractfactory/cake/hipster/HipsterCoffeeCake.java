package com.bwardweb.abstractfactory.cake.hipster;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class HipsterCoffeeCake extends Cake{
	CakeIngredientFactory ingredientFactory;
	
	public HipsterCoffeeCake(CakeIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		type = "HipsterCoffeeCake";
	}
	
	@Override
	public void prepare() {
		ingredientFactory.createCakeMix();
		ingredientFactory.addToppings();;
		ingredientFactory.addDecorations();
		ingredientFactory.addingCoffee();
	}

}
