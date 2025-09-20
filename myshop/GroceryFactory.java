//GroceryFactory.java - Factory for creating grocery items.
 // Created by Cody Cartwright
 // Created on September 20th, 2025.
package myshop;
// Implements ItemFactory to create grocery items like apples and oranges.
public class GroceryFactory implements ItemFactory {
    @Override
    public Hammer createHammer(String name, double price) {
        throw new UnsupportedOperationException("GroceryFactory does not create hammers.");
    }
// Method to create a screwdriver
    @Override
    public Screwdriver createScrewdriver(String name, double price) {
        throw new UnsupportedOperationException("GroceryFactory does not create screwdrivers.");
    }
// Method to create an apple
    @Override
    public Apple createApple(String name, double price, double calories) {
        return new Apple(name, price, calories);
    }
// Method to create an orange
    @Override
    public Orange createOrange(String name, double price, double calories) {
        return new Orange(name, price, calories);
    }
}