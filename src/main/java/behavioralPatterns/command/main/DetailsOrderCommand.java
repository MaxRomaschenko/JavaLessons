package behavioralPatterns.command.main;

public class DetailsOrderCommand implements Command{
    private Order order;

    public DetailsOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.detailsOrder();
    }
}
