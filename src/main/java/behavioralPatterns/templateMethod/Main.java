package behavioralPatterns.templateMethod;

public class Main {
    public static void main(String[] args) {
        ExelentStudent exelentStudent = new ExelentStudent();
        PoorStudent poorStudent = new PoorStudent();

        System.out.println("Что бы сдать тест отличник: ");
        exelentStudent.passTest();
        System.out.println("\nЧто бы сдать тест двоечник: ");
        poorStudent.passTest();
    }
}
