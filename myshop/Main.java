// Main.java - Entry point for the retail store test program.
// Created by Cody Cartwright, and Karim Sarif.
// Created on September 20, 2025.

package myshop;

import java.util.Scanner;
// Main class to run the retail store application.
public class Main {
    // Main method to start the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 0 for automatic tester, 1 for manual input:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
// Create the retail store and item factories.
        RetailStore store = new RetailStore();
        ItemFactory toolFactory = new ToolFactory();
        ItemFactory groceryFactory = new GroceryFactory();

        if (choice >= 0) {
       //Automatic test 
            Customer customer1 = new Customer("Fighter", 100.0, store);
            Customer customer2 = new Customer("Wizard", 150.0, store);
            Customer customer3 = new Customer("Spaceship", 2000000.0, store);
// Add customers to the store.
            store.addCustomer(customer1);
            store.addCustomer(customer2);
            store.addCustomer(customer3);
// Add items to each customer's cart.
            customer1.addItemToCart(toolFactory.createHammer("Axe Hammer", 20.0));
            customer1.addItemToCart(groceryFactory.createApple("Healing Apple", 3.0, 95.0));

            customer2.addItemToCart(toolFactory.createScrewdriver("Magical Screwdriver Wand", 15.0));
            customer2.addItemToCart(groceryFactory.createOrange("Mystical Orange", 4.0, 80.0));

            customer3.addItemToCart(toolFactory.createHammer("Lazer Gun Hammer", 18000.0));
            customer3.addItemToCart(groceryFactory.createOrange("Diesel Orange? Im out of ideas professor", 50000.0, 1090.0));
// Process purchases and display orders.
            if (customer1.purchase()) {
                customer1.displayOrder();
                System.out.printf("Remaining cash: $%.2f%n%n", customer1.getCash());
            }
            if (customer2.purchase()) {
                customer2.displayOrder();
                System.out.printf("Remaining cash: $%.2f%n%n", customer2.getCash());
            }
            if (customer3.purchase()) {
                customer3.displayOrder();
                System.out.printf("Remaining cash: $%.2f%n%n", customer3.getCash());
            }
// Display store statistics.
            store.displayStatistics();
            //manual test
        } else if (choice == 1) {
            System.out.print("Enter number of customers: ");
            int numCustomers = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < numCustomers; i++) {
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();
                System.out.print("Enter starting cash: ");
                double cash = scanner.nextDouble();
                scanner.nextLine(); 
// Create and add customer to the store.
                Customer customer = new Customer(name, cash, store);
                store.addCustomer(customer);
// Limit to max 4 items, max 2 tools and 2 groceries.
                System.out.print("How many items would you like to buy? (max 4): ");
                int numItems = scanner.nextInt();
                scanner.nextLine(); 
                if (numItems > 4) numItems = 4;
// Track number of tools and groceries added.
                int toolsAdded = 0;
                int groceriesAdded = 0;
// Loop to add items to the customer's cart.
                for (int j = 0; j < numItems; ) {
                    System.out.println("Select item type: 1=Hammer, 2=Screwdriver, 3=Apple, 4=Orange");
                    int itemType = scanner.nextInt();
                    scanner.nextLine(); 
// Enforce limits on tools and groceries.
                    if ((itemType == 1 || itemType == 2) && toolsAdded >= 2) {
                        System.out.println("You cannot add more than 2 tools.");
                        continue;
                    }
                    if ((itemType == 3 || itemType == 4) && groceriesAdded >= 2) {
                        System.out.println("You cannot add more than 2 groceries.");
                        continue;
                    }
// Switch to create and add the selected item type.
                    switch (itemType) {
                        case 1:
                            System.out.print("Hammer name: ");
                            String hName = scanner.nextLine();
                            System.out.print("Hammer price: ");
                            double hPrice = scanner.nextDouble();
                            scanner.nextLine();
                            customer.addItemToCart(toolFactory.createHammer(hName, hPrice));
                            toolsAdded++;
                            break;
                        case 2:
                            System.out.print("Screwdriver name: ");
                            String sName = scanner.nextLine();
                            System.out.print("Screwdriver price: ");
                            double sPrice = scanner.nextDouble();
                            scanner.nextLine();
                            customer.addItemToCart(toolFactory.createScrewdriver(sName, sPrice));
                            toolsAdded++;
                            break;
                        case 3:
                            System.out.print("Apple name: ");
                            String aName = scanner.nextLine();
                            System.out.print("Apple price: ");
                            double aPrice = scanner.nextDouble();
                            System.out.print("Apple calories: ");
                            double aCal = scanner.nextDouble();
                            scanner.nextLine();
                            customer.addItemToCart(groceryFactory.createApple(aName, aPrice, aCal));
                            groceriesAdded++;
                            break;
                        case 4:
                            System.out.print("Orange name: ");
                            String oName = scanner.nextLine();
                            System.out.print("Orange price: ");
                            double oPrice = scanner.nextDouble();
                            System.out.print("Orange calories: ");
                            double oCal = scanner.nextDouble();
                            scanner.nextLine();
                            customer.addItemToCart(groceryFactory.createOrange(oName, oPrice, oCal));
                            groceriesAdded++;
                            break;
                        default:
                            System.out.println("Invalid item type.");
                            continue;
                    }
                    j++; // Only increment if a valid item was added
                }
            }
// Process purchases and display orders for all customers.
            for (Customer customer : store.getCustomers()) {
                if (customer.purchase()) {
                    customer.displayOrder();
                    System.out.printf("Remaining cash: $%.2f%n%n", customer.getCash());
                }
            }
            store.displayStatistics();
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
