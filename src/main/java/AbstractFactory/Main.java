package AbstractFactory;

import AbstractFactory.abstractFactory.FoodFactory;
import AbstractFactory.factory.MexicanFoodFactory;
import AbstractFactory.firstCourse.FirstCourse;
import AbstractFactory.secondCourse.SecondCourse;

public class Main {
    public static void main(String[] args) {
        FoodFactory mexicanFoodFactory = new MexicanFoodFactory();
        FirstCourse firstCourse = mexicanFoodFactory.createFirstCourse();
        SecondCourse secondCourse = mexicanFoodFactory.createSecondCourse();

        firstCourse.ready();
        secondCourse.ready();
    }
}
