package structuralPatterns.bridge;

public abstract class SportsEquipment {

    protected CompanyManufacturer companyManufacturer;

    public SportsEquipment(CompanyManufacturer companyManufacturer) {
        this.companyManufacturer = companyManufacturer;
    }

    abstract boolean IsReady();
}
