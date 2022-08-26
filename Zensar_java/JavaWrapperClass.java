package javaoop;

public class JavaWrapperClass {
	
	void wrapperPrimitiveClasses_Immutable() {
		/*
		 * In java all primitive wrapper classes are immutable,when a new object is created the old object is not modified
		 */
		Integer a= new Integer(15);
		System.out.println("Old value of  a = "+a);
	     anotherMethod(a);
	     System.out.println("New Value a = "+a);
	}
	
	void numberClass() {
		/* using value we can convert wrapper class object to diffrent types of primitive values  */
		Double d1 =new Double("4.8976");
		byte b=d1.byteValue();
		short sh=d1.shortValue();
		int i=d1.intValue();
		long l=d1.longValue();
		float f=d1.floatValue();
		double d=d1.doubleValue();
	}
	
	static void anotherMethod(Integer a) {
		a=a+10;
	}
	
// Wrapper Classes	
	
	void wrapperClassInteger() {
		int a=100;
		Integer x= new Integer(a);
		System.out.println("toString(a) "+Integer.toString(a));
		
		Integer xx=Integer.valueOf(a);
		String aa="200";
		Integer xxx=Integer.parseInt(aa);
		
		String b="65";
		String c="004";
		String d="0x0f";
		Integer a1=Integer.decode(b);
		System.out.println("decode(65) = "+a1);
		Integer a2=Integer.decode(c);
		System.out.println("decode(004) = "+a2);
		Integer a3=Integer.decode(d);
		System.out.println("decode(0x0f) = "+a3);
	}
	
	
	void wrapperClassLong() {
		long a=100;
		Long x= new Long(a);
		System.out.println("toString(a) "+Long.toString(a));
		
		Long xx=Long.valueOf(a);
		String aa="200";
		Long xxx=Long.parseLong(aa);
		
		String b="65";
		String c="004";
		String d="0x0f";
		Long a1=Long.decode(b);
		System.out.println("decode(65) = "+a1);
		Long a2=Long.decode(c);
		System.out.println("decode(004) = "+a2);
		Long a3=Long.decode(d);
		System.out.println("decode(0x0f) = "+a3);
	}
	
	
	void wrapperClassShort() {
		short a=100;
		Short x= new Short(a);
		System.out.println("toString(a) "+Short.toString(a));
		
		Short xx=Short.valueOf(a);
		String aa="200";
		Short xxx=Short.parseShort(aa);
		
		String b="65";
		String c="004";
		String d="0x0f";
		Short a1=Short.decode(b);
		System.out.println("decode(65) = "+a1);
		Short a2=Short.decode(c);
		System.out.println("decode(004) = "+a2);
		Short a3=Short.decode(d);
		System.out.println("decode(0x0f) = "+a3);
	}
	
	
	void wrapperClassByte() {
		byte a=100;
		Byte x= new Byte(a);
		System.out.println("toString(a) "+Byte.toString(a));
		
		Byte xx=Byte.valueOf(a);
		String aa="88";
		Byte xxx=Byte.parseByte(aa);
		
		String b="65";
		String c="004";
		String d="0x0f";
		Byte a1=Byte.decode(b);
		System.out.println("decode(65) = "+a1);
		Byte a2=Byte.decode(c);
		System.out.println("decode(004) = "+a2);
		Byte a3=Byte.decode(d);
		System.out.println("decode(0x0f) = "+a3);
	}
	
	
	void wrapperClassFloat() {
		float a=100f;
		Float x= new Float(a);
		System.out.println("toString(a) "+Float.toString(a));
		
		Float xx=Float.valueOf(a);
		String aa="200";
		Float xxx=Float.parseFloat(aa);
		
		}
	
	void wrapperClassDouble() {
		double a=100;
		Double x= new Double(a);
		System.out.println("toString(a) "+Double.toString(a));
		
		Double xx=Double.valueOf(a);
		String aa="200";
		Double xxx=Double.parseDouble(aa);
		
		}
	

	public static void main(String[] args) {
		JavaWrapperClass obj=new JavaWrapperClass();
		obj.wrapperPrimitiveClasses_Immutable();
		obj.wrapperClassInteger();
        obj.wrapperClassByte();
        obj.wrapperClassDouble();
        obj.wrapperClassFloat();
        obj.wrapperClassShort();
        obj.wrapperClassLong();
        obj.wrapperClassCharacter();
        obj.wrapperClassBoolean();
	}// main()
	
	
	void wrapperClassCharacter() {
		System.out.println(Character.isAlphabetic('X'));
		System.out.println(Character.isLetter('X'));
		System.out.println(Character.isAlphabetic('0'));
		System.out.println(Character.isLetter('0'));
		System.out.println(Character.isDigit('0'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toString('A'));
	}
	
	
	void wrapperClassBoolean() {
		boolean b1= Boolean.parseBoolean("True");
		Boolean xx=Boolean.valueOf(b1);
		System.out.println(Boolean.toString(b1));
	}

}//class
