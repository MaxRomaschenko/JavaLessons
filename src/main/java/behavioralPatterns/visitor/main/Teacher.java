package behavioralPatterns.visitor.main;

public class Teacher implements Visitor{
    @Override
    public void visit(Lecture lecture) {
        System.out.println("Ведёт лекцию");
    }

    @Override
    public void visit(PracticalWork practicalWork) {
        System.out.println("Даёт и объясняет задачи");
    }

    @Override
    public void visit(Exam exam) {
        System.out.println("Раздаёт билеты");
    }

    @Override
    public void visit(Studies studies) {
        System.out.println("Следит как движется обучение");
    }
}
