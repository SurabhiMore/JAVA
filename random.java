import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6);  // prints random nos. from 0-5
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
