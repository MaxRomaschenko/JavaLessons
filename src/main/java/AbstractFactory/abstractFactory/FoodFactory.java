package AbstractFactory.abstractFactory;

import AbstractFactory.firstCourse.FirstCourse;
import AbstractFactory.secondCourse.SecondCourse;

public interface FoodFactory {
    FirstCourse createFirstCourse();
    SecondCourse createSecondCourse();
}
