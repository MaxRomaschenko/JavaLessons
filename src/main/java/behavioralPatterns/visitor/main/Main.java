package behavioralPatterns.visitor.main;

public class Main {
    public static void main(String[] args) {
        StudingPart studies = new Studies();
        studies.accept(new Teacher());
        System.out.println();
        studies.accept(new BadStudent());
        System.out.println();
        studies.accept(new GoodStudent());
    }
}
