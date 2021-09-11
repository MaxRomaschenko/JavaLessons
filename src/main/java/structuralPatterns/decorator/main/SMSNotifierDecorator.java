package structuralPatterns.decorator.main;

public class SMSNotifierDecorator implements Notifier{

    Notifier notifier;

    public SMSNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }


    @Override
    public String sendMessage() {
        return "send SMS " + notifier.sendMessage();
    }
}
