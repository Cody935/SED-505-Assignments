// ShoppingCart.java - Represents a shopping cart in the retail store.
 // Created by Cody Cartwright
 // Created on September 18th, 2025.
package myshop;

import java.util.ArrayList;
import java.util.List;
// ShoppingCart class to hold items selected by the customer.
public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
// Method to add item to the shopping cart.
    public void addItem(Item item) {
        items.add(item);
    }
// Method to calculate total cost of items in the cart.
    public void displayItems() {
        for (Item item : items) {
            item.display();
        }
    }
// Accept method for visitor pattern
    public void accept(Visitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
