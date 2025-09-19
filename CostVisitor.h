#ifndef COSTVISITOR_H
#define COSTVISITOR_H

#include "Visitor.h"

class CostVisitor : public Visitor {
    double totalCost = 0.0;
    double toolCost = 0.0;
    double groceryCost = 0.0;
    static constexpr double GST = 0.14;

public:
    void visit(Hammer& hammer) override;
    void visit(Screwdriver& screwdriver) override;
    void visit(Apple& apple) override;
    void visit(Orange& orange) override;

    double getTotalCost() const;
    double getToolCost() const;
    double getGroceryCost() const;
    void reset();
};

#endif // COSTVISITOR_H
