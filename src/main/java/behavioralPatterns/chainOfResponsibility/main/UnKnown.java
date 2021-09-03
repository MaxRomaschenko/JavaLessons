package behavioralPatterns.chainOfResponsibility.main;

public class UnKnown extends Color{

    public UnKnown(Color nextColor) {
        super(nextColor);
    }

    @Override
    public void printColor(int x, int y) {

        if(x < 0 || x > 210 && y < 0 || y > 210){
            System.out.println("Unknown");
        }else {
            super.printColor(x, y);
        }

    }
}
