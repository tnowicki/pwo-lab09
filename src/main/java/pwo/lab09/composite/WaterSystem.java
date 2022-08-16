package pwo.lab09.composite;

import java.util.List;
import java.util.ArrayList;

public class WaterSystem implements WaterSystemInterface {
    
    private final List<WaterSystemInterface> elements = new ArrayList<>();
        
    public final void addComponent(WaterSystem element){
        elements.add(element);
    }
    
    public void fill(){
        elements.forEach(element -> element.fill());
        System.out.println("System wodny napełniony");
    }
    
    public void afterFill(){
        elements.forEach(element -> element.afterFill());
    }
   
    public void drain() {
        elements.forEach(element -> element.drain());
        System.out.println("System wodny opróżniony");
    }
    
    public void afterDrain() { 
        elements.forEach(element -> element.afterDrain());
    }
}