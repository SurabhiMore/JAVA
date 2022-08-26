import java.util.ArrayList;

/*
 Wrapper class : java provides type of erappers which provide classess tha encapsulate a primitivetype within an object
                        java provides wrapper classes correspond to each primitive type to deal with objects that are  table below.
######################################################
                      Primitive-Type                  Wrapper-Class
              -------------------------------------------------------------------        
                      int                                  Integer
                      byte                                Byte
                      short                               Short
                      float                                Float
                      double                             Double
                      char                                Character
                      long                                Long
                      boolean                           Boolean 
                      
######################################################

*/
public class JavaAutoboxingUnboxing {
	
	int add(Integer a,Integer b) { // autoboxing in parameters
		return a+b; // unboxing in return
	}

	public static void main(String[] args) {
		
        Integer i=100 ; // Autoboxing of int i.e. converting primitive data type int to wrapper class Integer
        Character ch='a'; //Autoboxing
        Byte b=12; // Autoboxing
        
        
        ArrayList<Integer> arrList=new ArrayList();
        arrList.add(100); // autoboxing  int to Integer
        arrList.add(200);
        arrList.add(300);
        arrList.add(400);
        arrList.add(500);
        
        for(Integer ii: arrList) {
        	System.out.println(ii);
        }
        
        // Unboxing Integer to int type
        int first=arrList.get(1);
        System.out.println("int value "+first);
        
        
        JavaAutoboxingUnboxing obj=new JavaAutoboxingUnboxing();
        int sum=obj.add(10,20);
		
	} // end main()

}// end class
