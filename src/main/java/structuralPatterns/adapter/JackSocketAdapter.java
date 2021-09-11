package structuralPatterns.adapter;

public class JackSocketAdapter implements MiniJackSocket {
    private MicroJackSocket microJackSocket;

    public JackSocketAdapter(MicroJackSocket microJackSocket) {
        this.microJackSocket = microJackSocket;
    }

    @Override
    public void turnOn() {
        microJackSocket.turnOn();
    }
}
