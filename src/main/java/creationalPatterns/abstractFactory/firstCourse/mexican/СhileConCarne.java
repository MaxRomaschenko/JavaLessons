package creationalPatterns.abstractFactory.firstCourse.mexican;

import creationalPatterns.abstractFactory.firstCourse.FirstCourse;

public class СhileConCarne implements FirstCourse {
    @Override
    public void ready() {
        System.out.println("СhileConCarne is ready");
    }
}
