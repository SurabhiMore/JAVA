package javaintro;

/*
 * 1) Constructor name is same as class name
 * 2) Constrctor not have return type
 * 3) Constructor call when you create object
 * 4) Two types of Constructor : Parameterized & non-Parameterized /Default 
 * 5) Purpose of creating constructor is to initialize states of an object
 */

public class JavaConstructor {
	
	/*
	 className(parameter-list)
	{
	Code-Statements;
	}
	*/
	int a,b;
	
	public JavaConstructor() {
		int a=20;int b=30;
		System.out.println("non-Parameterized Constructor Value a and b :"+a+" & "+b);
	} // non-Parameterized Constructor
	
	public JavaConstructor(int a,int b)
	{
		a=a;
		b=b;
		System.out.println("Parameterized Constructor Value a and b :"+a+" & "+b);
	}// Parameterized Constructor

	public static void main(String[] args) {
		
		JavaConstructor obj=new JavaConstructor();
		System.out.println("\n");
		JavaConstructor obj1=new JavaConstructor(50,25);

	}//main()

}//end class
