package javaintro;

public class JavaExpression_Statements_Block {
	
	void javaExpression()
	{
		/*
		 * An Expression is a construct made upof variables,operators and method invocation ,
		 * which are constructed according to java syntax.
		 * 
		 */
		
		int i=100;
		int[] arr= {100,20,45};
		arr[0]=456;
		System.out.println("Element 1 value at index 0 : "+arr[0]);
		
		int result=1+2;
		int resutl2=1-2;
		if(result==resutl2)
		{
			System.out.println("result==resutl2");
		}
	}//javaExpression()
	
	
	void javaStatements()
	{
		/*
		 * Statements are roughly equivalent to sentence in natural language.
		 * Statement forms a complete unit of execution
		 */
      
		int val=58; //assignment statement
		
		val++; // increment statement
		
		System.out.println("invocation of method - println()"); // method invocation statement
		
		
		JavaExpression_Statements_Block obj=new JavaExpression_Statements_Block(); // object creation statement
			
		
	} // javaStatements()
	
	
	void javaBlock()
	{
		/*
		 * Block is group of zero or more statements between balanced braces 
		 */
		boolean someCondition=false;
		if(someCondition) { // begin block 1
			System.out.println("Condition is true");
		} // end block 1
		else { // begin block 2
			System.out.println("Condition is false");
		}//end block 2
				
	}
	
	

	public static void main(String[] args) {
		JavaExpression_Statements_Block obj=new JavaExpression_Statements_Block();
		obj.javaExpression();
		obj.javaStatements();
		obj.javaBlock();

	} // end main()

}// end class
