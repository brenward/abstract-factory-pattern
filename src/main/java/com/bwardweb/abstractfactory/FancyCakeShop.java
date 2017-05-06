package com.bwardweb.abstractfactory;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;
import com.bwardweb.abstractfactory.cake.fancy.FancyCake;
import com.bwardweb.abstractfactory.cake.fancy.FancyCakeIngredientFactory;
import com.bwardweb.abstractfactory.cake.fancy.FancyChocolateCake;
import com.bwardweb.abstractfactory.cake.fancy.FancyCoffeeCake;

public class FancyCakeShop extends CakeShop{

	@Override
	protected Cake createCake(String type) {
		Cake cake = null;
		CakeIngredientFactory ingredientFactory = new FancyCakeIngredientFactory();
		if(type.equals("chocolate")){
			cake = new FancyChocolateCake(ingredientFactory);
		}else if(type.equals("coffee")){
			cake = new FancyCoffeeCake(ingredientFactory);
		}else{
			cake = new FancyCake(ingredientFactory);
		}
		return cake;
	}

}
