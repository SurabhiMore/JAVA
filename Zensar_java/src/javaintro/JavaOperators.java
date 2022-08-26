package javaintro;

public class JavaOperators {


	public static void main(String[] args) {
		
// Arithmetic operator
		int addResult=1+2;   // + Additive operator
		int subResult=3-1;   // - Substraction operator
		int mulResult=3*6;  // * Multiplication operator
		float divResult=3/2; // / Division operator
		int remResult=addResult%7; // % Reminder operator
		
//Unary Operator
		int res=+1; // + operator
		System.out.println("+1 "+res);
		
		res=-1;  // - operator
		System.out.println("-1 "+res);
		
		res--; // Decrement operator
		System.out.println("res-- "+res);
		
		res++; // Increment operator
		System.out.println("res++ "+res);
		
//Logical Complement Operator
		boolean sucess=false;
		System.out.println(sucess);
		System.out.println(!sucess);
		
//Equality and Relational Operator
		int val1=1;int val2=2;
		if(val1==val2) {System.out.println("val1==val2");} // == equal to operator
		if(val1!=val2) {System.out.println("val1!=val2");} // ! equal to operator
		if(val1>val2) {System.out.println("val1>val2");} // > greater than operator
		if(val1<val2) {System.out.println("val1<val2");} // > less than operator
		if(val1>=val2) {System.out.println("val1>=val2");} // >= greater than or equal operator
		if(val1<=val2) {System.out.println("val1<=val2");} // >= less than or equal operator
		
		
//Conditional Operator
		if((val1==1)&&(val2==2)) {System.out.println("(val1==1)&&(val2==2)");} //&& Conditional AND to operator
		if((val1==1)||(val2==2)) {System.out.println("(val1==1)||(val2==2)");} //|| Conditional OR to operator
		
		boolean someCondition=true;
		int result =someCondition?val1:val2; // ? : Ternary Conditional operator(if-then-else)
		System.out.println(result);
		
	
		
//Type Comparison operator instanceof
		Integer objI=Integer.valueOf(val1);
		System.out.println(objI instanceof Integer);
		
		
//Bitwise and Bit Shift Operator
		// - Unary bitwise complement operator
	    // << Signed left shift
		// >> Signed Right Shift operator
		// & Bitwise AND
		// >>> Unsigned Right Shift
		// ^ Bitwise exclusive OR
		// | Bitwise inclusive OR
		
		
		/* Truth Table for bitwise &,I,^
		 * 
		 *      a      b     a&b     a|b    a^b
		 *      0      0      0         0        0
		 *      0      1      0         1        1
		 *      1      0      0         1        1
		 *      1      1      1         1        0
		 *       
		 */
		
		
		int bitmask=0x000F;
		int vald=0x2222;
		System.out.println(bitmask&vald);
		
		int a=50,b=25,c=0;
		
		c=a&b; System.out.println("a&b = "+c);
		c=a|b; System.out.println("a|b = "+c);
		c=a^b; System.out.println("a^b = "+c);
		c=a<<2; System.out.println("a<<2 = "+c);
		c=a>>2; System.out.println("a>>2 = "+c);
		c=a>>>2; System.out.println("a>>>2 = "+c);
		
		
		
		
		
		
		

	}// end main()

}// end JavaOperators
