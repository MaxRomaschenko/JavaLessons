package creationalPatterns.abstractFactory.factory;

import creationalPatterns.abstractFactory.firstCourse.french.Cassoulet;
import creationalPatterns.abstractFactory.firstCourse.FirstCourse;
import creationalPatterns.abstractFactory.abstractFactory.FoodFactory;
import creationalPatterns.abstractFactory.secondCourse.french.Potofe;
import creationalPatterns.abstractFactory.secondCourse.SecondCourse;

public class FrenchFoodFactory implements FoodFactory {
    @Override
    public FirstCourse createFirstCourse() {
        return new Cassoulet();
    }

    @Override
    public SecondCourse createSecondCourse() {
        return new Potofe();
    }
}
