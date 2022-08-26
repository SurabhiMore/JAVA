package javaintro;

import java.util.Scanner;

public class JavaLoop {
	
	
	void printTable_forLoop()
	{
		Scanner scanObj=new Scanner(System.in);
		int i;
		System.out.println("Enter Number to print Table : \n");
		int n =scanObj.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);		}
	} // printTable_forLoop()
	
	void printStarPattern_nested_forLoop()
	{
		Scanner objScan=new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int rows=objScan.nextInt();
		
		for(int i=1;i<=rows;++i) // outer loop for rows
		{
			for(int j=1;j<=i;++j) // ineer loop for column
			{
				System.out.print("* ");
			}
		System.out.println(); // newline
		}
	} //printStarPattern_nested_forLoop()
	
	
	void printArrayElement_forEachLoop()
	{
	/*
	 	for(Type var:array) { }    */
	
		int a[]= {55,68,49,78,25};
		for(int i:a)
		{
			System.out.println("Element of Array : "+i);
		}
	} // printArrayElement_forEachLoop()

	public static void main(String[] args) {
		JavaLoop obj =new JavaLoop();
		obj.printTable_forLoop();
		obj.printStarPattern_nested_forLoop();
		obj.printArrayElement_forEachLoop();
		obj.count_whileLoop();
		obj.count_doWhileLoop();
		
		int marks[]= {55,89,78,88,58};
		int highst_marks=maxCount(marks);
		for(int a:marks) {
			System.out.println("Obtain Marks = "+a);
		}
		System.out.println("Max Score is : "+highst_marks);
     
	}// end main()
	
	
	void count_whileLoop()
	{
		/* while(condition){} */
		Scanner objScan=new Scanner(System.in);
		System.out.println("Enter Number : \n");
		int n =objScan.nextInt();
		int count=1;
		while(count<=n)
		{
			System.out.println("Count is : "+count);
			count++;
		}
		
			} //count_whileLoop()
	
	
	void count_doWhileLoop()
	{
		/* do {}while(condition); */
		Scanner objScan=new Scanner(System.in);
		System.out.println("Enter Number : \n");
		int n =objScan.nextInt();
		int count=1;
		do {
			System.out.println("Count is : "+count);
			count++;
		}while(count<=n);
	} //count_doWhileLoop()
	
	
	static int maxCount(int[] numbers)
	{
		int max=numbers[0];
		
		for(int num:numbers)
		{
			if(num>max)
			{
				max=num;
			}
		} return max;
		
	}//maxCount(int[] numbers)

}// end class





















