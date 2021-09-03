package behavioralPatterns.visitor.main;

public class Studies implements StudingPart{
    StudingPart[] studingParts;

    public Studies() {
        this.studingParts = new StudingPart[]{
                new Lecture(),
                new PracticalWork(),
                new Exam()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for (StudingPart sp: studingParts){
            sp.accept(visitor);
        }
        visitor.visit(this);
    }
}
