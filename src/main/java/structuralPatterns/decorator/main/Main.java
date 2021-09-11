package structuralPatterns.decorator.main;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifierDecorator(new TelegramNotifierDecorator(new MailNotifier()));
        System.out.println( notifier.sendMessage());
        Notifier notifier1 = new MailNotifier();
        System.out.println(notifier1.sendMessage());
        Notifier notifier2 = new TelegramNotifierDecorator(new SMSNotifierDecorator(new MailNotifier()));
        System.out.println(notifier2.sendMessage());
        Notifier notifier3 = new TelegramNotifierDecorator(new MailNotifier());
        System.out.println(notifier3.sendMessage());
    }
}
