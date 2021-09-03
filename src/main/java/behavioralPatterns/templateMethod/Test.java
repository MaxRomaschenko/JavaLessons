package behavioralPatterns.templateMethod;

public abstract class Test {
    public void passTest(){
        comeToExam();
        writeTest();
    }
    abstract void comeToExam();
    abstract void writeTest();


}
