package com.shoppingbasket;

import org.example.shoppingbasket.Basket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketAppTest {

	@Test
	public void testSingleItem() {
		Basket basket = new Basket();
		basket.addItem("Apple", 1);
		assertEquals(35, basket.calculateTotalCost());
	}

	@Test
	public void testEmptyBasket() {
		Basket basket = new Basket();
		assertEquals(0, basket.calculateTotalCost());
	}

	@Test
	public void testMultipleItems() {
		Basket basket = new Basket();
		basket.addItem("Apple", 2);
		basket.addItem("Banana", 1);
		assertEquals(90, basket.calculateTotalCost());
	}

	@Test
	public void testBuyOneGetOneFreePromotion() {
		Basket basket = new Basket();
		basket.addItem("Melon", 4);
		assertEquals(100, basket.calculateTotalCost());
	}

	@Test
	public void testBuyOneGetOneFreePromotion_2() {
		Basket basket = new Basket();
		basket.addItem("Melon", 5);
		assertEquals(150, basket.calculateTotalCost());
	}

	@Test
	public void testThreeForTwoPromotion() {
		Basket basket = new Basket();
		basket.addItem("Lime", 3);
		assertEquals(30, basket.calculateTotalCost());
	}

	@Test
	public void testMixedItems() {
		Basket basket = new Basket();
		basket.addItem("Apple", 1);
		basket.addItem("Banana", 2);
		basket.addItem("Melon", 1);
		basket.addItem("Lime", 4);
		assertEquals(170, basket.calculateTotalCost());
	}

}

