package behavioralPatterns.command.main2;

public class TestCommand implements Command{

    private Developer developer;

    public TestCommand(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void execute() {
        developer.testProgram();
    }
}
