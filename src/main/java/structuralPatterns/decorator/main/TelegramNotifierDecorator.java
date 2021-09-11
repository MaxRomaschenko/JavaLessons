package structuralPatterns.decorator.main;

public class TelegramNotifierDecorator implements Notifier{

    Notifier notifier;

    public TelegramNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String sendMessage() {
        return "Telegram notifier " + notifier.sendMessage();
    }
}
