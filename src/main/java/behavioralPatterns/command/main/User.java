package behavioralPatterns.command.main;


public class User {
    private Command newOrder;
    private Command repeatOrder;
    private Command detailsOrder;

    public User(Command newOrder, Command repeatOrder, Command detailsOrder) {
        this.newOrder = newOrder;
        this.repeatOrder = repeatOrder;
        this.detailsOrder = detailsOrder;
    }

    public void newOrder(){
        newOrder.execute();
    }

    public void repeatOrder(){
        repeatOrder.execute();
    }
    public void detailsOrder(){
        detailsOrder.execute();
    }

}
