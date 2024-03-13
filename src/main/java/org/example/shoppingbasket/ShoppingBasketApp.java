package org.example.shoppingbasket;

import java.util.Arrays;
import java.util.List;

public class ShoppingBasketApp {

	public static void main(String[] args) {
		List<String> shoppingList = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime");
		Basket basket = new Basket();

		for (String item : shoppingList) {
			basket.addItem(item, 1);
		}

		System.out.println("Total price: " + basket.calculateTotalCost() + "p");
	}
}
