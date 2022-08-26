/*
 * 
 * Final keyword is can be used with variable,method and class
 * Final keyword is used to declare a field(variable) as Final(Constant)
 * If we declare a variable as final then it prevents its content from being modified
 * Final field must be initialized when its declared
 * If we declare a method as final then it prevents it from being overridden
 * If we declare a class as final then it prevents from being inherited
 */
// String class is an example of final class

public class JavaFinal {

	final int var1=50;
	int x;
	
	/* final var i.e. not initialized at time of declaration is called Blank final var 
	*  Java allows to declare final var without initialization but it must be initialized by constructor
	*/ 
	final int var2;
	public JavaFinal(){
		this.var2 = 12;
	} // constructor 1

	public JavaFinal(int x){
		this.var2 = x;
	} // constructor 2

	final void add(int x)
	{
		this.x=x;
		System.out.println("Addition of "+this.x+" + "+var1+" = "+(this.x+var1));
	}
	
	
	public static void main(String[] args) {
		JavaFinal obj1=new JavaFinal();
		// obj1.var1=60;	~ can't be assigned cause of final
		System.out.println("Final variable value obj1.var1 = "+obj1.var2);
		// obj1.var2=45;	~ can't be assigned cause of final (Blank final var)
		
		JavaFinal obj2=new JavaFinal(2);
		System.out.println("Final variable value obj2.var2 = "+obj2.var2);
		// obj2.var2 = 10;	~ can't be assigned cause of final	(parametrized constructor)

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
