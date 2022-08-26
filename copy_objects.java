public class copy_objects {
    public static void main(String[] args){

        Automobile auto1 = new Automobile("Honda", "Amaze", 2021);
        Automobile auto2 = new Automobile("Ford", "Mustang", 2022);
        
        Automobile auto3 = new Automobile(auto2);   // direct copying

        // auto1 = auto2;   auto1's address gets assigned to auto2; auto 1 becomes auto 2 ~ same car (i.e. only 1 car exists now)

        auto2.copy(auto1);  // different objects(autos) with same attributes

        // address of objects -j auto1 auto2
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println();
        // attributes of auto1
        System.out.println(auto1.getMake());
        System.out.println(auto1.getModel());
        System.out.println(auto1.getYear());
        System.out.println();
        // attributes of auto2
        System.out.println(auto2.getMake());
        System.out.println(auto2.getModel());
        System.out.println(auto2.getYear());
        System.out.println();

        // auto 3
        System.out.println(auto3);
        System.out.println(auto3.getMake());
        System.out.println(auto3.getModel());
        System.out.println(auto3.getYear());
    }
}
