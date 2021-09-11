package structuralPatterns.bridge;

public class Nike implements CompanyManufacturer{
    @Override
    public void createEquipment() {
        System.out.println("создаём спортинвентарь Nike");
    }
}
