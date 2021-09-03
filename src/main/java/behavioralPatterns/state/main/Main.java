package behavioralPatterns.state.main;

public class Main {
    public static void main(String[] args) {
        Activity activity = new Rides();
        Bus bus = new Bus();
        bus.setActivity(activity);
        for (int i = 0; i < 20; i++ ){
            bus.working();
            bus.changeActivity();
        }
    }
}
