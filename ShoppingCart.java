import java.util.*;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        items.forEach(Item::display);
    }

    public void accept(Visitor visitor) {
        items.forEach(item -> item.accept(visitor));
    }
}
