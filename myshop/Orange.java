// Orange.java - Represents an orange grocery item.
 // Created by Karim Sarif
 // Created on September 20th, 2025.
package myshop;
// Represents an orange grocery item.
public class Orange implements Item {
    private String name;
    private double cost;
    private double calories;
    // Orange constructor with name, cost, and calories
    public Orange(String name, double cost, double calories) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }
// Basic getter and display method
    public double getCost() {
        return cost;
    }
// Display method to show orange details
    public void display() {
        System.out.printf("%s is an orange with %.1f calories and costs $%.2f%n", name, calories, cost);
    }
// Accept method for visitor pattern
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
