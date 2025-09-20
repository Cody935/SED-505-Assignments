// Hammer.java - Represents a hammer hardware item.
 // Created by Karim Sarif
 // Created on September 19th, 2025.
package myshop;
// Implements Item interface for a hammer item.
public class Hammer implements Item {
    private String name;
    private double cost;
// Constructor for Hammer with name and cost.
    public Hammer(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
// Basic getter and display method.
    public double getCost() {
        return cost;
    }
// Display method to show hammer details.
    public void display() {
        System.out.printf("%s is a hammer and costs $%.2f%n", name, cost);
    }
// Accept method for visitor pattern.
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
