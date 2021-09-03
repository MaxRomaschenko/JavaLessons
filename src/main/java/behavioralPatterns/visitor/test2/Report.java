package behavioralPatterns.visitor.test2;

public class Report implements Visitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard: Logitech k120");
    }

    @Override
    public void visit(Mouse keyboard) {
        System.out.println("Mouse: Logitech m185");
    }

    @Override
    public void visit(Monitor keyboard) {
        System.out.println("Monitor: Asus VZ229HE");
    }

    @Override
    public void visit(Printer printer) {
        System.out.println("Printer: Canon PIXMA iP8740");
    }

    @Override
    public void visit(Computer printer) {
        System.out.println("Computer: Asus ZenBook UX510Uw");
    }
}
