package behavioralPatterns.chainOfResponsibility.main;

public class Main {
    public static void main(String[] args) {
        Color color = new Black(
                new Green(
                        new Yellow(
                                new UnKnown(null))));

        color.printColor(15,20);
        color.printColor(95,140);
        color.printColor(150,150);
        color.printColor(-50,150);
        color.printColor(0, 300);
    }
}
