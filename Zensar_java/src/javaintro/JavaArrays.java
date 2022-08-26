package javaintro;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * An Array is container that holds a fixed number of values of a single datatype
 * Each item in array is called element
 * Each element is accessed by its numerical index
 * Array index start from 0
 */
public class JavaArrays {
	
	public static void main(String[] args) {
//1		
		// declares array of Integers
		int[] arrayVar;   
			
		// allocates memory for 10 Integers
		arrayVar=new int[10];
		
		//initialize elemnts
		arrayVar[0]=100;
		arrayVar[1]=101;
		arrayVar[2]=102;
		arrayVar[3]=103;
		arrayVar[4]=104;
		arrayVar[5]=105;
		arrayVar[6]=106;
		arrayVar[7]=107;
		arrayVar[8]=108;
		arrayVar[9]=109;
		
		System.out.println("arrayVar1 lenght is = "+arrayVar.length);
	
			
		//Accessing array
		System.out.println("Element at index number 0 = "+arrayVar[0]);
		System.out.println("Element at index number 9 = "+arrayVar[9]);
			
		
//2		
		// creating array
		int arrayVar1[]=new int[5];
		//initialize elemnts
				arrayVar1[0]=100;
				arrayVar1[1]=101;
				arrayVar1[2]=102;
				arrayVar1[3]=103;
				arrayVar1[4]=104;
				System.out.println("arrayVar1 lenght is = "+arrayVar1.length);
				
				//Accessing array
				System.out.println("Element at index number 0 = "+arrayVar1[0]);
				
				System.out.println("Element at index number 4 = "+arrayVar1[4]);
				
				
//3
				int[] arrayVar2= {1,2,3,4,5,6,7};
               System.out.println("arrayVar2 lenght is = "+arrayVar2.length);
				
				//Accessing array
				System.out.println("Element at index number 0 = "+arrayVar2[0]);
				
				System.out.println("Element at index number  = "+arrayVar2[6]);
				
				
				
				
				
				JavaArrays objJavaArrays=new JavaArrays();
				int len=arrayVar2.length;
				System.out.println("\nPrint Array Element Without using Loop and Without using Inbuilt Method\n");
				objJavaArrays.printArray(arrayVar2,len ,0); // way 3
				
				
				String [] strArray= {"Java","Python","C++","Rust","Ruby"};
				ArrayList<String> arr=new ArrayList<String>(Arrays.asList(strArray));
				
				System.out.println("\nPrint Array Element Without using Loop \n");
				
				System.out.println(arr); // way 4
				
				System.out.println("Converting array : Element at index number 0 to 9= "+Arrays.toString(arrayVar)); // way 1
				String arrayString= Arrays.toString(arrayVar);
				System.out.println(" Converting array : Element at index number 0 to 9= "+arrayString); // way 2
				
				

	}// end main()
	
	void printArray(int arr[],int length,int iterate) {
		if(iterate==length)
		{
			return;
		}
		System.out.print(arr[iterate]);
		iterate++;
		printArray(arr,length,iterate);
	}

}// end JavaArrays
