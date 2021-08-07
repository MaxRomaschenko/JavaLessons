package AbstractFactory.factory;

import AbstractFactory.firstCourse.FirstCourse;
import AbstractFactory.abstractFactory.FoodFactory;
import AbstractFactory.firstCourse.mexican.СhileConCarne;
import AbstractFactory.secondCourse.SecondCourse;
import AbstractFactory.secondCourse.mexican.Taco;

public class MexicanFoodFactory implements FoodFactory {
    @Override
    public FirstCourse createFirstCourse() {
        return new СhileConCarne();
    }

    @Override
    public SecondCourse createSecondCourse() {
        return new Taco();
    }
}
