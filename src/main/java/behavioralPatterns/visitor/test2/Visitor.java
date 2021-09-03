package behavioralPatterns.visitor.test2;

public interface Visitor {

    void visit(Keyboard keyboard);
    void visit(Mouse keyboard);
    void visit(Monitor keyboard);
    void visit(Printer printer);
    void visit(Computer printer);
}
