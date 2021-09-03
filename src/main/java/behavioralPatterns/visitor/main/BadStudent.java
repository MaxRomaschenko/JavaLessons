package behavioralPatterns.visitor.main;

public class BadStudent implements Visitor{
    @Override
    public void visit(Lecture lecture) {
        System.out.println("Спит на лекции");
    }

    @Override
    public void visit(PracticalWork practicalWork) {
        System.out.println("Ничего не сдаёт");
    }

    @Override
    public void visit(Exam exam) {
        System.out.println("Пытается списать");
    }

    @Override
    public void visit(Studies studies) {
        System.out.println("Не следит за обучением");
    }
}
