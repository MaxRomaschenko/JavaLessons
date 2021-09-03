package behavioralPatterns.templateMethod;

public class ExelentStudent extends Test{
    @Override
    void comeToExam() {
        System.out.println("Приезжает на автобусе");
    }

    @Override
    void writeTest() {
        System.out.println("Вспоминает всё что учил");
    }
}
