package behavioralPatterns.chainOfResponsibility.test;

public class ZeroNumber extends Number{

    public ZeroNumber(Number number) {
        super(number);
    }

    @Override
    public void process(int n) {
        if(n == 0){
            System.out.println("This  is zero number: " + n);
        }else {
            super.process(n);
        }
    }
}
