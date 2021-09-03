package behavioralPatterns.strategy;

public class SquatWalking implements MovementStrategy{
    @Override
    public void movement() {
        System.out.println("Squat walking algorithm");
    }
}
