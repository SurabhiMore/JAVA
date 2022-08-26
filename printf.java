public class printf {
    public static void main(String[] args){
        System.out.printf("%d This is a format string.\n",123);
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 12;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        // [width]
        System.out.printf("Hello %10s\n",myString); // right justified
        System.out.printf("Hello %-10s\n",myString);    // left justified

        // [precision]
        System.out.printf("You have %.2f money.\n",myDouble);   // limiting amount of digits after decimal

        // [flags]
        System.out.printf("You have %020f money.\n",myDouble);  // having bunch of 0s before 1000
        System.out.printf("You have %,f money.\n",myDouble);    // separating by comma
    }
}
