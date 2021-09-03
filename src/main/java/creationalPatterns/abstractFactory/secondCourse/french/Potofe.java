package creationalPatterns.abstractFactory.secondCourse.french;

import creationalPatterns.abstractFactory.secondCourse.SecondCourse;

public class Potofe implements SecondCourse {
    @Override
    public void ready() {
        System.out.println("Potofe is ready");
    }
}
