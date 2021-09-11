package behavioralPatterns.mediator.test2;

public class JtPoor extends Colleague{

    public JtPoor(Mediator mediator) {
        super(mediator);
        System.out.println("JtPoor slacks signed up for the exchange\n");
    }
}
