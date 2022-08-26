import java.util.Scanner;
public class ZProgram5 {
    public static void main(String args[]){

        System.out.println("Unit conversion: \n1. Kilometer to Meter \n2. Meter to Feet \n3. Feet to Inch \nChoose an option.");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        switch(option){
            case 1: 
            System.out.println("Enter the Kilometers: ");
            float km = input.nextFloat();
            float m = km * 1000;
            System.out.printf(km+" kilometers = "+m+" meters");
            break;
            case 2: 
            System.out.println("Enter the Meter: ");
            double mtr = input.nextDouble();
            double ft = mtr * 3.281;
            System.out.printf(mtr+" meters = "+ft+" feet");
            break;
            case 3: 
            System.out.println("Enter the Feet: ");
            float feet = input.nextFloat();
            float inch = feet * 12;
            System.out.printf(feet+" feet = "+inch+" inch");
            break;
            default:
            System.out.println("Choose the right option.");
        }
    }
}
