/*
 * Casting is process of changing one type to another type
 * Two types of casting
 * 1)Implicit Casting (Widening casting)
 * 2)Explicitly Casting(Narrowing casting)
 */

public class JavaTypeCast {
	public static void main(String[] args) {
	
// Implicit Casting
		
		/* byte-->short-->int-->long-->float-->double */
		
		int i=100;
		long l=i;
		float f=l;
		
		System.out.println("Implicit Type Casting value of l = "+l);
		System.out.println("Implicit Type Casting value of f = "+f);	
		
// Explicitly Casting
		
		/* double-->float-->long-->int-->short-->byte */
		
	    double d=f; // Implicit Casting
		
		l=(long)d; // Explicitly Casting
		System.out.println("Explicitly Type Casting value of l = "+l);
		
		i=(int)l;
		System.out.println("Explicitly Type Casting value of i = "+i);
		
	}// end main()

}// end JavaTypeCast
