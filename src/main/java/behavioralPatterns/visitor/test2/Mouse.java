package behavioralPatterns.visitor.test2;

public class Mouse implements ComputerPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
