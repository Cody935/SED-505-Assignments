// Item.java - Interface for items in the retail store.
 // Created by Cody Cartwright
 // Created on September 18th, 2025.
package myshop;

// Item interface with methods for cost, display, and accept for visitor pattern.
public interface Item {
    double getCost();
    void display();
    void accept(Visitor visitor);
}
