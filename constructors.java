public class constructors {
    public static void main(String[] args){

        object_Human human1 = new object_Human("Richa", 30, 62);
        object_Human human2 = new object_Human("Sheena", 20, 52.5);

        System.out.println(human1.name); 
        System.out.println(human2.name);
        
        human2.eat();
        human1.drink();
    }
}
