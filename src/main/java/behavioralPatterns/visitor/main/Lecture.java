package behavioralPatterns.visitor.main;

public class Lecture implements StudingPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
