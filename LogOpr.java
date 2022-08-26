import java.util.Scanner;
public class LogOpr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = input.next(); // 
        
        // || => OR 
        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game.");
        }
        else{
            System.out.println("You quit the game");        
        }
    }
}
