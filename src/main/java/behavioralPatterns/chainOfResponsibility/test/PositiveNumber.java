package behavioralPatterns.chainOfResponsibility.test;

public class PositiveNumber extends Number{
    public PositiveNumber(Number number) {
        super(number);
    }

    @Override
    public void process(int n) {
        if(n > 0){
            System.out.println("This is positive number: " + n);
        }else{
            super.process(n);
        }
    }
}
