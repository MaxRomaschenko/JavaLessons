package behavioralPatterns.state.main;

public class Rides implements Activity{
    @Override
    public void working() {
        System.out.println("Автобус едет к следующей остановке");
    }
}
