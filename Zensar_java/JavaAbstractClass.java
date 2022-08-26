/*
 * A Class which is declared using abstract keyword know as bastract class
 * Can not create object of abstract class
 * Methods that are declare with abstract keyword and without any body within abstact class are called abstract methods
 * Abstract methods never be final and static
 * Any class that extends abstract class must implement all abstract methods
 * 
 */
public class JavaAbstractClass {
	
	

	public static void main(String[] args) {
		
		ImplimentationTemperatureConversion  obj=new ImplimentationTemperatureConversion ();
		
		float fahrenheit =obj.celsiusTofahrenheit(); //call implimented abstract method
		System.out.println("fahrenheit="+fahrenheit);
		
		obj.fahrenheitTocelsius(); //call implimented abstract method
		
				
		float kelvin=obj.celsiusTokelvin(35.6f); // call method from abstract class
		System.out.println("kelvin="+kelvin);
		
		obj.acessFiledsFromAbstractClass();
	}//main()

}//JavaAbstractClass
  
/* Temperature Conversion using Different Units : Fahrenheit (�F), Celsius (�C), Kelvin (K)*/

abstract class TemperatureConversion{
	
	float fahrenheit=68.5f, celsius=38.9f ;
	abstract void fahrenheitTocelsius(); // abstarct method
	abstract float celsiusTofahrenheit(); // abstract method
	
	float celsiusTokelvin(float celsius) {
		/* K= �C + 273.15*/
		float kelvin=celsius+273.15f;
		return kelvin;
	}
	
	
}// abstarct class


class ImplimentationTemperatureConversion extends TemperatureConversion{
	
	void fahrenheitTocelsius()
	{ /*  C= (�F - 32) / 1.8    */
	 float fahrenheit =85.5f;
     float celsius=(fahrenheit-32)/1.8f;		
		System.out.println(fahrenheit+"�F = "+celsius+"�C");
	} // implimentation of abstract method
	
	float celsiusTofahrenheit() {
		/* F= (�C * 1.8) + 32  */
		float celsius =35.5f;
		float fahrenheit=(celsius*1.8f)+32;
		return fahrenheit;
	}// implimentation of abstract method
	
	
	void acessFiledsFromAbstractClass() {
		ImplimentationTemperatureConversion obj1=new ImplimentationTemperatureConversion();
		System.out.println("Value of fahrenheit : "+fahrenheit);
		System.out.println("Value of celsius : "+celsius);
		celsius=45.2f;
		System.out.println("Value of celsius after change : "+celsius);
	}
	
}//ImplimentationTemperatureConversion




