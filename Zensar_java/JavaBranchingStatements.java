import java.util.Arrays;

public class JavaBranchingStatements {

	
String str="Java is the name of a programming language created by Sun Microsystems. This company was bought out by Oracle Corporation, which continues to keep it up to date. The latest version is Java 16, released in March 2021. The latest Long Term Support (LTS) version is Java 11,[1] released on September 25, 2018; and Oracle released for the \"legacy\" Java 8 LTS the last free \"public update\". The next planned LTS version is Java 17 (LTS), planned for September 2021";
int[] arrInt= {55,99,78,46,2,74,36,48,95};
int [][] arrIntTwoDim= {{32,8,7,898},{12,49,2000,867},{47,679,128,69}};
	
	void findNumber_unlabeledBreak(int[] arr,int search)
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
		else {System.out.println(search+" not found in Array....");}
	} // findNumber_unlabeledBreak(int[] arr,int search)
	
	
	
	void findNumber_labeledBreak(int[][] arr,int search)
	{
		int i,j=0;
		boolean foundIt=false;
		find:
			for(i=0;i<arr.length;i++)
			{
				for(j=0;j<arr[i].length;j++) {
					if(arr[i][j]==search)
					{
						foundIt=true;
						break find; //labeled break
					}// end if
				}// inner loop
			} // outer loop
		
		if(foundIt) {System.out.println("Found "+search+" at Array ["+i+"]"+"["+j+"]");}
		else {System.out.println(search+" Not Found in Array");}
	}//findNumber_labeledBreak(int[][] arr,int search)
	
	
	
	public static void main(String[] args) {
		JavaBranchingStatements obj=new JavaBranchingStatements();
		System.out.println("Search Element from Single dimentional Array ......");
		for(int a:obj.arrInt)
		{
			System.out.println("Array Element :"+a);
		}
		obj.findNumber_unlabeledBreak(obj.arrInt,740);
		
		System.out.println();
		
		System.out.println("Search Element from Tow dimentional Array ......");
		for(int[] row:obj.arrIntTwoDim)
		{
			System.out.println(Arrays.toString(row));
		}
		obj.findNumber_labeledBreak(obj.arrIntTwoDim, 679);
		
		System.out.println();
		
		System.out.println("Search Character from String and print repetation number");
		obj.countFindCharacter_unlabeledContinue(obj.str, 'a');
		
		System.out.println();
		
		System.out.println("Search SubString from String and print it found or not");
		obj.findSubString_labeledContinue(obj.str,"and");

	}//main()
	
	void countFindCharacter_unlabeledContinue(String str,char ch)
	{
		int max=str.length();
		int numChars=0;
		for(int i=0;i<max;i++)
		{
			if(str.charAt(i)!=ch) {
				continue; // Unlabeled Continue
				}
			numChars++;
		}
		System.out.println("Found "+numChars+" Character : "+ch+" in String : "+str);
	}//findChar_unlabeledContinue()
	
	
	 void findSubString_labeledContinue	(String str,String subStr)
	  {
		  boolean foundIt=false;
		  int max=str.length()-subStr.length();
		  find:
			  for(int i=0;i<max;i++)
			  {
				  int n=subStr.length();int j=i;int k=0;
				  while(n-- !=0) {
					  if(str.charAt(j++)!=subStr.charAt(k++))
					  {
						  continue find; // Labeled Continue
					  }// end if
				  }// inner loop
				  
				  foundIt=true; break find;
			  } // outer loop
		  
		  System.out.println(foundIt?" Found it..":" Didnt find"); // Ternary
	  }

}//JavaBranchingStatements
















