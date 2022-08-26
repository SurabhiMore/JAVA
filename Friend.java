// static keyword modifier

public class Friend {
    
    String name;
    static int numberOfFriends; // static variaable

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFrnds(){
        System.out.println("You have " + numberOfFriends + " friends.");
    }
}
