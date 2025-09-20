public class Hammer implements Item {
    private String name;
    private double cost;

    public Hammer(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() { return cost; }

    public void display() {
        System.out.printf("%s is a hammer and costs $%.2f%n", name, cost);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Screwdriver implements Item {
    private String name;
    private double cost;

    public Screwdriver(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() { return cost; }

    public void display() {
        System.out.printf("%s is a screwdriver and costs $%.2f%n", name, cost);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
