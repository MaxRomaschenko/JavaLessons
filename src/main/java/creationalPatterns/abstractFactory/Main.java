package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.abstractFactory.FoodFactory;
import creationalPatterns.abstractFactory.factory.MexicanFoodFactory;
import creationalPatterns.abstractFactory.firstCourse.FirstCourse;
import creationalPatterns.abstractFactory.secondCourse.SecondCourse;

public class Main {
    public static void main(String[] args) {
        FoodFactory mexicanFoodFactory = new MexicanFoodFactory();
        FirstCourse firstCourse = mexicanFoodFactory.createFirstCourse();
        SecondCourse secondCourse = mexicanFoodFactory.createSecondCourse();

        firstCourse.ready();
        secondCourse.ready();
        summery();
    }
    public static void summery(){
        System.out.println("HELLO WORLD");
    }
}
