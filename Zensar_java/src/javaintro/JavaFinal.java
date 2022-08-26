package javaintro;

/*
 * 
 * Final keyword is can be used with variable,method and class
 * Final keyword is used to declare a field(variable) as Final(Constant)
 * If we declare a variable as final then it prevents its content from being modified
 * Final field must be initialized when its declared
 * If we declare a method as final then it prevents it from being overridden
 * If we declare a class as final then it prevents from being inherited
 */

/*
 * Final Variable that is not initialized at time of decleration is called blank final variable
 * Java allow to declare final variable without initialization but it must be initialize by constructor.
 */

public class JavaFinal {

	final int var1=50;
	int x;
	
	final int var2;
	
	public JavaFinal() {
		this.var2=56;
	}// constructor 1
	
	public JavaFinal(int x) {
		this.var2=x;
	}// constructor 2
	
	final void add(int x)
	{
		this.x=x;
		System.out.println("Addition of "+this.x+" + "+var1+" = "+(this.x+var1));
	}
	
	
	public static void main(String[] args) {
		JavaFinal obj1=new JavaFinal();
	
		
		System.out.println(" Final variable Value obj1.var2 = "+obj1.var2);
//		obj1.var2=60;
		
		JavaFinal obj2=new JavaFinal(25);
		
		System.out.println(" Final variable Value obj2.var2 = "+obj2.var2);
//		obj2.var2=60;
	}// end main()

}// end class()


final class Child extends JavaFinal
{
/*
 	 void add(int x)
 
		{
			this.x=x;
			System.out.println("Addition of "+this.x+" + "+var1+" = "+(this.x+var1));
		}
		
*/
} // Child


/*
 
class Child_Child extends Child{
	
}//Child_Child

*/
