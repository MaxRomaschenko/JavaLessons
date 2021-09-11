package behavioralPatterns.iterator.main;

public class TodoList implements Collection {
    private String[] tasks ;

    public TodoList(String[] tasks) {
        this.tasks = tasks;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIteratorFromStart() {
        return new TaskIteratorFromStart();
    }

    @Override
    public Iterator getIteratorFromEnd() {
        return new TaskIteratorFromEnd();
    }



    private class TaskIteratorFromStart implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }



    private class TaskIteratorFromEnd implements Iterator{
        int index = tasks.length;

        @Override
        public boolean hasNext() {
            if(index != 0){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[--index];
        }
    }
}
