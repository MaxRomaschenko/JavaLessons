package creationalPatterns.abstractFactory.abstractFactory;

import creationalPatterns.abstractFactory.firstCourse.FirstCourse;
import creationalPatterns.abstractFactory.secondCourse.SecondCourse;

public interface FoodFactory {
    FirstCourse createFirstCourse();
    SecondCourse createSecondCourse();
}
