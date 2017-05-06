package com.bwardweb.abstractfactory.cake.fancy;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class FancyChocolateCake extends Cake{
	
	CakeIngredientFactory ingredientFactory;
	
	public FancyChocolateCake(CakeIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		type = "FancyChocolateCake";
	}
	
	@Override
	public void prepare() {
		ingredientFactory.createCakeMix();
		ingredientFactory.addToppings();;
		ingredientFactory.addDecorations();
		ingredientFactory.addingChocolate();
	}

}
