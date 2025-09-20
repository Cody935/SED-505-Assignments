// Customer.java - Represents a customer in the retail store.
 // Created by Karim Sarif
 // Created on September 19th, 2025.
package myshop;
// Class to manage customer details, shopping cart, and purchase process.
public class Customer {
    private String name;
    private double cash;
    private RetailStore store;
    private ShoppingCart cart = new ShoppingCart();
// Constructor to initialize customer with name, cash, and associated store.
    public Customer(String name, double cash, RetailStore store) {
        this.name = name;
        this.cash = cash;
        this.store = store;
    }
// Method to add item to the customer's shopping cart.
    public void addItemToCart(Item item) {
        cart.addItem(item);
    }
// Method to attempt purchase; returns true if successful, false if insufficient funds.
    public boolean purchase() {
        double cost = store.calculateCost(cart);
        if (cash >= cost) {
            cash -= cost;
            store.recordPurchase(cart, cost);
            return true;
        }
        return false;
    }
// Method to display the customer's order details.
    public void displayOrder() {
        System.out.println("Order for " + name + ":");
        cart.displayItems();
    }
// Getters for name and cash.
    public String getName() {
        return name;
    }
// Getter for cash amount.
    public double getCash() {
        return cash;
    }
}
