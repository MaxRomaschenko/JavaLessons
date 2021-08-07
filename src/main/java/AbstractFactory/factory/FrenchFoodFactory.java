package AbstractFactory.factory;

import AbstractFactory.firstCourse.french.Cassoulet;
import AbstractFactory.firstCourse.FirstCourse;
import AbstractFactory.abstractFactory.FoodFactory;
import AbstractFactory.secondCourse.french.Potofe;
import AbstractFactory.secondCourse.SecondCourse;

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
