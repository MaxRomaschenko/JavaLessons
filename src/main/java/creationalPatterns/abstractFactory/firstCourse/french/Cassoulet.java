package creationalPatterns.abstractFactory.firstCourse.french;

import creationalPatterns.abstractFactory.firstCourse.FirstCourse;

public class Cassoulet implements FirstCourse {

    @Override
    public void ready() {
        System.out.println("Cassoulet soup is ready");
    }
}
