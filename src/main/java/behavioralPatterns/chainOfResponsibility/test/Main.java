package behavioralPatterns.chainOfResponsibility.test;

public class Main {
    public static void main(String[] args) {
        Number number = new NegativeNumber(
                new PositiveNumber(
                        new ZeroNumber(null)));

        number.process(10);
        number.process(-10);
        number.process(0);
    }
}
