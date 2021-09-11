package debuger;

import java.util.ArrayList;
import java.util.List;

public class Third {
    Second second = new Second();
    List<Integer> integers = new ArrayList<>();
    public void func3(){
        for(int i = 0; i < 10;i++){
            integers.add(i);
        }
        second.func2();
    }
}
