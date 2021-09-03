package creationalPatterns.builder.BuilderWithDirector;

public class AppleCakeBuilder extends CakeBuilder{
    @Override
    public void buildSize() {
        cake.setSize(150);
    }

    @Override
    public void buildFruit() {
        cake.setFruit(Fruit.APPLE);
    }

    @Override
    public void buildName() {
        cake.setName("Apple cake ");
    }
}
