package behavioralPatterns.observer.test;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("First Java Position");
        javaDeveloperJobSite.addVacancy("Second Java Position");

        Observer sub = new Subscriber("Max");
        Observer sub2 = new Subscriber("Peter");

        javaDeveloperJobSite.addObserver(sub);
        javaDeveloperJobSite.addObserver(sub2);

        javaDeveloperJobSite.addVacancy("Third Java Position");
        javaDeveloperJobSite.addVacancy("First Java Position");
    }
}
