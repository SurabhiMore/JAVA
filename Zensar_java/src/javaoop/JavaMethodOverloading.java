package javaoop;

/*
 * Method overloading is concept that allows to declare multiple methods with same name but diffrent parameters in same class.
 * Method overloading can be done by changing number of arguments 
 * Method overloading can be done by changing the datatype of arguments
 * If two or more methods have same name and same parameter list but differs in return type can not be overloaded
 */
public class JavaMethodOverloading {

	void addition() {
		System.out.println("10+20="+(10+20));
	}
	
	int addition(int x, int y) {
		return (x+y);
	}
	
	void addition(float x,float y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	void addition(int x,int y,int z) {
		System.out.println(x+"+"+y+"+"+z+"="+(x+y+z));
	}
	
	public static void main(String[] args) {
		
		JavaMethodOverloading obj =new JavaMethodOverloading();
		obj.addition();
		obj.addition(5.6f, 3.2f);
		int x=obj.addition(5, 2);
		System.out.println("Result obj.addition(5, 2) : "+x);
		obj.addition(5, 6, 7);

	}// main()

}//JavaMethodOverloading
