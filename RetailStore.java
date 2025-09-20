import java.util.*;

public class RetailStore {
    private List<Customer> customers = new ArrayList<>();
    private double totalRevenue = 0.0;
    private double totalToolRevenue = 0.0;
    private double totalGroceryRevenue = 0.0;

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public double calculateCost(ShoppingCart cart) {
        CostVisitor visitor = new CostVisitor();
        cart.accept(visitor);
        return visitor.getTotalCost();
    }

    public void recordPurchase(ShoppingCart cart, double cost) {
        totalRevenue += cost;
        CostVisitor visitor = new CostVisitor();
        cart.accept(visitor);
        totalToolRevenue += visitor.getToolCost();
        totalGroceryRevenue += visitor.getGroceryCost();
    }

    public void displayStatistics() {
        System.out.printf("Retail Store Statistics:%n");
        System.out.printf("Total Revenue: $%.2f%n", totalRevenue);
        if (totalRevenue > 0) {
            System.out.printf("Total Tool Revenue: $%.2f (%.2f%%)%n",
                totalToolRevenue, 100.0 * totalToolRevenue / totalRevenue);
            System.out.printf("Total Grocery Revenue: $%.2f (%.2f%%)%n",
                totalGroceryRevenue, 100.0 * totalGroceryRevenue / totalRevenue);
        }
        if (!customers.isEmpty()) {
            System.out.printf("Average Customer Spend: $%.2f%n",
                totalRevenue / customers.size());
        }
    }
}
