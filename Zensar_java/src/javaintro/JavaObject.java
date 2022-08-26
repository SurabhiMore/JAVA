package javaintro;

public class JavaObject {

	public static void main(String[] args) {
	// Different ways to create objects in Java

// 1) new Keyword
		JavaObject obj1=new JavaObject();
		
// 2) New Instance
		try {
			Class c=Class.forName("JavaObject");
			try {
				JavaObject obj2=(JavaObject) c.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
			
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
// 3) clone()
		JavaObject obj3=new JavaObject();
		try {
			JavaObject b=(JavaObject)obj3.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	} // main()
	
	protected Object clone() throws CloneNotSupportedException
	{
		
		return super.clone();
	}

} // class
