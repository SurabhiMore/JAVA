package package1;
import package2.*;

public class A {
    
    // protected String protectedMessage = "This is protected";
    public static void main(String[] args){

        // C c = new C();
        // System.out.println(c.defaultMessage);    ~ can't compile
        // System.out.println(c.publicMessage);

        B b = new B();
        // System.out.println(b.privateMessage);    ~ not accessible
    }
}