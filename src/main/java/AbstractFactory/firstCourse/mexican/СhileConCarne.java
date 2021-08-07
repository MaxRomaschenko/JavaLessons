package AbstractFactory.firstCourse.mexican;

import AbstractFactory.firstCourse.FirstCourse;

public class СhileConCarne implements FirstCourse {
    @Override
    public void ready() {
        System.out.println("СhileConCarne is ready");
    }
}
