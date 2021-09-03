package behavioralPatterns.observer.main;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observed{
    List<String> videos = new ArrayList<>();
    List<Subscriber> subscribers = new ArrayList<>();

    public void addVideo (String video){
        videos.add(video);
        notifySubscribers();
    }

    public void removeVideo (String video){
        videos.remove(video);
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscribers){
            subscriber.handleEvent(videos);
        }
    }
}
