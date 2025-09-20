public interface Visitor {
    void visit(Hammer hammer);
    void visit(Screwdriver screwdriver);
    void visit(Apple apple);
    void visit(Orange orange);
}
