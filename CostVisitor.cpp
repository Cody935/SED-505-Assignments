#include "CostVisitor.h"
#include "Tool.h"
#include "Grocery.h"

void CostVisitor::visit(Hammer& hammer) {
    double priceWithTax = hammer.GetCost() * (1.0 + GST);
    totalCost += priceWithTax;
    toolCost += priceWithTax;
}

void CostVisitor::visit(Screwdriver& screwdriver) {
    double priceWithTax = screwdriver.GetCost() * (1.0 + GST);
    totalCost += priceWithTax;
    toolCost += priceWithTax;
}

void CostVisitor::visit(Apple& apple) {
    totalCost += apple.GetCost();
    groceryCost += apple.GetCost();
}

void CostVisitor::visit(Orange& orange) {
    totalCost += orange.GetCost();
    groceryCost += orange.GetCost();
}

double CostVisitor::getTotalCost() const { return totalCost; }
double CostVisitor::getToolCost() const { return toolCost; }
double CostVisitor::getGroceryCost() const { return groceryCost; }

void CostVisitor::reset() {
    totalCost = 0.0;
    toolCost = 0.0;
    groceryCost = 0.0;
}
