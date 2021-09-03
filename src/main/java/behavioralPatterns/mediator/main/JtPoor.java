package behavioralPatterns.mediator.main;

public class JtPoor extends Colleague{

    public JtPoor(Mediator mediator) {
        super(mediator);
        System.out.println("JtPoor slacks signed up for the exchange\n");
    }
}
