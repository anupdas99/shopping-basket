package org.example.shoppingbasket;

public class Item {

	private final String name;
	private final int basePrice;

	public Item(String name, int basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}

	public String getName() {
		return name;
	}

	public int getBasePrice() {
		return basePrice;
	}

}



