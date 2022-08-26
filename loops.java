import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        // while loop
        Scanner input = new Scanner(System.in);
        String name = "";
        
        // first checks & if true then only executes
        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }

        // variation of while loop - always executes block of code once tho'
        do{
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }while(name.isBlank());

        System.out.println("Hello "  + name);

        // for loop
        for(int i=10; i>=0; i-=2){
            System.out.println(i);
        }
        System.out.println("Happy new year!");

        // nested loops
        int rows;   // outer loop
        int columns;    // inner loop
        String symbol = "";

        System.out.println("Enter no. of rows: ");
        rows = input.nextInt();
        System.out.println("Enter no. of columns: ");
        columns = input.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = input.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
