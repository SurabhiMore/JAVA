public class JavaStaticVariable {
	
	int count=0; // instance variable , get memory each time when instance is created
	static int counts=0; //static variable , get memory once
	
	/* constructor without parameter */
	JavaStaticVariable()
	{
		count++; // increment counter (instance variable)
		System.out.println("Count = "+count);
	} // end constructor1
		
	/* constructor with parameter */
	JavaStaticVariable(String s)
	{
		counts++; // increment counter (static variable)
		System.out.println("Counts = "+counts);
	} // end constructor2
	
	public static void main(String[] args) {
		
		/* prints 1 always ~ initializes everytime object created i.e. consructor gets called */
		JavaStaticVariable obj1=new JavaStaticVariable();
		JavaStaticVariable obj2=new JavaStaticVariable();
		JavaStaticVariable obj3=new JavaStaticVariable();
		JavaStaticVariable obj4=new JavaStaticVariable();
		
		JavaStaticVariable obj5=new JavaStaticVariable("Java");
		JavaStaticVariable obj6=new JavaStaticVariable("Python");
		JavaStaticVariable obj7=new JavaStaticVariable("Ruby");
		JavaStaticVariable obj8=new JavaStaticVariable("Rust");
		

	} // end main()

}//end JavaStaticVariable
