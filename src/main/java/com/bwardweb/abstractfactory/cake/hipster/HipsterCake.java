package com.bwardweb.abstractfactory.cake.hipster;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class HipsterCake extends Cake{
	CakeIngredientFactory ingredientFactory;
	
	public HipsterCake(CakeIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		type = "HipsterCake";
	}
	
	@Override
	public void prepare() {
		ingredientFactory.createCakeMix();
		ingredientFactory.addToppings();;
		ingredientFactory.addDecorations();	
	}

}
