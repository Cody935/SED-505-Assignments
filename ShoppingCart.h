#ifndef SHOPPINGCART_H
#define SHOPPINGCART_H

#include <vector>
#include "Item.h"
#include "Visitor.h"

class ShoppingCart {
    std::vector<Item*> items;
public:
    void addItem(Item* item);
    void displayItems(std::ostream& os) const;
    void accept(Visitor& visitor);
};

#endif // SHOPPINGCART_H
