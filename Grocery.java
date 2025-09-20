public class Apple implements Item {
    private String name;
    private double cost;
    private double calories;

    public Apple(String name, double cost, double calories) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }

    public double getCost() { return cost; }

    public void display() {
        System.out.printf("%s is an apple with %.1f calories and costs $%.2f%n", name, calories, cost);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Orange implements Item {
    private String name;
    private double cost;
    private double calories;

    public Orange(String name, double cost, double calories) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }

    public double getCost() { return cost; }

    public void display() {
        System.out.printf("%s is an orange with %.1f calories and costs $%.2f%n", name, calories, cost);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
