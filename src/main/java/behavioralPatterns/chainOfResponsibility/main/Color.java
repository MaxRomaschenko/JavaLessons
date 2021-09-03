package behavioralPatterns.chainOfResponsibility.main;

public abstract class Color {
    private Color nextColor;

    public Color(Color nextColor) {
        this.nextColor = nextColor;
    }

    public  void printColor(int x, int y){
        if(nextColor != null){
            nextColor.printColor(x , y);
        }
    }


}
