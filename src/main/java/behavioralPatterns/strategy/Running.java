package behavioralPatterns.strategy;

public class Running implements MovementStrategy{

    @Override
    public void movement() {
        System.out.println("Running algorithm ");
    }
}
