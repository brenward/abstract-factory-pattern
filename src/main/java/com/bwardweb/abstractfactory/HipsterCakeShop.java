package com.bwardweb.abstractfactory;

import com.bwardweb.abstractfactory.cake.Cake;
import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;
import com.bwardweb.abstractfactory.cake.hipster.HipsterCake;
import com.bwardweb.abstractfactory.cake.hipster.HipsterCakeIngredientFactory;
import com.bwardweb.abstractfactory.cake.hipster.HipsterChocolateCake;
import com.bwardweb.abstractfactory.cake.hipster.HipsterCoffeeCake;

public class HipsterCakeShop extends CakeShop{

	@Override
	protected Cake createCake(String type) {
		Cake cake = null;
		CakeIngredientFactory ingredientFactory = new HipsterCakeIngredientFactory();
		
		if(type.equals("chocolate")){
			cake = new HipsterChocolateCake(ingredientFactory);
		}else if(type.equals("coffee")){
			cake = new HipsterCoffeeCake(ingredientFactory);
		}else{
			cake = new HipsterCake(ingredientFactory);
		}
		return cake;
	}

}
