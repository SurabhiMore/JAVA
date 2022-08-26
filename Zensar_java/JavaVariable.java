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
	   
		objJavaVariable.age=22;	// instance variable using object
		System.out.println(objJavaVariable.age);	// 22
		
		JavaVariable obj1JavaVariable=new JavaVariable();
		System.out.println(obj1JavaVariable.age);	// 0
		
		// methods of printing static variable ~ 21
		System.out.println(marriedAge);	
		System.out.println(JavaVariable.marriedAge);

		/* static variable should be accessed using static way */
		System.out.println(objJavaVariable.marriedAge);
	
	} // end main()

}// end JavaVariable
