import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        // datatypes
        int x = 1124567891;
        System.out.println(x);
        
        long y = 1234567901234567890L;
        System.out.print("The number is "+ y);
        
        byte z = 127;
        System.out.println(z);
        
        float f = 3.14f;
        System.out.println(f);
        
        double d = 3.14;
        System.out.println(d);
        
        boolean b = true;
        System.out.println(b);
        
        char sym = '@';
        System.out.println(sym);
        
        String name = "Guddu";
        System.out.println("Hello "+ name);

        // taking user i/n
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = input.nextLine();
        System.out.println("Hello " + Name + "!");
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.println("What is your favorite food?");
        // to overcpme error
        input.nextLine();
        String food = input.nextLine();
        System.out.println("You like " + food + ".");

        // expressions in java
        int friends = 10;
        friends--;
        System.out.println(friends);
    }
}
