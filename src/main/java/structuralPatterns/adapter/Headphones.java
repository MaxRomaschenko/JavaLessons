package structuralPatterns.adapter;

public class Headphones {
    public void listen(MiniJackSocket miniJackSocket){
        miniJackSocket.turnOn();
    }
}
