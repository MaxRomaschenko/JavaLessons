package AbstractFactory.secondCourse.french;

import AbstractFactory.secondCourse.SecondCourse;

public class Potofe implements SecondCourse {
    @Override
    public void ready() {
        System.out.println("Potofe is ready");
    }
}
