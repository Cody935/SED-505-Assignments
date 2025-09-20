public class Main {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        Customer customer1 = new Customer("Alice", 100.0, store);
        Customer customer2 = new Customer("Bob", 150.0, store);
        Customer customer3 = new Customer("Charlie", 200.0, store);

        store.addCustomer(customer1);
        store.addCustomer(customer2);
        store.addCustomer(customer3);

        customer1.addItemToCart(new Hammer("Heavy Hammer", 20.0));
        customer1.addItemToCart(new Apple("Red Apple", 3.0, 95.0));

        customer2.addItemToCart(new Screwdriver("Phillips", 15.0));
        customer2.addItemToCart(new Orange("Orange", 4.0, 80.0));

        customer3.addItemToCart(new Hammer("Light Hammer", 18.0));
        customer3.addItemToCart(new Orange("Valencia Orange", 5.0, 90.0));

        if (customer1.purchase()) {
            customer1.displayOrder();
            System.out.printf("Remaining cash: $%.2f%n%n", customer1.getCash());
        }
        if (customer2.purchase()) {
            customer2.displayOrder();
            System.out.printf("Remaining cash: $%.2f%n%n", customer2.getCash());
        }
        if (customer3.purchase()) {
            customer3.displayOrder();
            System.out.printf("Remaining cash: $%.2f%n%n", customer3.getCash());
        }

        store.displayStatistics();
    }
}
