package structuralPatterns.decorator.test2;

class MainComponent implements InterfaceComponent {

    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
