package behavioralPatterns.strategy;

public class Hero {
    private MovementStrategy movementStrategy;

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move(){
        movementStrategy.movement();
    }
}
