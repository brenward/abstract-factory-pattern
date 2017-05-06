package com.bwardweb.abstractfactory.cake.fancy;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class FancyCake extends Cake{
	CakeIngredientFactory ingredientFactory;
	
	public FancyCake(CakeIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		type = "FancyCake";
	}

	@Override
	public void prepare() {
		ingredientFactory.createCakeMix();
		ingredientFactory.addToppings();;
		ingredientFactory.addDecorations();	
	}
}
