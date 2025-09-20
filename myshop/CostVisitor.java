// CostVisitor.java - Visitor implementation to calculate costs with tax.
 // Created by Karim Sarif
 // Created on September 18th, 2025.
package myshop;

// GST is 14% for tools, 0% for groceries.  Class defines methods to get total cost, tool cost, and grocery cost.
public class CostVisitor implements Visitor {
    private double totalCost = 0.0;
    private double toolCost = 0.0;
    private double groceryCost = 0.0;
    private static final double GST = 0.14;
//visit method for hammer
    public void visit(Hammer hammer) {
        double priceWithTax = hammer.getCost() * (1 + GST);
        totalCost += priceWithTax;
        toolCost += priceWithTax;
    }
//visit method for screwdriver
    public void visit(Screwdriver screwdriver) {
        double priceWithTax = screwdriver.getCost() * (1 + GST);
        totalCost += priceWithTax;
        toolCost += priceWithTax;
    }

    public void visit(Apple apple) {
        totalCost += apple.getCost();
        groceryCost += apple.getCost();
    }

    public void visit(Orange orange) {
        totalCost += orange.getCost();
        groceryCost += orange.getCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getToolCost() {
        return toolCost;
    }

    public double getGroceryCost() {
        return groceryCost;
    }

    public void reset() {
        totalCost = 0.0;
        toolCost = 0.0;
        groceryCost = 0.0;
    }
}
