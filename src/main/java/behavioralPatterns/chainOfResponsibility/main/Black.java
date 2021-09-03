package behavioralPatterns.chainOfResponsibility.main;

public class Black extends Color{

    public Black(Color nextColor) {
        super(nextColor);
    }

    @Override
    public void printColor(int x, int y) {
        if(x >= 0 && x < 90 && y >= 0 && y < 90){
            System.out.println("Black");
        }else {
            super.printColor(x, y);
        }
    }
}
