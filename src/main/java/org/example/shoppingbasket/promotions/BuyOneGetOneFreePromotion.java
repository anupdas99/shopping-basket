package org.example.shoppingbasket.promotions;

public class BuyOneGetOneFreePromotion implements Promotion {

	@Override
	public int applyDiscount(int quantity, int originalPrice) {
		return quantity % 2 == 0 ? quantity / 2 * originalPrice : (quantity / 2 + 1) * originalPrice;
	}

}
