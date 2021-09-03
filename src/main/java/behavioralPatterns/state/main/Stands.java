package behavioralPatterns.state.main;

public class Stands implements Activity{
    @Override
    public void working() {
        System.out.println("Автобус стоит на остановке");
    }
}
