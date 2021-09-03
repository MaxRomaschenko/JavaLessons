package behavioralPatterns.command.main2;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Command test = new TestCommand(developer);
        Command writeCode = new WriteCodeCommand(developer);
        Selector selector = new Selector(test,writeCode);

        selector.test();
        selector.writeCode();
    }
}
