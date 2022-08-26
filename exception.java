import java.util.InputMismatchException;
import java.util.Scanner;

// divide by 0 exception
public class exception {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter a whole number to divide: ");
            int x = input.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = input.nextInt();

            int z = x/y;

            System.out.println("Result: " + z);
        }
        
        catch(ArithmeticException e){   // for i/n 0
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e){    // for i/n as string
            System.out.println("PLEASE ENTER A NUMBER ONLY");
        }
        catch(Exception e){ // for default
            System.out.println("Something went wrong.");
        }
        
        finally{    // used to close any scanners or files that might be open
            System.out.println("This will always print.");

            input.close();  // isn't recognised if it's inside try block
        }
    }
}
