// Screwdriver.java - Represents a screwdriver hardware item.
 // Created by karim Sarif
 // Created on September 19th, 2025.
package myshop;
// Implements Item interface for a screwdriver item.
public class Screwdriver implements Item {
    private String name;
    private double cost;
// Constructor for Screwdriver with name and cost.
    public Screwdriver(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
// Basic getter and display method.
    public double getCost() {
        return cost;
    }
// Display method to show screwdriver details.
    public void display() {
        System.out.printf("%s is a screwdriver and costs $%.2f%n", name, cost);
    }
// Accept method for visitor pattern.
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
