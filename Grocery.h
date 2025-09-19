// Grocery.h - Grocery items like Apple and Orange

#ifndef GROCERY_H
#define GROCERY_H

#include "Item.h"
#include <string>

class Apple;
class Orange;

class Visitor; // Forward declaration of Visitor

class Apple : public Item {
    std::string name;
    double cost;
    double calories;
public:
    Apple(const std::string& name, double cost, double calories)
        : name(name), cost(cost), calories(calories) {}

    double GetCost() const override { return cost; }
    void display(std::ostream& os) const override {
        os.setf(std::ios::fixed);
        os.precision(2);
        os << name << " is an apple with " << calories << " calories and costs $" << cost << "." << std::endl;
    }
    void accept(Visitor& visitor) override {
        visitor.visit(*this);
    }
};

class Orange : public Item {
    std::string name;
    double cost;
    double calories;
public:
    Orange(const std::string& name, double cost, double calories)
        : name(name), cost(cost), calories(calories) {}

    double GetCost() const override { return cost; }
    void display(std::ostream& os) const override {
        os.setf(std::ios::fixed);
        os.precision(2);
        os << name << " is an orange with " << calories << " calories and costs $" << cost << "." << std::endl;
    }
    void accept(Visitor& visitor) override {
        visitor.visit(*this);
    }
};

#endif // GROCERY_H
