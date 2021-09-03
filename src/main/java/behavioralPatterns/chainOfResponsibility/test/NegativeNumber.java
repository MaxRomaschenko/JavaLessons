package behavioralPatterns.chainOfResponsibility.test;

public class NegativeNumber extends Number{
    public NegativeNumber(Number number) {
        super(number);
    }

    @Override
    public void process(int n) {
        if(n < 0 ){
            System.out.println("This is negative number: " + n);
        }else {
            super.process(n);
        }
    }
}
