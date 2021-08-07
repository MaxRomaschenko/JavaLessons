package AbstractFactory.firstCourse.french;

import AbstractFactory.firstCourse.FirstCourse;

public class Cassoulet implements FirstCourse {

    @Override
    public void ready() {
        System.out.println("Cassoulet soup is ready");
    }
}
