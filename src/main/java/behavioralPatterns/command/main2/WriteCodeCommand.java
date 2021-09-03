package behavioralPatterns.command.main2;

public class WriteCodeCommand implements Command{

    private Developer developer;

    public WriteCodeCommand(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void execute() {
        developer.writeProgramCode();
    }
}
