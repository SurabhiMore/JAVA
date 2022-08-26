package javaintro;

import java.util.Arrays;

public class JavaMultiDimentionalArray {
	
	/* 
	    datatpe[][] arrayName = new datatype[no_of_rows][no_of_columns]
	 */
	
	void multiDimentionalArray()
	{
		int arrIntTwoDim[][]= {{59,88,66,77,44},{99,85,12,46,75},{11,22,33,44,55}};
		for(int[] row:arrIntTwoDim)
		{
			System.out.println(Arrays.toString(row));
		}
	} // multiDimentionalArray()

	public static void main(String[] args) {
		JavaMultiDimentionalArray obj=new JavaMultiDimentionalArray();
		obj.multiDimentionalArray();
		obj.multiDimentionalArray1();

	}// end main()
	
	void multiDimentionalArray1()
	{
		String[][] names= {{"Mr.","Mrs.","Ms."},{"Dhanesh","Murli","Shnaya"}};
		for(String[] row:names)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println(names[0][0]+names[1][0]); // Mr. Dhanesh
		System.out.println(names[0][2]+names[1][1]); // Ms.Murli
		System.out.println(names[0][1]+names[1][2]); // Mrs.Shnaya
	}//multiDimentionalArray1()
	

}// end class
