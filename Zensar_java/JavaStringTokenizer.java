import java.util.StringTokenizer;

public class JavaStringTokenizer {
	/*
	 * StringTokenizer is used to break string into tokens based on provided delimiter
	 * this class located into java.util pakage
	 * This class is legacy class that is retained for compability resons
	 */
	
	void stringToken1()
	{
		StringTokenizer  strTokenObj = new StringTokenizer("If you want to help contribute to Ubuntu, then you�ve come to the right place. Keep reading to learn how. "," ");
		
		while(strTokenObj.hasMoreTokens())
		{
			System.out.println(strTokenObj.nextToken());
		}
	} //stringToken1()
	
	void stringToken2()
	{
		String x=" : ";
		String z="Welcome : to : Java";
		StringTokenizer strTokenObj=new StringTokenizer(z,x);
		int count1=strTokenObj.countTokens();
		for(int i=0;i<count1;i++)
		{
			System.out.println("token["+i+"]"+strTokenObj.nextToken());
		}
	}//stringToken2()
	
	

	public static void main(String[] args) {
		
		JavaStringTokenizer obj=new JavaStringTokenizer();
		obj.stringToken1();
		System.out.println("\n");
		obj.stringToken2();
		System.out.println("\n");
		obj.javaSplit();
	}// main()
	
	/*
	 * It is recommended by oracle - use String.split or java.util.regex package insted StringTokenizer class
	 */
	void javaSplit()
	{
		String[] str="If you want to help contribute to Ubuntu, then you�ve come to the right place. Keep reading to learn how.".split("\\s");
		for(int x=0;x<str.length;x++)
		{
			System.out.println(str[x]);
		}
	}//javaSplit()

}// end class
