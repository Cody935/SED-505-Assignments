// RetailStore.java - Manages customers and sales statistics.
 // Created by Cody Cartwright
 // Created on September 19th, 2025.
package myshop;

import java.util.ArrayList;
import java.util.List;
// RetailStore class to manage customers and sales statistics.
public class RetailStore {
    private List<Customer> customers = new ArrayList<>();
    private double totalRevenue = 0.0;
    private double totalToolRevenue = 0.0;
    private double totalGroceryRevenue = 0.0;
// Add a customer to the store's customer list.
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
// Calculate total cost of items in the shopping cart using visitor pattern.
    public double calculateCost(ShoppingCart cart) {
        CostVisitor visitor = new CostVisitor();
        cart.accept(visitor);
        return visitor.getTotalCost();
    }
// Record a purchase, updating total revenue and category-specific revenues.
    public void recordPurchase(ShoppingCart cart, double cost) {
        totalRevenue += cost;
        CostVisitor visitor = new CostVisitor();
        cart.accept(visitor);
        totalToolRevenue += visitor.getToolCost();
        totalGroceryRevenue += visitor.getGroceryCost();
    }
// Display sales statistics including total revenue and average customer spend.
    public void displayStatistics() {
        System.out.println("Retail Store Statistics:");
        System.out.printf("Total Revenue: $%.2f%n", totalRevenue);
//  Display revenue breakdown by category if there is any revenue.
        if (totalRevenue > 0) {
            System.out.printf("Tool Revenue: $%.2f (%.2f%%)%n",
                    totalToolRevenue, 100.0 * totalToolRevenue / totalRevenue);
            System.out.printf("Grocery Revenue: $%.2f (%.2f%%)%n",
                    totalGroceryRevenue, 100.0 * totalGroceryRevenue / totalRevenue);
        }
        if (!customers.isEmpty()) {
            System.out.printf("Average Customer Spend: $%.2f%n",
                    totalRevenue / customers.size());
        }
    }
// Getter for the list of customers.
    public List<Customer> getCustomers() {
        return customers;
    }
}
