package behavioralPatterns.iterator.main;

public class Main {
    public static void main(String[] args) {
        String[] tasks = {"Покормить кота", "Разобраться с паттернами", "Поесть"};
        TodoList todoList = new TodoList(tasks);

        Iterator iterator = todoList.getIteratorFromStart();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        Iterator iterator1 = todoList.getIteratorFromEnd();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().toString());
        }
    }
}
