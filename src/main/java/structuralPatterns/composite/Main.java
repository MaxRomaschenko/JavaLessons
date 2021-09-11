package structuralPatterns.composite;

public class Main {
    public static void main(String[] args) {
        CarMark audi1 = new Audi();
        CarMark audi2 = new Audi();

        CarMark ford1 = new Ford();
        CarMark ford2 = new Ford();
        CarMark ford3 = new Ford();

        CarMark honda1 = new Honda();
        CarMark honda2 = new Honda();
        CarMark honda3 = new Honda();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite1.addComponent(audi1);
        composite1.addComponent(audi2);
        composite1.addComponent(ford1);
        composite1.addComponent(ford2);

        composite2.addComponent(audi1);
        composite2.addComponent(ford3);
        composite2.addComponent(honda1);
        composite2.addComponent(honda2);
        composite2.addComponent(honda3);

        composite3.addComponent(composite1);
        composite3.addComponent(composite2);

        System.out.println("//////////////////composite3.getMark();//////////////////////");
        composite3.getMark();
        System.out.println("//////////////////composite1.getMark();//////////////////////");
        composite1.getMark();
        System.out.println("//////////////////composite2.getMark();/////////////////////////////");
        composite2.getMark();
        System.out.println("/////////////////composite1.getMark();/////////////////////////////");
        composite1.addComponent(composite2);
        composite1.getMark();
        System.out.println("/////////////////composite3.getMark();///////////////////////////////");
        composite3.getMark();
    }
}
