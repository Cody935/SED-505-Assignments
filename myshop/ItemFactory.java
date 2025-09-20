//itemFactory.java - Factory interface for creating items.
 // Created by Karim Sarif
 // Created on September 20th, 2025.
package myshop;

// Factory interface for creating various items.
public interface ItemFactory {
    Hammer createHammer(String name, double price);
    Screwdriver createScrewdriver(String name, double price);
    Apple createApple(String name, double price, double calories);
    Orange createOrange(String name, double price, double calories);
}