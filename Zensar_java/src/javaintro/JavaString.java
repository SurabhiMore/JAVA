package javaintro;

public class JavaString {

	public static void main(String[] args) {
	
		String str="String Object"; // Create String Object using String Literal
		String str1=new String("\tHello"); // Create String Object using new
		
//Concatenating String
		String str3=str.concat(str1); // Concatenating String using concat()
		System.out.println("str.concat(str)  "+str3);
		String str4=str+str1; // Concatenating String using + operator
		System.out.println("str+str1 "+str4);
		String str5=str+25; // Concatenating String with numeric value
		System.out.println("str+25 "+str5);
		
// String Comparison
		/* boolean equals(object str); */
		boolean bool=str.equals(str1); // false
		boolean b=str3.equals(str4); //true
		System.out.println(b);
		
		boolean b1=(str3==str4);
		System.out.println(b1); //false
		
		/* int compareTo(String str); */
		int a=str3.compareTo(str4);  //return 0 because str3.equals(str4); //true
		System.out.println(a);
		
// charAt()
		System.out.println(str3.charAt(4));
		
// equalsIgnoreCase()
		System.out.println(str3.equalsIgnoreCase("string object	hello"));
		
// indexof()
		/* int indexOf(String str); int indexOf(int ch,int fromIndex); int indexOf(int ch); int indexOf(String str,int fromIndex); */
		System.out.println("str3.indexOf('j')  "+str3.indexOf('j'));
		
// length()
		System.out.println("str4.length()  "+str4.length());
		
// replace()
		System.out.println("str4.replace('o', 'u') "+str4.replace('o', 'u'));
		
// substring()
		System.out.println("str3.substring(4, 7)  "+str3.substring(4, 7));
		
//toLowerCase()
		System.out.println("str3.toLowerCase() "+str3.toLowerCase());
		
//toUpperCase()
		System.out.println("str3.toUpperCase() "+str3.toUpperCase());
		
//valueOf()
		String str6=String.valueOf(123);
		System.out.println("Type of str6 is :"+str6.getClass().getName());
		
//toString()
		JavaString obj=new JavaString();
		System.out.println("obj : "+obj);
		
//contains()
		System.out.println(str3);
		boolean b3=str3.contains("Object	Hello");
		System.out.println(b3); // true
		
// endsWith()
		System.out.println("str3.endsWith(\"o\") "+str3.endsWith("o")); //true
		
// startsWith()		
		System.out.println("str3.startsWith(\"o\") "+str3.startsWith("o")); // false
		
// format()
		/* %a  %f  floating point ,%c character, %d %o  %x integer,%t date/time ,%s string */
		String a1=String.format("%d",136);
		System.out.println("Integer Value : "+a1);
		
		String a2=String.format("%s","Rust is System language better than C++");
		System.out.println("String Value : "+a2);
		
		
		String a3=String.format("%f",136.689f);
		System.out.println("Float Value : "+a3);
		
		String a4=String.format("%c",'A');
		System.out.println("Character Value : "+a4);
		
// getBytes()
		byte[] arrByte=str3.getBytes();
		for(byte x:arrByte)
		{
			System.out.println(x);
		}
		
// getChars		
		char[] arrChar =new char[12];
		str3.getChars(2, 8,arrChar ,0);
		System.out.println(arrChar);
		
// isEmpty()
		System.out.println("str4.isEmpty() : "+str4.isEmpty());
		
		
// join()
		String date=String.join("/","23","03","2022");
		System.out.println("date : "+date);
		
		String time=String.join(":","10","39","12");
		System.out.println("time : "+time);
		
	}// main()
	
	public String toString()
	{
		return "Hello String toString()";
	}

}//class
