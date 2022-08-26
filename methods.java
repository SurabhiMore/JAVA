public class methods {
    public static void main(String[] args){
        String name = "Bro";
        int age = 20;
        hello2(name, age);
        hello1();

        int x = 3;
        int y = 4;
        int z = sum(x,y);   // z = local variable
        System.out.println(z);  // type 1 
        System.out.println(sum(x,y));   // type 2
    }

    static void hello1(){
        System.out.println("Hello");
    }

    static void hello2(String name, int age){
        System.out.println("Hey there " + name);
        System.out.println("You are " + age);
    }

    static int sum(int x, int y){
        return x+y;
        //int z = x+y;
        //return z;
    }
}
