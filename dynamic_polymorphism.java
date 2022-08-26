import java.util.Scanner;

public class dynamic_polymorphism {
    
    public static void main(String[] args){

        System.out.println("What animal do you want?");
        System.out.println("[1=dog] AND [2=cat]");
        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        Animal ani;

        if(choice==1){
            ani = new Dog();
            ani.speak();
        }
        else if(choice==2){
            ani = new Cat();
            ani.speak();
        }
        else{
            ani = new Animal();
            System.out.println("That choice was invalid");
            ani.speak();
        }
    }
}
