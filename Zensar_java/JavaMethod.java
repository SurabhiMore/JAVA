public class JavaMethod {

	/* 
	 accessmodifier returntype methodName(Parameter list)
	{
		
	}
	*/
	
// Instance Method
		
	void addition(int z,int x)
	{ 
		System.out.println("Method Without Return & With Argument");
		System.out.println(z+x);
	}// end addition(int z,int x)
		
	int substraction()
	{
		System.out.println("Method With Return & Without Argument");
		return 100-20;
	} // substraction()
	
	int multiplication(int z,int x)
	{
		System.out.println("Access/Calling Instance Method inside another Instance Method");
		division(); // call directly
		// JavaMethod.division(); // instance method can not call using className
		JavaMethod obj1=new JavaMethod(); // instance method call using class object
		obj1.division();
		
		System.out.println("Access/Calling Static Method inside Instance Method");
		methodStatic(); // call directly
		JavaMethod.methodStatic(); // call using className
		obj1.methodStatic();  // call using class object
						
		System.out.println("Method With Return & With Argument");
		return z*x;
				
	} //multiplication(int z,int x)
	
	void division()
	{
		System.out.println("Method Without Return & Without Argument");
		System.out.println("25/2"+(25/2));
	} //division()
	

// Static Method	
	
	static void methodStatic()
	{
				System.out.println("Its Static Method");
				System.out.println("Access/Calling Instance Method inside Static Method");
				// division(); // can not call  directly
				// JavaMethod.division(); // can not call using className
				JavaMethod obj2=new JavaMethod();
				obj2.division(); // call using class object
	}
	
	public static void main(String[] args) {
		JavaMethod objJavaMethod =new JavaMethod();
		objJavaMethod.addition(25, 55); // calling method
		int resultSubstarction=objJavaMethod.substraction();
		int resultMultiplication =objJavaMethod.multiplication(2, resultSubstarction);
		objJavaMethod.division();
		
		System.out.println("Access/Calling Static Method inside another Static Method");
		methodStatic(); // call directly
		JavaMethod.methodStatic();// static method call using className
		objJavaMethod.methodStatic(); // static method call using class object
		
		int arrayVar[]=objJavaMethod.returnMultipleValues(resultMultiplication, resultSubstarction);
       System.out.println("Addidtion of "+resultMultiplication+" + "+resultSubstarction+" = "+arrayVar[0]);
       System.out.println("Substraction of "+resultMultiplication+" - "+resultSubstarction+" = "+arrayVar[1]);
       
       Demo demoObj=objJavaMethod.getDemo(resultSubstarction, resultMultiplication);
       System.out.println("Demo a ="+demoObj.a);
       System.out.println("Demo d ="+demoObj.d);
       System.out.println("Demo c ="+demoObj.c);
		
	}// end main()
	
	
	// returns arrays that hold multiple values
	
	int[] returnMultipleValues(int a, int b) {
		
		int[] arrInt=new int[2];
		arrInt[0]=a+b;
		arrInt[1]=a-b;
		return arrInt;
	}
	
	// Its method return type is object of class Demo
	Demo  getDemo(int x,int y)
	{
		return new Demo(x*y,(double)x/y,x+y);
	}
	

}//end JavaMethod


class Demo
{
	int a;double d;int c;
	
	Demo(int x,double y,int z)
	{
		a=x;d=y;c=z;
	}// end constructor
}// end Demo

