import java.util.ArrayList;
public class foreach {
    public static void main(String[] args){
        
        String[] animals = {"cat", "dog", "deer", "wolf"};
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("lion");
        animal.add("leopard");
        animal.add("tiger");
        animal.add("cheetah");

        // enhanced foor loop
        for(String i : animals){
            System.out.println(i);
        }

        System.out.println();

        for(String i : animal){
            System.out.println(i);
        }
    }
}
