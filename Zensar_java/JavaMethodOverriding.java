import java.util.Scanner;

/*
 * Method Overriding performs only if to classes have IS-A Relationship
 * In Method Overriding both class must have same method name and equal number of parameters.
 * Method Overriding is also referred to as runtime polymorphism beacuse calling method is decide by JVM during runtime 
 */

public class JavaMethodOverriding {

	public static void main(String[] args) {
		AdditionOperation objAdditionOperation=new AdditionOperation();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First Floating-Point Number : ");
		float x=obj.nextFloat();
		System.out.println("Enter Second Floating-Point Number : ");
		float y=obj.nextFloat();
		objAdditionOperation.addition(x, y);
		obj.close();

	}//main()

}//end class

class ArithmeticOperation{
	
	void addition(float x,float y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	void substarction(float x,float y) {
		System.out.println(x+"-"+y+"="+(x-y));
	}
	
	void division(float x,float y) {
		System.out.println(x+"/"+y+"="+(x/y));
	}
	
	void multiplication(float x,float y) {
		System.out.println(x+"x"+y+"="+(x*y));
	}
	
}//ArithmeticOperation


class AdditionOperation extends ArithmeticOperation{
	
	void addition(float x,float y) {
	
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
}//AdditionOperation
