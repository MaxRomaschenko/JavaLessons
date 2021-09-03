package behavioralPatterns.visitor.main;

public class Exam implements StudingPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
