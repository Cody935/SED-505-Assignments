#include "ShoppingCart.h"
#include <iostream>

void ShoppingCart::addItem(Item* item) {
    items.push_back(item);
}

void ShoppingCart::displayItems(std::ostream& os) const {
    for (auto item : items) {
        item->display(os);
    }
}

void ShoppingCart::accept(Visitor& visitor) {
    for (auto item : items) {
        item->accept(visitor);
    }
}
