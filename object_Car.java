public class object_Car {

    // attributes
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2022;
    String color = "blue";
    double price = 50000.00;

    // methods
    void drive(){
        System.out.println("You drive the car.");
    }
    void brake(){
        System.out.println("You step on the brakes.");
    }

    // toString() method
    public String toString(){
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
