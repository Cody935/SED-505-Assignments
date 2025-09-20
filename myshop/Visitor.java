//Visitor.java - Visitor interface for items in the retail store.
 // Created by Cody Cartwright
 // Created on September 18th, 2025.
package myshop;

// Visitor interface with visit methods for each item type.
public interface Visitor {
    void visit(Hammer hammer);
    void visit(Screwdriver screwdriver);
    void visit(Apple apple);
    void visit(Orange orange);
}
