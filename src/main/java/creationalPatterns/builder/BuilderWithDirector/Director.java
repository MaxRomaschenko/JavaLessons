package creationalPatterns.builder.BuilderWithDirector;

public class Director {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cb){
        cakeBuilder = cb;
    }

    public Cake getCake(){
        return cakeBuilder.getCake();
    }

    public void constructCake(){
        cakeBuilder.createNewCake();
        cakeBuilder.buildSize();
        cakeBuilder.buildName();
        cakeBuilder.buildFruit();
    }
}
