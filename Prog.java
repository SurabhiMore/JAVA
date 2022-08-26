import java.util.Scanner;
public class Prog {
    public static void main(String[] args){
        
        double x = 3.14;
        double y = 5.6;
        int a = -20;
        double b = 2.86;

        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.abs(a));
        System.out.println(Math.sqrt(y));   // sqrt of 5.6
        System.out.println(Math.round(b));  // 2.86 => 3
        System.out.println(Math.ceil(y));   // 5.6 => 6.0
        System.out.println(Math.floor(x));  // 3.14 => 3.0

        // finding hypotenuse of a triangle
        double u;
        double v;
        double w;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side u:");
        u = input.nextDouble();
        System.out.println("Enter side v:");
        v = input.nextDouble();
        w = Math.sqrt((u*u)+(v*v));
        System.out.println("The hypotenuse of the triangle is " + w);

        input.close();
    }
}
