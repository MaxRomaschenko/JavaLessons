package behavioralPatterns.observer.main;

import java.util.List;

public class SubscriberAccount implements Subscriber {

    private String nickname;
    private String email;

    public SubscriberAccount(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    @Override
    public void handleEvent(List<String> newVideo) {
        System.out.println("Dear, " + nickname + " watch my videos: " + newVideo );
    }
}
