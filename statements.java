public class statements {
    public static void main(String[] args){

        // if statement = performs a block of code if it's condition evaluates to be true

        int age = 15;
        if(age>=75){
            System.out.println("Ok Boomer!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age>=13){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are a kid.");
        }

        // switch statement = allows a variable to be tested for equality against a list of values

        String day = "day";

        switch(day){
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("That is not a day.");
        }   
    }
}
