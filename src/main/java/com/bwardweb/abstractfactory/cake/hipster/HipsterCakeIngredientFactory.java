package com.bwardweb.abstractfactory.cake.hipster;

import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class HipsterCakeIngredientFactory implements CakeIngredientFactory{

	//Normally tobjects would be created in this emthod but I'm just going to output text here
	
	public void createCakeMix() {
		System.out.println("Using organic flour, organic sugar and free range eggs");		
	}

	public void addToppings() {
		System.out.println("adding cream");		
	}

	public void addDecorations() {
		System.out.println("adding marshmallow bears");		
	}

	public void addingChocolate() {
		System.out.println("adding artisan chocolate");		
	}

	public void addingCoffee() {
		System.out.println("adding soya latte mocha decaf");		
	}
	
}
