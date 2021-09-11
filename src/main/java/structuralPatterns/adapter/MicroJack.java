package structuralPatterns.adapter;

public class MicroJack implements MicroJackSocket {
    @Override
    public void turnOn() {
        System.out.println("Разъём идеально подходит");
    }
}
