#include "Customer.h"
#include "RetailStore.h"
#include <iostream>

Customer::Customer(const std::string& name, double cash, RetailStore* store)
    : name(name), cash(cash), store(store) {}

bool Customer::addItemToCart(Item* item) {
    cart.addItem(item);
    return true;
}

bool Customer::purchase() {
    if (!store) return false;
    double cost = store->calculateCost(cart);
    if (cash >= cost) {
        cash -= cost;
        store->recordPurchase(cart, cost);
        return true;
    }
    return false;
}

void Customer::displayOrder(std::ostream& os) const {
    os << "Order for " << name << ":\n";
    cart.displayItems(os);
}

const std::string& Customer::getName() const { return name; }
double Customer::getCash() const { return cash; }
