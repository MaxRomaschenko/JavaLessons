package creationalPatterns.builder.BuilderWithDirector;

public class CherryCakeBuilder extends CakeBuilder{

    @Override
    public void buildSize() {
        cake.setSize(200);
    }

    @Override
    public void buildFruit() {
        cake.setFruit(Fruit.CHERRY);
    }

    @Override
    public void buildName() {
        cake.setName("Cherry cake");
    }
}
