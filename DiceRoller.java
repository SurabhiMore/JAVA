import java.util.Random;

// variable scope

public class DiceRoller {
    
    // Random random;   ~ global variable
    // int number = 0;
    
    DiceRoller(){   // contructor
        Random random = new Random();   // instance of random class
        int number = 0;
        roll(random, number);

        // here, instance and int variable are local to the constructor
        // to solve this    1. add as args to the method   2. declare them global (outside method)
    }

    void roll(Random random, int number){    // method
        number = random.nextInt(6)+1;
        System.out.println(number);
;    }
}
