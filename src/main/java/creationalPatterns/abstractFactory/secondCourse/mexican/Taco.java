package creationalPatterns.abstractFactory.secondCourse.mexican;

import creationalPatterns.abstractFactory.secondCourse.SecondCourse;

public class Taco implements SecondCourse {
    @Override
    public void ready() {
        System.out.println("Taco is ready");
    }
}
