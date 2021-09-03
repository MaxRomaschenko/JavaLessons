package behavioralPatterns.chainOfResponsibility.main;

public class Green extends Color{

    public Green(Color nextColor) {
        super(nextColor);
    }

    @Override
    public void printColor(int x, int y) {
        if(x >= 90 && x <= 140 && y >= 90 && y <= 140){
            System.out.println("Green");
        }else{
            super.printColor(x,y);
        }
    }
}
