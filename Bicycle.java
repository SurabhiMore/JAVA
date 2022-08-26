// inheritance; sub class of vehicle class

public class Bicycle extends Vehicle {  // child class
    
    int wheels = 2;
    int pedals = 2;

    // polymorphism
    @Override
    public void po(){
        System.out.println("The bicycle begins moving.");
    }
}