package org.example.shoppingbasket.promotions;

public class ThreeForTwoPromotion implements Promotion {

	@Override
	public int applyDiscount(int quantity, int originalPrice) {
		return quantity / 3 * 2 * originalPrice + quantity % 3 * originalPrice;
	}
}
