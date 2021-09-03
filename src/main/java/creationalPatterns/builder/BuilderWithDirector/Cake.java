package creationalPatterns.builder.BuilderWithDirector;

public class Cake {
    private int size;
    private String name;
    private Fruit fruit;

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }


}
