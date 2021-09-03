package creationalPatterns.abstractFactory.factory;

import creationalPatterns.abstractFactory.firstCourse.FirstCourse;
import creationalPatterns.abstractFactory.abstractFactory.FoodFactory;
import creationalPatterns.abstractFactory.firstCourse.mexican.СhileConCarne;
import creationalPatterns.abstractFactory.secondCourse.SecondCourse;
import creationalPatterns.abstractFactory.secondCourse.mexican.Taco;

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
