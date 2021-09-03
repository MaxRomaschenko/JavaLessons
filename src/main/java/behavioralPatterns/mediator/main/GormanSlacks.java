package behavioralPatterns.mediator.main;

public class GormanSlacks extends Colleague{
    public GormanSlacks(Mediator mediator) {
        super(mediator);
        System.out.println("Gorman slacks signed up for the exchange\n");
    }
}
