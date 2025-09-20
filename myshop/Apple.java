// Apple.java - Represents an apple grocery item.
// Created by Cody Cartwright
// Created on September 18th, 2025.

package myshop;
//apple class
public class Apple implements Item {
    private String name;
    private double cost;
    private double calories;
//Apple constructor with name, cost, and calories
    public Apple(String name, double cost, double calories) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }
//basic getter and display method
    public double getCost() {
        return cost;
    }

    public void display() {
        System.out.printf("%s is an apple with %.1f calories and costs $%.2f%n", name, calories, cost);
    }
//accept method for visitor 
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
