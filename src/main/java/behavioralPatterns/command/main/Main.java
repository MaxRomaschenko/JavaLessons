package behavioralPatterns.command.main;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        User user = new User( new NewOrderCommand(order),
                new RepeatOrderCommand(order),
                new DetailsOrderCommand(order));

        user.newOrder();
        user.repeatOrder();
        user.detailsOrder();
    }
}
