package behavioralPatterns.observer.main;

public class Main {
    public static void main(String[] args) {
        SubscriberAccount sub1 = new SubscriberAccount("Max","sub1@some.com");
        SubscriberAccount sub2 = new SubscriberAccount("Sema","sub2@some.com");
        SubscriberAccount sub3 = new SubscriberAccount("Artem","sub3@some.com");

        YoutubeChannel myChannel = new YoutubeChannel();
        myChannel.addSubscriber(sub1);
        myChannel.addSubscriber(sub2);

        myChannel.addVideo("TikTok life hacks");
        myChannel.addVideo("Dota 2");

        myChannel.removeVideo("Dota 2");
        myChannel.addSubscriber(sub3);
        myChannel.addVideo("Java Design Patterns");



    }
}
