/*
 * The Instance Variable and Methods are known as class members.
 * Object is instance of class,while class is blueprint of an object
 * The new keyword is used to allocate memory for object
 */

public class JavaClasses {

	public static void main(String[] args) {
	
		OuterClass objOuter=new OuterClass(35.5f,88.6f);
		objOuter.accessInnerclassMembers();
		objOuter.celciusTofarenheit(45.3f);
		
		
		OuterClass.InnerClass objInner=objOuter.new InnerClass();  // creating innerclass object
		objInner.accessOuterClassMembers();
		objInner.farenheitTocelcius(88.2f);
		
		LocalClassExample objLocalClass=new LocalClassExample();
		objLocalClass.validatePhoneNumber("1235","9158888608");
		
		
		AnonymousClassExample objAnonymousClass =new AnonymousClassExample();
		objAnonymousClass.method();
		

	} // end main()

}//end class






/* 
 * Nested Class 
 * Nested class enables to logically group classes that are use in only one place.
 * Its Increse the use of encapsulation and create more readable,maintainable code.
 */
class OuterClass{
	float celcius,farenheit;
	final float FARENHEIT_CONVERSION_CONST=1.8f;
	
	public OuterClass(float i,float j)
	{
		this.celcius=i;
		this.farenheit=j;
	} // constructor
	
	// method for convert celcius to farenheit
	void celciusTofarenheit(float celcius)
	{
		
		/*
		 * https://www.almanac.com/temperature-conversion-celsius-fahrenheit
		 * To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32.
		 * Example: (30�C x 1.8) + 32 = 86�F
		 */
		
		float faren=(celcius*FARENHEIT_CONVERSION_CONST)+32;
		System.out.println("convert celcius to farenheit : "+celcius+" celcius = "+faren+" farenheit");
		
	}
	
	void accessInnerclassMembers()
	{		
		// System.out.println("Access Inner class members in Outer class : CELCIUS_CONVERSION_CONST = "+CELCIUS_CONVERSION_CONST); // its canont access directly
		
		InnerClass obj=new InnerClass();
		System.out.println("Access Inner class members in Outer class : CELCIUS_CONVERSION_CONST = "+obj.CELCIUS_CONVERSION_CONST);
		obj.farenheitTocelcius(88.5f); // its access using innerclass object
	}
	

	
	class InnerClass
	{
		final float CELCIUS_CONVERSION_CONST=0.5556f;
		// method for convert farenheit to celcius
		void farenheitTocelcius(float farenheit)
		{
			/*
			 * https://www.almanac.com/temperature-conversion-celsius-fahrenheit
			 * To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by .5556 (or 5/9).
			 *  Example: (50�F - 32) x .5556 = 10�C
			 */
			float celci=(farenheit-32)*CELCIUS_CONVERSION_CONST;
			System.out.println(" convert farenheit to celcius : "+farenheit+" farenheit = "+celci+" celcius");
			
		}
		
		void accessOuterClassMembers()
		{
			System.out.println("Access Outer class members in inner class : FARENHEIT_CONVERSION_CONST = "+FARENHEIT_CONVERSION_CONST);
			celciusTofarenheit(38.5f);
		}
		
	} // end InnerClass
} // end OuterClass





/*
 * Local class : you can define local class inside any block
 */
class LocalClassExample
{
	String regularExpression="[^0-9]";
	
	public void validatePhoneNumber(String phoneNumber1,String phoneNumber2)
	{
		final int numLength=10;
		class PhoneNumberClass // Local Class start 
		{
			String formattedPhoneNumber=null;
			public PhoneNumberClass(String phoneNumber) {
				String currentNumber=phoneNumber.replaceAll(regularExpression," ");
				if(currentNumber.length()==numLength)
				{
					formattedPhoneNumber=currentNumber;
				}// end if
				else { formattedPhoneNumber=null;}
			} // end PhoneNumberClass constructor
			
			public String getNumber()
			{
				return formattedPhoneNumber;
			}// end  getNumber()
			
			public void printOriginalNumber()
			{
				System.out.println("Original number are : "+phoneNumber1+" and "+phoneNumber2);
			}//end printOriginalNumber()
			
			
		} //end Local PhoneNumberClass
		
		PhoneNumberClass mynum1=new PhoneNumberClass(phoneNumber1);
		PhoneNumberClass mynum2=new PhoneNumberClass(phoneNumber2);
		mynum1.printOriginalNumber();
		if(mynum1.getNumber()==null)
		{
			System.out.println("My number 1 is invalid..");
		}
		else {System.out.println("My number 1 is valid..");}
		
		if(mynum2.getNumber()==null)
		{
			System.out.println("My number 2 is invalid..");
		}
		else {System.out.println("My number 2 is valid..");}
		
	} // end validatePhoneNumber(String phoneNumber1,String phoneNumber2)
	
}// end LocalClassExample



/*
 * Anonymous class enable you to make your code nore concise
 * It is class without any name
 * Anonymous class is an expression,the syntax of Anonymous class exoression is like invocke constructor
 * Anonymous class expression consist: new operator,interface name to implement or class to extend,body of class decleration
 */

interface MathOpeation{
	void mathOperationType();
}

class AnonymousClassExample{
	void method() {
		MathOpeation mobj=new MathOpeation() // Anonymous Class Create
				{
			public void mathOperationType()
			{System.out.println("Its method from Anonymous Class");
				} 
				};// end Anonymous Class
				mobj.mathOperationType();
	}// end method()
		
} // end AnonymousClassExample

















