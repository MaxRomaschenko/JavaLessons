package behavioralPatterns.strategy;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero();

        hero.setMovementStrategy(new Running());
        hero.move();

        hero.setMovementStrategy(new Walking());
        hero.move();

        hero.setMovementStrategy(new SquatWalking());
        hero.move();

        hero.setMovementStrategy(new Running());
        hero.move();

    }

}
