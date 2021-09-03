package behavioralPatterns.strategy;

public class Walking implements MovementStrategy{

    @Override
    public void movement() {
        System.out.println("Walking algorithm");
    }
}
