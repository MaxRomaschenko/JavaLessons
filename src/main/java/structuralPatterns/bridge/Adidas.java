package structuralPatterns.bridge;

public class Adidas implements CompanyManufacturer{
    @Override
    public void createEquipment() {
        System.out.println("Создаём спортинвентарь Adidas");
    }
}
