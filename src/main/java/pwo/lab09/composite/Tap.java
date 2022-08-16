package pwo.lab09.composite;

public class Tap extends WaterSystem{
    
    public void fill() {
        System.out.println("Kran odkręcony");
    }
    
    public void afterFill() {
        System.out.println("Kran zakręcony");
    }
    
    public void drain() { /*Nothing to do*/ }
    
    public void afterDrain() { /*Nothing to do*/ }
}
