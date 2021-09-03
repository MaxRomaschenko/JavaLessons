package behavioralPatterns.command.main2;

public class Selector {
    private Command test,writeCode;

    public Selector(Command test, Command writeCode) {
        this.test = test;
        this.writeCode = writeCode;
    }

    public void test(){
        test.execute();
    }
    public void writeCode(){
        writeCode.execute();
    }
}
