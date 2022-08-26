public class Java_StringBuffer_StringBuilder {

	void stringBuffredClass()
	{
		/*
		 *StringBuffer class is used to create mutable string object
		 *This class is used when we have to make lot of modification in string
		 *Its Thread safe
		 *StrungBuffer defines 4 types of Constructor
		 */
		/* 1) StringBuffer() : it create an empty string buffer and reserve space for 16 characters */
		/* 2) StringBuffer(int size) : it create an empty string buffer and takes an integer argument to set capacity of the buffer */
		/* 3) StringBuffer(String str) : it create a stingbuffer object from specified string */
		/* 4) StringBuffer(charSequence []ch) : it create string buffer object from charsequence array */
		
// Create StringBuffer Object		
		StringBuffer sfObj=new StringBuffer("Hello Java");
		StringBuffer sbObj=new StringBuffer("Hello Rust");
		
// append()
		sfObj.append(" "+1991);
		sbObj.append(" performance is fast");
		System.out.println(sfObj+" \n "+sbObj);
		
// insert()
		sfObj.insert(1,865);
		sbObj.insert(1," grow");
		System.out.println(sfObj+" \n "+sbObj);
		
// capacity()
		int capacityBuffer1=sfObj.capacity();  
		int capacityBuffer2=sbObj.capacity();
		System.out.println("Capacity of sfObj = "+capacityBuffer1+" \n "+"Capacity of  sbObj = "+capacityBuffer2);
		
//ensureCapacity()
		StringBuffer seObj=new StringBuffer();
		System.out.println("Empty Constructor reserve Capacity :"+seObj.capacity()); // reserve 16
		int x=30;
		seObj.ensureCapacity(x);// greater than existing capacity
		System.out.println("seObj.ensureCapacity(x) : "+seObj.capacity()); // 34 by follwing the rule : (oldCapacity*2)+2
		
// reverse()
		System.out.println("reverse() : "+sbObj.reverse());
		
	}
	
	public static void main(String[] args) {
	
		Java_StringBuffer_StringBuilder obj=new Java_StringBuffer_StringBuilder();
		System.out.println("StringBuffer Demonstration : \n");
		obj.stringBuffredClass();
		System.out.println("\n StringBuilder Demonstration : \n");
		obj.stringBuilderClass();

	}// main()
	
	void stringBuilderClass()
	{
		/* StringBuilder not Thread Safe
		 * StringBuilder is mutable and non synchronized 
		 */
		
		// Create StringBuffer Object		
				StringBuilder sfObj=new StringBuilder("Java mostly used for Enterprise Application");
				StringBuilder sbObj=new StringBuilder("Rust mostly used for System Application");
				
		// append()
				sfObj.append(" "+1991);
				sbObj.append(" performance is fast");
				System.out.println(sfObj+" \n "+sbObj);
				
		// insert()
				sfObj.insert(1,865);
				sbObj.insert(1," grow");
				System.out.println(sfObj+" \n "+sbObj);
				
		// capacity()
				int capacityBuffer1=sfObj.capacity();  
				int capacityBuffer2=sbObj.capacity();
				System.out.println("Capacity of sfObj = "+capacityBuffer1+" \n "+"Capacity of  sbObj = "+capacityBuffer2);
				
		//ensureCapacity()
				StringBuilder seObj=new StringBuilder();
				System.out.println("Empty Constructor reserve Capacity :"+seObj.capacity()); // reserve 16
				int x=30;
				seObj.ensureCapacity(x);// greater than existing capacity
				System.out.println("seObj.ensureCapacity(x) : "+seObj.capacity()); // 34 by follwing the rule : (oldCapacity*2)+2
				
		// reverse()
				System.out.println("reverse() : "+sbObj.reverse());
		
	}

}// end class
