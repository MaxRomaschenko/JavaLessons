package behavioralPatterns.visitor.test;

public interface Developer {
    void create(ProjectClass project);
    void create(Database database);
    void create(Test test);
}
