package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;


public class Composite implements CarMark{
    private List<CarMark> components = new  ArrayList<>();

    public void addComponent(CarMark component){
        components.add(component);
    }

    public void removeComponent(CarMark component){
        components.remove(component);
    }
    @Override
    public void getMark() {
        for(CarMark component: components){
            component.getMark();
        }
    }
}
