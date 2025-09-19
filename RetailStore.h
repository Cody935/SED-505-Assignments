#ifndef RETAILSTORE_H
#define RETAILSTORE_H

#include <vector>
#include "Customer.h"
#include "ShoppingCart.h"
#include "CostVisitor.h"

class RetailStore {
    std::vector<Customer*> customers;
    double totalRevenue = 0.0;
    double totalToolRevenue = 0.0;
    double totalGroceryRevenue = 0.0;

public:
    void addCustomer(Customer* customer);
    double calculateCost(const ShoppingCart& cart);
    void recordPurchase(const ShoppingCart& cart, double cost);
    void displayStatistics(std::ostream& os) const;
    void clear();
};

#endif // RETAILSTORE_H
