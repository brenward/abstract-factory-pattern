package com.bwardweb.abstractfactory;

import com.bwardweb.abstractfactory.cake.Cake;

public abstract class CakeShop {
	String style;
	
	public Cake orderCake(String type){
		Cake cake = createCake(type);
		
		cake.prepare();
		cake.bake();
		cake.pack();
		
		return cake;
	}
	
	protected abstract Cake createCake(String type);
}
