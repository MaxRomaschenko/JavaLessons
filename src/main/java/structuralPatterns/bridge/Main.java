package structuralPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        SportsEquipment[] sportsEquipments = {
                new PingPongBall(new Adidas()),
                new TennisBall(new Nike()),
                new PingPongBall(new Nike())
        };

        for (SportsEquipment sportsEquipment: sportsEquipments){
            sportsEquipment.IsReady();
        }
    }
}
