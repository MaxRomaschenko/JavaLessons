package AbstractFactory.secondCourse.mexican;

import AbstractFactory.secondCourse.SecondCourse;

public class Taco implements SecondCourse {
    @Override
    public void ready() {
        System.out.println("Taco is ready");
    }
}
