package behavioralPatterns.templateMethod;

public class PoorStudent extends Test{

    @Override
    void comeToExam() {
        System.out.println("Вызывает такси, так как проспал");
    }

    @Override
    void writeTest() {
        System.out.println("Смотрит ответы у отличника");
    }
}
