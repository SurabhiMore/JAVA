package javaintro;
import java.util.Arrays;

public class JavaArraysManuplation {
	
	String cofee[]= {"Affogato","Cappuccino","Americano","Corretto","Cortado","Doppio","Espresso","Freddo","Lungo","Macchiato","Ristretto"};
	String[] cafeCofee=new String[7];
	int[] arry1= {1,5,6,7,9};
	int[] arry2= {55,66,77,88,99,22,11};
	
	void copyArray(String[] copyFrom,String[] copyTo)
	{
		System.arraycopy(copyFrom, 2, copyTo,0, 7);
		for(String c:copyTo)
		{
			System.out.print(c+" ");
		}
	} // copyArray(String[] copyFrom,String[] copyTo)
	
	void copyArray_Arrays(String[] copyFrom)
	{
		String[] copyTo=java.util.Arrays.copyOfRange(copyFrom,2, 9);
		for(String c:copyTo)
		{
			System.out.print(c+" ");
		}
		
	}//copyArray_Arrays(String[] copyFrom,String[] copyTo)

	public static void main(String[] args) {
	   
		JavaArraysManuplation obj=new JavaArraysManuplation();
		obj.copyArray(obj.cofee, obj.cafeCofee);
		System.out.println();
		obj.copyArray_Arrays(obj.cofee);
		
		obj.asListArrays();
		
		int key =66;
		int binaryIndex=obj.searchElement(key);
		System.out.println("key "+key+" found in array index "+binaryIndex);
		
		obj.equalityCheck(obj.arry1,obj.arry2);
		
		obj.fillArray_Arrays(obj.arry1, key);
		

	}// end main()
	
	
	protected void asListArrays()
	{
		// converted string array to list using asList
		String arrStr[]= {"Hello","Hi","How are you"};
		System.out.println("\n Conver String to List using asList() :"+Arrays.asList(arrStr));
	} //asListArrays()
	
	int searchElement(int key)
	{
		int arr[]= {5,4,9,8,76,45,66};
		// Sort array using sort()
		Arrays.sort(arr);
		
		// convert this array into String using toString()
		System.out.println("Convert toString() :"+Arrays.toString(arr));
		
		return Arrays.binarySearch(arr, key);
		
			} //searchElement(int key)
	
	void equalityCheck(int[] arr1,int[] arr2)
	{
		// convert this array into String using toString()
				System.out.println("Convert toString() :"+Arrays.toString(arr1));
				System.out.println("Convert toString() :"+Arrays.toString(arr2));
		// use equals() to check equality of arrays		
				boolean eql=Arrays.equals(arr1,arr2);
				
				if(eql) {
					System.out.println("Both array are equal...");
				}
				else {System.out.println("Both array are not-equal...");}
				
	}// equalityCheck(int[] arr1,int[] arr2)
	
	
	void fillArray_Arrays(int[] arr , int key)
	{
		// convert this array into String using toString()
				System.out.println("Before fill Array :"+Arrays.toString(arr));
		// call fill() to fill array with element	
				Arrays.fill(arr,key);
				System.out.println("After fill Array : "+Arrays.toString(arr));
	}//fillArray_Arrays()

}// end class









