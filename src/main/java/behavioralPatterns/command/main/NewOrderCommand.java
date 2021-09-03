package behavioralPatterns.command.main;

public class NewOrderCommand implements Command{
    private Order order;

    public NewOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.newOrder();
    }
}
