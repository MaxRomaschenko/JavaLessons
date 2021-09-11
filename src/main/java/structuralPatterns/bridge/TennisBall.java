package structuralPatterns.bridge;

public class TennisBall extends SportsEquipment{

    public TennisBall(CompanyManufacturer companyManufacturer) {
        super(companyManufacturer);
    }

    @Override
    public boolean IsReady() {
        companyManufacturer.createEquipment();
        System.out.println(true);
        return true;
    }




}
