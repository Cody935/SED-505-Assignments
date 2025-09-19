// Tool.h - Tool items like Hammer and Screwdriver

#ifndef TOOL_H
#define TOOL_H

#include "Item.h"
#include <string>

class Hammer;
class Screwdriver;

// Visitor interface needs to be included or forward-declared
class Visitor {
public:
    virtual void visit(Hammer& hammer) = 0;
    virtual void visit(Screwdriver& screwdriver) = 0;

    virtual void visit(class Apple& apple) = 0;       // Forward declare if needed
    virtual void visit(class Orange& orange) = 0;     // Forward declare if needed

    virtual ~Visitor() = default;
};

class Hammer : public Item {
    std::string name;
    double cost;
public:
    Hammer(const std::string& name, double cost) : name(name), cost(cost) {}

    double GetCost() const override { return cost; }
    void display(std::ostream& os) const override {
        os.setf(std::ios::fixed);
        os.precision(2);
        os << name << " is a hammer and costs $" << cost << "." << std::endl;
    }
    void accept(Visitor& visitor) override {
        visitor.visit(*this);
    }
};

class Screwdriver : public Item {
    std::string name;
    double cost;
public:
    Screwdriver(const std::string& name, double cost) : name(name), cost(cost) {}

    double GetCost() const override { return cost; }
    void display(std::ostream& os) const override {
        os.setf(std::ios::fixed);
        os.precision(2);
        os << name << " is a screwdriver and costs $" << cost << "." << std::endl;
    }
    void accept(Visitor& visitor) override {
        visitor.visit(*this);
    }
};

#endif // TOOL_H
