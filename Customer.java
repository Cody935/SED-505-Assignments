public class Customer {
    private String name;
    private double cash;
    private RetailStore store;
    private ShoppingCart cart = new ShoppingCart();

    public Customer(String name, double cash, RetailStore store) {
        this.name = name;
        this.cash = cash;
        this.store = store;
    }

    public void addItemToCart(Item item) {
        cart.addItem(item);
    }

    public boolean purchase() {
        double cost = store.calculateCost(cart);
        if (cash >= cost) {
            cash -= cost;
            store.recordPurchase(cart, cost);
            return true;
        }
        return false;
    }

    public void displayOrder() {
        System.out.println("Order for " + name + ":");
        cart.displayItems();
    }

    public String getName() { return name; }
    public double getCash() { return cash; }
}
