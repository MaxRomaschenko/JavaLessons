package behavioralPatterns.visitor.test2;
public class Monitor implements ComputerPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
