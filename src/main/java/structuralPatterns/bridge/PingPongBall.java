package structuralPatterns.bridge;

public class PingPongBall extends SportsEquipment{

    public PingPongBall(CompanyManufacturer companyManufacturer) {
        super(companyManufacturer);
    }

    @Override
    boolean IsReady() {
        companyManufacturer.createEquipment();
        System.out.println(true);
        return true;
    }


}
