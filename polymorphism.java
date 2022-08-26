public class polymorphism {
    
    public static void main(String[] args){

        Motor moto = new Motor();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {moto, bicycle, boat};   // Vehicle is the array datatype

        // iterates thro' all the elements of the array
        for(Vehicle x: racers){
            x.po();
        }
    }
}
