#include "RetailStore.h"
#include <iostream>

void RetailStore::addCustomer(Customer* customer) {
    customers.push_back(customer);
}

double RetailStore::calculateCost(const ShoppingCart& cart) {
    CostVisitor visitor;
    const_cast<ShoppingCart&>(cart).accept(visitor);
    return visitor.getTotalCost();
}

void RetailStore::recordPurchase(const ShoppingCart& cart, double cost) {
    totalRevenue += cost;

    CostVisitor visitor;
    const_cast<ShoppingCart&>(cart).accept(visitor);
    
    totalToolRevenue += visitor.getToolCost();
    totalGroceryRevenue += visitor.getGroceryCost();
}

void RetailStore::displayStatistics(std::ostream& os) const {
    os << "Retail Store Statistics:\n";
    os << "Total Revenue: $" << totalRevenue << "\n";
    os << "Total Tool Revenue: $" << totalToolRevenue << " (" << (totalToolRevenue / totalRevenue) * 100 << "%)\n";
    os << "Total Grocery Revenue: $" << totalGroceryRevenue << " (" << (totalGroceryRevenue / totalRevenue) * 100 << "%)\n";
    if (!customers.empty()) {
        os << "Average Customer Spend: $" << totalRevenue / customers.size() << "\n";
    }
}

void RetailStore::clear() {
    customers.clear();
    totalRevenue = 0.0;
    totalToolRevenue = 0.0;
    totalGroceryRevenue = 0.0;
}
