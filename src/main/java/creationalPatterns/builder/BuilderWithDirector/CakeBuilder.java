package creationalPatterns.builder.BuilderWithDirector;

public abstract class CakeBuilder {
    protected Cake cake;

    public Cake getCake(){
        return cake;
    }

    public void createNewCake(){
        cake = new Cake();
    }

    public abstract void buildSize();
    public abstract void buildFruit();
    public abstract void buildName();

}
