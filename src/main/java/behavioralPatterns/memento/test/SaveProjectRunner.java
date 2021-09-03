package behavioralPatterns.memento.test;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitRepo gitRepo = new GitRepo();

        System.out.println("create project. Version 1");
        project.setVersionAndDate("Version 1");
        System.out.println(project);

        System.out.println("Saving cur version");
        gitRepo.setSave(project.save());

        System.out.println("Updating project. Version 2");
        System.out.println("CODE");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 2");

        System.out.println(project);

        System.out.println("Something wrong");

        System.out.println("rolling back v1");
        project.load(gitRepo.getSave());

        System.out.println("project after rollback");
        System.out.println(project);
    }

}
