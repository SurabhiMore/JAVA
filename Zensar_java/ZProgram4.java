import java.util.Scanner;
public class ZProgram4 {
    public static void main(String args[]){

        System.out.println("Convert temperature: \n1. Celsius to Farenheit \n2. Farenheit to Celsius \nChoose an option.");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if(option==1){
            System.out.println("Enter temperature (C->F): ");
            float cel = input.nextFloat();
            float far = ( (cel*9)/5)+32;  
            System.out.println("Farenheit temperature = "+far);
        }
        else if(option==2){
            System.out.println("Enter temperature (F->C): ");
            float fahr = input.nextFloat();
            float cels = ((fahr-32)*5)/9;
            System.out.println("Celsius temperature = "+cels);
        }
        else{
            System.out.println("Choose the correct option.");
        }
    }
}
