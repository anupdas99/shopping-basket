package org.example.shoppingbasket;

import org.example.shoppingbasket.promotions.BuyOneGetOneFreePromotion;
import org.example.shoppingbasket.promotions.ThreeForTwoPromotion;

import java.util.HashMap;
import java.util.Map;

public class Basket {

	private final Map<String, Integer> items;
	private final Map<String, Item> itemPrices;

	public Basket() {
		this.items = new HashMap<>();
		itemPrices = new HashMap<>();
		initializeItemPrices();
	}

	private void initializeItemPrices() {
		itemPrices.put("Apple", new Item("Apple", 35));
		itemPrices.put("Banana", new Item("Banana", 20));
		itemPrices.put("Melon", new Item("Melon", 50));
		itemPrices.put("Lime", new Item("Lime", 15));
	}

	public void addItem(String itemName, int quantity) {
		items.put(itemName, quantity);
	}

	public int calculateTotalCost() {
		int totalCost = 0;

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			String itemName = entry.getKey();
			int quantity = entry.getValue();
			Item item = itemPrices.get(itemName);
			totalCost += calculateItemCost(item, quantity);
		}

		return totalCost;
	}

	private int calculateItemCost(Item item, int quantity) {
		int cost = 0;
		if ("Melon".equals(item.getName())) {
			cost = new BuyOneGetOneFreePromotion().applyDiscount(quantity, item.getBasePrice());
		} else if ("Lime".equals(item.getName())) {
			cost = new ThreeForTwoPromotion().applyDiscount(quantity, item.getBasePrice());
		} else {
			cost = quantity * item.getBasePrice();
		}
		return cost;
	}

}



