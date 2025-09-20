//ToolFactory.java - Factory for creating tool items.
 // Created by Karim Sarif
 // Created on September 20th, 2025.
package myshop;
// Implements ItemFactory to create tool items like hammers and screwdrivers.
public class ToolFactory implements ItemFactory {
    @Override
    public Hammer createHammer(String name, double price) {
        return new Hammer(name, price);
    }
// Method to create a screwdriver
    @Override
    public Screwdriver createScrewdriver(String name, double price) {
        return new Screwdriver(name, price);
    }
// Methods below throw exceptions as ToolFactory does not create grocery items.
    @Override
    public Apple createApple(String name, double price, double calories) {
        throw new UnsupportedOperationException("ToolFactory does not create apples.");
    }
// Method to create an orange
    @Override
    public Orange createOrange(String name, double price, double calories) {
        throw new UnsupportedOperationException("ToolFactory does not create oranges.");
    }
}