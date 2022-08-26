package javaintro;

/*
 * Variable Types :
 * 1)Instance Variable / Non-Static Variable
 * 2)Class Variable / Static Variable
 * 3)Local Variable
 */
public class JavaVariable {
	
	int age; // instance variable
	static int marriedAge =21; // static variable

	public static void main(String[] args) {
		
		int x=25; // local variable
		JavaVariable objJavaVariable=new JavaVariable();
	   
		objJavaVariable.age=22;
		
		System.out.println(objJavaVariable.age);
		
		JavaVariable obj1JavaVariable=new JavaVariable();
		System.out.println(obj1JavaVariable.age);
		
		
		System.out.println(marriedAge);
		System.out.println(JavaVariable.marriedAge);
		System.out.println(objJavaVariable.marriedAge);
	
	} // end main()

}// end JavaVariable
