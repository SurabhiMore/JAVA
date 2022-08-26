// inheritance; sub class of Vehicle classS

public class Motor extends Vehicle {    // child class

    int wheels = 4;
    int doors = 4;

    // polymorphism 
    @Override
    public void po(){
        System.out.println("The motor begins moving.");
    }
}
