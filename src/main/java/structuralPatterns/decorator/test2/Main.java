package structuralPatterns.decorator.test2;

class Main {

    public static void main (String... s) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation

        InterfaceComponent interfaceComponent = new MainComponent();
        interfaceComponent.doOperation();

        Decorator c1 = new DecoratorComma(new DecoratorSpace(new MainComponent()));
        c1.doOperation(); // Результат выполнения программы "Hello, World!"
        c1.newOperation(); // New hello operation

        Decorator c2 = new DecoratorSpace(new MainComponent());
        c2.doOperation(); // Результат выполнения программы "Hello, World!"
        c2.newOperation(); // New hello operation
    }
}
