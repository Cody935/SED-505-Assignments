public class CostVisitor implements Visitor {
    private double totalCost = 0.0;
    private double toolCost = 0.0;
    private double groceryCost = 0.0;
    public static final double GST = 0.14;

    public void visit(Hammer hammer) {
        double priceWithTax = hammer.getCost() * (1.0 + GST);
        totalCost += priceWithTax;
        toolCost += priceWithTax;
    }

    public void visit(Screwdriver screwdriver) {
        double priceWithTax = screwdriver.getCost() * (1.0 + GST);
        totalCost += priceWithTax;
        toolCost += priceWithTax;
    }

    public void visit(Apple apple) {
        totalCost += apple.getCost();
        groceryCost += apple.getCost();
    }

    public void visit(Orange orange) {
        totalCost += orange.getCost();
        groceryCost += orange.getCost();
    }

    public double getTotalCost() { return totalCost; }
    public double getToolCost() { return toolCost; }
    public double getGroceryCost() { return groceryCost; }
    public void reset() {
        totalCost = 0.0;
        toolCost = 0.0;
        groceryCost = 0.0;
    }
}
