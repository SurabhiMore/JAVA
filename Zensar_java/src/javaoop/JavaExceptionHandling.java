package javaoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Exception Handler : Try,Catch,Finally,Throw,Throws
 * Try : It used to enclose the suspected code (risky code)
 * Catch : It acts as exception handler
 * Finally : It is used to excecute the necessary code
 * Throw : It throws the exception explicitly
 * Throws : It informs for the possible exception
 * 
 * Types of Exception :
 * 1) Checked Exception : The exception that can predicted by JVM at the compile time ... Syntactical error
 * 2) Unchecked Exception : are ignore at compile time and checked at runtime, for handle this exception java can provide exception classes
 * 3) Error : Its can not handle by code... like insufficient RAM , hardware error
 */
public class JavaExceptionHandling {
	
	void uncaughtException(int a, int b) {
		float result= a/b;
		System.out.println("Division Operation : "+a+" / "+b+" = "+result);
	}
	
	
	void caughtException(int a, int b) {
		float result = 0;
		try {
		result= a/b;
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Division Operation : "+a+" / "+b+" = "+result);
	}
	
	
	void multipleCatch() {
		try {
			int a[]=new int[10];
			System.out.println(a[20]);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// At time only one exception is processed and only one respective catch block is excecute

	}
	
	void unreachableCatchBlock() {
		try {
			int arr[]= {1,2};
			arr[2]=3/0;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
/* 		catch (ArithmeticException e) {
			e.printStackTrace();
		} */
		
		/*
		 * It is important to remember  that subclasses of class Exception inside catch must come before any of thier superclass,
		 * otherwiseit produced complile time error. 
		 */
	}
	
	
	void nestedTry()
	{
		try {
			int arr[]= {5,0,1,3};
			try {
				int x = arr[3]/arr[1];
							} catch (ArithmeticException e) {
								e.printStackTrace();
							}
			arr[4]=3;
					}	catch (ArrayIndexOutOfBoundsException e) {
						e.printStackTrace();
					}
		
	}
	
	void tryWithResource()
	{
		/* try(resource-specification){}catch() {}  */
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Day.java"));){
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}// while end
			
		}//try end
		catch(IOException e) {
			e.printStackTrace();
		
		}//catch end
	}
	
	
	void withoutTryWithResource() {
		try {
			String str;
			// opening file in read mode using BufferedReader Stream
			BufferedReader br=new BufferedReader(new FileReader("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Day.java"));
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}// while end
			br.close();
		}// try end
		catch(IOException e) {
			e.printStackTrace();
		}//catch end
	}

	public static void main(String[] args) {
	
		JavaExceptionHandling obj =new JavaExceptionHandling();
		obj.uncaughtException(5, 2);
		obj.caughtException(5, 0);
		obj.multipleCatch();
		obj.nestedTry();
		obj.withoutTryWithResource();
		obj.tryWithResource();
		obj.votingAge_throwUses(19);
		int[] arrInt= {55,99,78,46,2,74,36,48,95};
		try {
		obj.findNumber_unlabeledBreak(arrInt, 48);}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
	catch (ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
}
		
		obj.finallyTest();
		
		
		try {
			obj.findNumber_userDefineException(arrInt, 6);
		} catch (ItemNotFound e) {
		
			e.printStackTrace();
		}
     
	} // main
	
// Throw
	void votingAge_throwUses(int age) {
		try {
			if(age>18)
			{
				System.out.println("Your Eligible for Voting ....Your Age is "+age);
			}
			else {
				throw new ArithmeticException("No Eligible for voting ... Your Age is "+age);
			}
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
	
// Throws 	
	void findNumber_unlabeledBreak(int[] arr,int search) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int i; boolean foundIt=false;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				foundIt=true;
				break; // Unlabeled break
			} // end if
		} // end for
		if(foundIt) {System.out.println("Found "+search+" at Array index "+i);}
		else {throw new ArithmeticException(search+" Element not found in array...");}
	} // findNumber_unlabeledBreak(int[] arr,int search)
	
	
//Finally
	void finallyTest() {
		float result=0;
		try {
			result= 5/3;
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
			}
		finally {
			System.out.println("From finally Division Operation Result : = "+result);
			// Finally block always executed 
		}		
			
	}
	
	
	// UserDefine Exception
	void findNumber_userDefineException(int[] arr,int search) throws ItemNotFound
	{
		int i; boolean foundIt=false;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				foundIt=true;
				break; // Unlabeled break
			} // end if
		} // end for
		if(foundIt) {System.out.println("Found "+search+" at Array index "+i);}
		else {throw new ItemNotFound(search+" Element not found in array...");}
	} // findNumber_unlabeledBreak(int[] arr,int search)
	
	

}// end class


/* Custome / User define Exception */


class ItemNotFound extends Exception{

	public ItemNotFound(String message) {
		super(message);
		
	}
	
}//ItemNotFound

















