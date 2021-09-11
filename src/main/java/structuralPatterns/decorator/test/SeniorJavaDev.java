package structuralPatterns.decorator.test;

public class SeniorJavaDev extends Decorator {
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "make code review";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + makeCodeReview();
    }
}
