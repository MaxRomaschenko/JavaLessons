package behavioralPatterns.visitor.main;

public class GoodStudent implements Visitor{
    @Override
    public void visit(Lecture lecture) {
        System.out.println("Внимательно слушает лекцию");
    }

    @Override
    public void visit(PracticalWork practicalWork) {
        System.out.println("Усердно работает над задачей");
    }

    @Override
    public void visit(Exam exam) {
        System.out.println("Вспоминает весь пройденный материал и сдаёт на отлично");
    }

    @Override
    public void visit(Studies studies) {
        System.out.println("Cледит чтоб всё было выполенно");
    }
}
