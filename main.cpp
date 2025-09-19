#include <iostream>
#include <string>
#include "RetailStore.h"
#include "Customer.h"
#include "Tool.h"
#include "Grocery.h"

int main() {
    RetailStore store;

    // Create customers
    Customer customer1("Alice", 100.0, &store);
    Customer customer2("Bob", 150.0, &store);
    Customer customer3("Charlie", 200.0, &store);

    store.addCustomer(&customer1);
    store.addCustomer(&customer2);
    store.addCustomer(&customer3);

    // Sample cart filling (this would be interactive or from CreateGrocery/Toolbox functions)
    customer1.addItemToCart(new Hammer("Heavy Hammer", 20.0));
    customer1.addItemToCart(new Apple("Red Apple", 3.0, 95.0));

    customer2.addItemToCart(new Screwdriver("Phillips Screwdriver", 15.0));
    customer2.addItemToCart(new Orange("Orange", 4.0, 80.0));

    customer3.addItemToCart(new Hammer("Light Hammer", 18.0));
    customer3.addItemToCart(new Orange("Valencia Orange", 5.0, 90.0));

    // Process purchases
    if (customer1.purchase()) {
        customer1.displayOrder(std::cout);
        std::cout << "Remaining cash: $" << customer1.getCash() << "\n\n";
    }
    if (customer2.purchase()) {
        customer2.displayOrder(std::cout);
        std::cout << "Remaining cash: $" << customer2.getCash() << "\n\n";
    }
    if (customer3.purchase()) {
        customer3.displayOrder(std::cout);
        std::cout << "Remaining cash: $" << customer3.getCash() << "\n\n";
    }

    // Display store statistics
    store.displayStatistics(std::cout);

    return 0;
}
