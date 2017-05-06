package com.bwardweb.abstractfactory;

public class OrderService {

	public static void main(String[] args) {
		CakeShop fancy = new FancyCakeShop();
		fancy.orderCake("coffee");
		fancy.orderCake("chocolate");
		
		CakeShop hipster = new HipsterCakeShop();
		hipster.orderCake("coffee");
		hipster.orderCake("");

	}

}
