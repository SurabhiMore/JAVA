public class ZProgram6 {

    String str="Java is the name of a programming language created by Sun Microsystems. This company was bought out by Oracle Corporation, which continues to keep it up to date. The latest version is Java 16, released in March 2021. The latest Long Term Support (LTS) version is Java 11,[1] released on September 25, 2018; and Oracle released for the \"legacy\" Java 8 LTS the last free \"public update\". The next planned LTS version is Java 17 (LTS), planned for September 2021";
    public static void main(String args[]){

        ZProgram6 obj=new ZProgram6();

        System.out.println("Search SubString from String and print it found or not");
		obj.findSubString_labeledContinue(obj.str,"is");
    }

    void findSubString_labeledContinue	(String str,String subStr){
          int count = 0;
		  boolean foundIt=false;
		  int max=str.length()-subStr.length();

		  find:
			  for(int i=0;i<max;i++)
			  {
				  int n=subStr.length();
                  int j=i;
                  int k=0;
				  while(n--!=0) {
					  if(str.charAt(j++)!=subStr.charAt(k++))
					  {
						  continue find; // Labeled Continue
					  }// end if
				  }// inner loop
				  
				  if(foundIt=true){
                      count++;
                  } 
                  continue;
			  } // outer loop
        System.out.println(foundIt?" Found it..":" Didnt find"); // Ternary
        System.out.println("Number of times substring is repeated = "+count);
	  }
}
