#ifndef CUSTOMER_H
#define CUSTOMER_H

#include <string>
#include "ShoppingCart.h"

class RetailStore;

class Customer {
    std::string name;
    double cash;
    RetailStore* store;
    ShoppingCart cart;

public:
    Customer(const std::string& name, double cash, RetailStore* store);
    bool addItemToCart(Item* item);
    bool purchase();
    void displayOrder(std::ostream& os) const;
    const std::string& getName() const;
    double getCash() const;
};

#endif // CUSTOMER_H
