package creationalPatterns.prototype.InterfaceCloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza firstPizza = new Pizza("Mario","yes","yes",false);
        System.out.println(firstPizza);
        Pizza firstClone = (Pizza) firstPizza.clone();
        System.out.println(firstClone);


    }
}