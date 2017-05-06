package com.bwardweb.abstractfactory.cake.fancy;

import com.bwardweb.abstractfactory.cake.CakeIngredientFactory;

public class FancyCakeIngredientFactory implements CakeIngredientFactory{

	//Normally tobjects would be created in this emthod but I'm just going to output text here
	
	public void createCakeMix() {
		System.out.println("Using fancy flour, rock sugar and quail eggs");		
	}

	public void addToppings() {
		System.out.println("adding hand sculpted flowers");		
	}

	public void addDecorations() {
		System.out.println("adding gold leaf");		
	}

	public void addingChocolate() {
		System.out.println("adding belgian chocolate");		
	}

	public void addingCoffee() {
		System.out.println("adding kopi luwak");		
	}
	
}
