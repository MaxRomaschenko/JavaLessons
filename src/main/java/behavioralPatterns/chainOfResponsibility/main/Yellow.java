package behavioralPatterns.chainOfResponsibility.main;

public class Yellow extends Color{

    public Yellow(Color nextColor) {
        super(nextColor);
    }

    @Override
    public void printColor(int x, int y) {
        if(x > 140 && x <= 210 && y > 140 && y <= 210){
            System.out.println("Yellow");
        }else {
            super.printColor(x, y);
        }
    }
}
