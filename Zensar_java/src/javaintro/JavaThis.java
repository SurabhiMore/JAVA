package javaintro;

public class JavaThis {

	/*
	 * Within an instance method or constructor this is a referance to the current object
	 * Use this with Field and Methos( we can access any instance variable and method by using this keyword)
	 * Use this with constructor(we can call constroctor in other constructor by using this keyword)
	    is called explicit constructor invocation
	 */
	int x,y;
	float z;
	
	JavaThis(int x)
	{
		this.x=x;
			  // This avoid confusion when we use same filed(Variable) name
	} // constructor1
	
	JavaThis(int y,float z)
	{
		this(60); // call constructor1 using this
		this.y=y;
		this.z=z;   // This avoid confusion when we use same filed(Variable) name
	} // constructor2
	
	
	
	
	public static void main(String[] args) {
		JavaThis obj1=new JavaThis(25);
		JavaThis obj2=new JavaThis(10,2.5f);
		
		System.out.println("obj1.x = "+obj1.x+" obj1.y = "+obj1.y+" obj1.z = "+obj1.z);
		
		System.out.println("obj2.x = "+obj2.x+" obj2.y = "+obj2.y+" obj2.z = "+obj2.z);
		
		obj1.getStringFromgetString();

	}// main()
	
	void getString()
	{
		System.out.println("String from getString()");
	}
	
	void getStringFromgetString()
	{
		this.getString(); // call instance method using this
	}

}//end class
