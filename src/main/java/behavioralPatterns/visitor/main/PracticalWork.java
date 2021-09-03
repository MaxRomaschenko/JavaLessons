package behavioralPatterns.visitor.main;

public class PracticalWork implements StudingPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
