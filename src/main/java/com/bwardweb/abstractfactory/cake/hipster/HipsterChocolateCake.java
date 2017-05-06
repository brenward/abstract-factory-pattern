package com.bwardweb.abstractfactory.cake.hipster;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class HipsterChocolateCake extends Cake{
	CakeIngredientFactory ingredientFactory;
	
	public HipsterChocolateCake(CakeIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		type = "HipsterChocolateCake";
	}
	
	@Override
	public void prepare() {
		ingredientFactory.createCakeMix();
		ingredientFactory.addToppings();;
		ingredientFactory.addDecorations();
		ingredientFactory.addingChocolate();
	}

}
