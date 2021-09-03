package behavioralPatterns.visitor.test;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in acrion...");
        project.beWritten(junior);

        System.out.println("\nSenior in action...");
        project.beWritten(senior);
    }
}
