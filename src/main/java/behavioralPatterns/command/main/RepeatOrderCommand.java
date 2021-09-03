package behavioralPatterns.command.main;

public class RepeatOrderCommand implements Command{
    private Order order;

    public RepeatOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.repeatOrder();
    }

}
