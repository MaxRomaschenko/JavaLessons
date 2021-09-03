package behavioralPatterns.command.test;

public class DBRunner {
    public static void main(String[] args) {
        Database database =new Database();

        Developer developer =new Developer(
                new InsertCommand(database),
                new DeleteCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database));

        developer.deleteRecord();
        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
    }
}
