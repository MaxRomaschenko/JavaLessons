package behavioralPatterns.visitor.main;

import behavioralPatterns.visitor.main.Exam;
import behavioralPatterns.visitor.main.Lecture;
import behavioralPatterns.visitor.main.PracticalWork;
import behavioralPatterns.visitor.main.Studies;

public interface Visitor {
    void visit(Lecture lecture);
    void visit(PracticalWork practicalWork);
    void visit(Exam exam);
    void visit(Studies studies);
}
