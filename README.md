# Shopping Basket Price Calculator

This Java project calculates the total price of a shopping basket based on the items included, applying specific pricing rules for different items.

## Usage

To use this project, follow these steps:

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/anupdas99/shopping-basket.git
    ```

2. Open the project in your preferred Java IDE.

3. Use the `Basket` class to create a shopping cart and add items to it using the `addItem` method.

4. Call the `calculateTotalCost` method on the shopping cart instance to get the total cost of the items in the basket.

## Item Pricing Rules

The following pricing rules apply to the items:

- Apple: 35p each
- Banana: 20p each
- Melon: 50p each, but available as 'buy one get one free'
- Lime: 15p each, but available in a 'three for the price of two' offer

## Project Structure

The project consists of the following files:

- `Item.java`: Defines the Item class representing items in the shopping basket.
- `Basket.java`: Defines the Basket class for managing the shopping basket and calculating the total cost.
- `Promotion.java`: Contains interface for promotion.
- `BuyOneGetOneFreePromotion.java`: Contains class for the buy one get one free promotion.
- `ThreeForTwoPromotion.java`: Contains unit class for the three for the price of two promotion.
- `ShoppingBasketTest.java`: Contains unit tests for the Basket class using JUnit.
- `ShoppingBasketApp` Class with main method.

## Running Tests

To run the unit tests, execute the following command:

```bash
mvn test
