package structuralPatterns.decorator.main;

public class MailNotifier implements Notifier{
    @Override
    public String sendMessage() {
        return "Mail notifier ";
    }
}
