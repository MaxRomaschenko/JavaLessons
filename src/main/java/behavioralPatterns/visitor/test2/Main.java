package behavioralPatterns.visitor.test2;

public class Main {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new Report());
    }
}
