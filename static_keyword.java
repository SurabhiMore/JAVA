public class static_keyword {
    public static void main(String[] args){

        Friend friend1 = new Friend("Cherry");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend("Ben");
        Friend friend4 = new Friend("Bella");

        System.out.println(Friend.numberOfFriends); // static variable o/p

        Friend.displayFrnds();  // static method o/p
    }
}
