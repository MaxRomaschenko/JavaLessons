package behavioralPatterns.visitor.test;

public class Test implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
