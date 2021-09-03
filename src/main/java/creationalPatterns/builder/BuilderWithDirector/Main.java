package creationalPatterns.builder.BuilderWithDirector;

public class Main {
    public static void main(String[] args) {
       Director director = new Director();
       CakeBuilder appleCake = new AppleCakeBuilder();
       director.setCakeBuilder(appleCake);
       director.constructCake();


       Cake cake = director.getCake();
       System.out.println(cake);

       CakeBuilder cherryCake = new CherryCakeBuilder();
       director.setCakeBuilder(cherryCake);
       director.constructCake();
       Cake cake1 = director.getCake();
    }
}
