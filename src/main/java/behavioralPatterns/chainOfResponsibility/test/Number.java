package behavioralPatterns.chainOfResponsibility.test;

public abstract class Number {
    private Number number;

    public Number(Number number){
        this.number = number;
    }

    public void process(int n){
        if(number != null){
            number.process(n);
        }
    }
}
