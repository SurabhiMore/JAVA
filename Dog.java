// method overriding; 
// dynamic polymorphism

public class Dog extends Animal{
    
    @Override
    public void speak(){   // overriding method
        System.out.println("The dog goes *bark*");
    }
}
