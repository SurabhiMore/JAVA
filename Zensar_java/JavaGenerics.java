package javaoop;

public class JavaGenerics {

	/*
	ClassName<DataType> referance_name =new ClassName<DataType>();
	
	ClassName<DataType> referance_name=new ClassName<>();
	*/

	public static void main(String[] args) {
	 Gen<Integer> obj=new Gen<>(100);
	 int x=obj.getOb();
	 System.out.println(x);
	 
	 Gen<String> str=new Gen<>("JAVA");
	 String ss=str.getOb();
	 System.out.println(ss);
	 
	 // T a[]; // allowed
	 // T a[]=new T[10]; // mot allowed
	 
	 Genr<String,Integer> obj1=new Genr("Java",105);
	 String s=obj1.getName();
	 System.out.println(s);
	 
	 Integer i=obj1.getValue();
	 System.out.println(i);
	 
	 obj1.display(405,"Hello");
	 
	 
	 NonGen g=new NonGen(169);
	 g.show();
	 
	 NonGen g1=new NonGen(169.69f);
	 g1.show();
	 
	 obj1.display1(105,59.5f);
	// obj1.display1(69.5f,"str");
	 

	}// end main()

}// end class


class Gen<T> // <> brackets indicates that the class is of gerneric type
{
	T ob; // an object of type T is declared
	Gen(T o){
		ob=o;
	}//constructor
	
	
	public T getOb() {
		return ob;
	}
}//Gen<T>



class Genr<T1,T2>{
	T1 name;
	T2 value;
	
	Genr(T1 o1,T2 o2){
		name=o1;
		value=o2;
	}//constructor
	
	public T1 getName() {
		return name;
	}
	
	public T2 getValue() {
		return value;
	}
	
	/* Generic Method 
	 * <type-parameter> returnType methodname(parameter-list){}
	 */
	
	<T1,T2> void display(T1 ob1,T2 ob2) {
		System.out.println(ob1.getClass().getName()+" = "+ob1);
		System.out.println(ob2.getClass().getName()+" = "+ob2);
	}
	
	
	/* Generic Method with bounded type parameter */
	
	<T1,T2 extends Number> void display1(T1 t,T2 tt) {
		System.out.println(t.getClass().getName()+" = "+t);
		System.out.println(tt.getClass().getName()+" = "+tt);
	}
	
}//Genr<T1,T2>



class NonGen{
	
	private double val;
	
	<T extends Number> NonGen(T ob){
		val=ob.doubleValue();
	} //constructor with generic
	
	void show() {
		System.out.println(val);
	}
	
}//NonGen
