/*
 * A)Primitive Data Type : 
 * 1)byte : 8bit,min value -128, max value 127
 * 2)short : 16bit,min value -32768, max value 32767
 * 3)int : 32bit,min value -2147483648, max value 2147483647 
 * 4)long : 64bit,MinValue : -9223372036854775808 , MaxValue : 9223372036854775807
 * 5)float : 32bit,MinValue : 1.4E-45 , MaxValue : 3.4028235E38
 * 6)double : 64bit,64bit  MinValue : 4.9E-324  , MaxValue : 1.7976931348623157E308
 * 7)boolean : this datatype represent one bit information Values true/false
 * 8)char : 16bit Unicode Character ,min value '\u0000' or 0, max value '\uffff' or 65535
 */

/*
 * Non-Primitive Data Type
 * String
 */

public class JavaDataTypes {
	
	//datatype variableName ;
	static byte bVa1;
	static short sVar1;
	static int iVar1;
	static long lVar1;
	static float fVar1;
	static double dVar1;
	static boolean boolVar1;
	static char cVar1;
	static String name1;

	public static void main(String[] args) {
		
		//datatype variableName ;
		byte bVar=10;
		short sVar=20;
		int iVar=100;
		long lVar=546987L;
		float fVar=5.5f;
		double dVar=325.458;
		boolean boolVar=true;
		char cVar='A';
		String name="Training";
		
		//Integer Literals
		int decVal=26; // in decimal
		int hexVal=0x1a ; // 26 in hexadecimal
		int binVal=0b11010; // 26 in binary
		
		
		System.out.println("\nDefault Values of Primitive DataType\n");
		System.out.println("Default Values of byte is = "+bVa1);
		System.out.println("Default Values of short is = "+sVar1);
		System.out.println("Default Values of int is = "+iVar1);
		System.out.println("Default Values of long is = "+lVar1);
		System.out.println("Default Values of float is = "+fVar1);
		System.out.println("Default Values of double is = "+dVar1);
		System.out.println("Default Values of boolean is = "+boolVar1);
		System.out.println("Default Values of char is = "+cVar1);
		System.out.println("Default Values of String is = "+name1);
		
		System.out.println("\nSize,MinValue,MaxValue of Primitive datatype\n");
		System.out.println("Size of byte : "+Byte.SIZE+"bit  "+Byte.BYTES+"byte"+"  MinValue : "+Byte.MIN_VALUE+"  MaxValue : "+Byte.MAX_VALUE);
		System.out.println("Size of short : "+Short.SIZE+"bit "+Short.BYTES+"byte"+"  MinValue : "+Short.MIN_VALUE+"  MaxValue : "+Short.MAX_VALUE);
		System.out.println("Size of int : "+Integer.SIZE+"bit  "+Integer.BYTES+"byte"+"  MinValue : "+Integer.MIN_VALUE+"  MaxValue : "+Integer.MAX_VALUE);
		System.out.println("Size of long : "+Long.SIZE+"bit  "+Long.BYTES+"byte"+"  MinValue : "+Long.MIN_VALUE+"  MaxValue : "+Long.MAX_VALUE);
		System.out.println("Size of float : "+Float.SIZE+"bit  "+Float.BYTES+"byte"+"  MinValue : "+Float.MIN_VALUE+"  MaxValue : "+Float.MAX_VALUE);
		System.out.println("Size of double : "+Double.SIZE+"bit  "+Double.BYTES+"byte"+"  MinValue : "+Double.MIN_VALUE+"  MaxValue : "+Double.MAX_VALUE);
		System.out.println("Size of char : "+Character.SIZE+"bit  "+Character.BYTES+"byte"+"  MinValue : "+Character.MIN_VALUE+"  MaxValue : "+Character.MAX_VALUE);

		
	}// end main()

}// end JavaDataTypes
