public class objects {
    public static void main(String[] args){
 
        object_Car myCar1 = new object_Car();   // object 1
        object_Car myCar2 = new object_Car();   // object 2

        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println();
        System.out.println(myCar2.year);
        System.out.println(myCar2.price);
        
        System.out.println();

        myCar1.drive();
        myCar1.brake();
        System.out.println();
        myCar2.drive();
        myCar2.brake();
    }
}
