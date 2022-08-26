// whats the issue with this and inheritance?????
public class abstraction {
    public static void main(String[] args){

        car car = new car();
        car.drive();
    }
}

class car extends vehicle{

    @Override
    void drive() {
        System.out.println("The driver is driving the car.");   
    }    
}

abstract class vehicle{

    abstract void drive(); // abstract mehods do not specify
}
