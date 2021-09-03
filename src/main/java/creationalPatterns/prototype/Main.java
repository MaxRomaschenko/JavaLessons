package creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Mario","yes","yes",false);
        System.out.println(firstPizza);
        Pizza firstClone = (Pizza) firstPizza.clon();
        System.out.println(firstClone);
        firstClone.setName("Hawaiian");
        firstClone.setSausages(null);
        firstClone.setPineapple(true);
        Pizza secondClone = (Pizza) firstClone.clon();
        System.out.println(secondClone);

    }
}
