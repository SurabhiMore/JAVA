package javaintro;

public class JavaStaticVariable {
	
	int count=0; // instance variable , get memory each time when instance is created
	static int counts=0; //static variable , get memory once
	
	JavaStaticVariable()
	{
		count++; // increment counter
		System.out.println("Count = "+count);
	} // end constructor1
		
	JavaStaticVariable(String s)
	{
		counts++; // increment counter
		System.out.println("Counts = "+counts);
	} // end constructor2
	
	public static void main(String[] args) {
		
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
