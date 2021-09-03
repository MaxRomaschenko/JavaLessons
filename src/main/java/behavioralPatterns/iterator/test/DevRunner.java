package behavioralPatterns.iterator.test;

public class DevRunner {
    public static void main(String[] args) {
        String[] skills = {"java" , "Spring", "Maven","PostgreSql"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Max", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Dev: " + javaDeveloper.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }


    }
}
