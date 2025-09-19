// Item.h - Base abstract class for all items
#ifndef ITEM_H
#define ITEM_H

#include <iostream>

class Visitor;

class Item {
public:

    virtual ~Item() = default;
    virtual double GetCost() const = 0;
    virtual void display(std::ostream& os) const = 0;

    virtual void accept(Visitor& visitor) = 0;
};
#endif // ITEM_H
