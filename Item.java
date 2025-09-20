public interface Item {
    double getCost();
    void display();
    void accept(Visitor visitor);
}
