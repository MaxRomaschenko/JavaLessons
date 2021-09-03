package behavioralPatterns.observer.main;

import java.util.List;

public interface Subscriber {
    void handleEvent(List<String> newVideo);
}
