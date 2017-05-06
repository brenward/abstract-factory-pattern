package com.bwardweb.abstractfactory.cake;

public abstract class Cake {
	protected String type;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Baking " + type);
	}
	
	public void pack(){
		System.out.println("Packaging " + type);
	}
}
