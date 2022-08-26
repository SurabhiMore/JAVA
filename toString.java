public class toString {
    public static void main(String[] args){

        object_Car myCar = new object_Car();

        /*
        System.out.println(myCar.model);
        System.out.println(myCar.make);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        */

        // gives address of myCar object in the memory before toString() is overloaded

        System.out.println(myCar);  // implicitly

        System.out.println(myCar.toString());   // explicitly
    }
}
