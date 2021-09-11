package structuralPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        MicroJackSocket microJackSocket = new MicroJack();
        Headphones headphones = new Headphones();
        MiniJackSocket miniJackSocket = new JackSocketAdapter(microJackSocket);
        headphones.listen(miniJackSocket);
    }
}
