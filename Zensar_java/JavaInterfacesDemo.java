/*
 * Write a program to perform operation of simple interest and compound interest with different types of loans for diffrent baks
 * loan type is  homeloan,vehicleloan,personalloan
 * Banks names is XYZBank,ABCBank,PNCBank
 */
public class JavaInterfacesDemo {

	public static void main(String[] args) {
	
		XYZBank objXYZBank=new XYZBank();
		objXYZBank.simpleInterestAbstractMethod(); // call implemented abstract method
		objXYZBank.staticMethodCallFromInterface(); // static method call from interface
		objXYZBank.simpleInterestDefaultMethod(); // call default method from interface
		
		ABCBank objABCBank=new ABCBank();
		objABCBank.compoundInterestAbstractMethod(); // call implemented abstract method
		
		PNCBank objPNCBank=new PNCBank();
		objPNCBank.compoundInterestAbstractMethod(); // call implemented abstract method from compoundInterest
		objPNCBank.simpleInterestAbstractMethod(); // call implemented abstract method from simpleInterest
		objPNCBank.simpleInterestDefaultMethod(); // call default method from interface simpleInterest

	}// end main()

}//end class

interface SimpleInterest{
	/*
	 * P : Principal Amount
	 * R : Rate per Annum
	 * T : Time in Year
	 * simpleInterest=(PxRxT)/100;
	 */
// variable from interface : by default public static final	
	double HOME_RATE=11;  // 11% per annum
	double PERSONAL_RATE=22; // 22% per annum
	double VEHICLE_RATE=18; // 18% per annum
	
// default method from interface
	default void simpleInterestDefaultMethod() {
		System.out.println("Its Default Method... Call Private method inside default method");
		simpleInterestPrivateMethod_personalLoan(200000.0,3);
		simpleInterestPrivateMethod_homeLoan(2000000.0,20);
		simpleInterestPrivateMethod_vehicleLoan(700000.0,5);
	}
	
// private method from interface
	private void simpleInterestPrivateMethod_personalLoan(double p,double t) {
		System.out.println("Private method from interface : Personal Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+PERSONAL_RATE);
		double simple_interest=(p*PERSONAL_RATE*t)/100;
		System.out.println("Simple Interest = "+simple_interest);	
	}
	
	private void simpleInterestPrivateMethod_homeLoan(double p,double t) {
		System.out.println("Private method from interface :  Home Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+PERSONAL_RATE);
		double simple_interest=(p*PERSONAL_RATE*t)/100;
		System.out.println("Simple Interest = "+simple_interest);	
	}
	
	private void simpleInterestPrivateMethod_vehicleLoan(double p,double t) {
		System.out.println("Private method from interface :  Vehicle Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+PERSONAL_RATE);
		double simple_interest=(p*PERSONAL_RATE*t)/100;
		System.out.println("Simple Interest = "+simple_interest);	
	}
	

// static method from interface
	static void simpleInterestStaticMethod_vehicleLoan(double p,double t,double r) {
		System.out.println("Static method from interface : Vehicle Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+r);
		double simple_interest=(p*r*t)/100;
		System.out.println("Simple Interest = "+simple_interest);
	}
	
	static void simpleInterestStaticMethod_personalLoan(double p,double t,double r) {
		System.out.println("Static method from interface : Personal Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+r);
		double simple_interest=(p*r*t)/100;
		System.out.println("Simple Interest = "+simple_interest);
	}
	
	static void simpleInterestStaticMethod_homeLoan(double p,double t,double r) {
		System.out.println("Static method from interface : Home Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+r);
		double simple_interest=(p*r*t)/100;
		System.out.println("Simple Interest = "+simple_interest);
	}
	
// abstract method from interface : by default public abstract
	void simpleInterestAbstractMethod();
		
	
} // interface SimpleInterest


interface CompoundInterest{
	/*
	 *P(1 + r/n)nt 
	 *
	 *n : number of times that interest is compunded per unit time
	 */
	
	void compoundInterestAbstractMethod();
}//interface CompoundInterest

interface Interest extends SimpleInterest,CompoundInterest{  // Multiple Inheritance
	
}



class XYZBank implements  SimpleInterest{
	// implement abstract method from interface 
		public void simpleInterestAbstractMethod() {
			double p=200000.0;double t=5;
			System.out.println("abstarct method implementation : Vehicle Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+VEHICLE_RATE);
			double simple_interest=(p*VEHICLE_RATE*t)/100;
			System.out.println("Simple Interest = "+simple_interest);
		}
		
	// static method call from Interface
		void staticMethodCallFromInterface() {
			SimpleInterest.simpleInterestStaticMethod_homeLoan(2500000, 30, 12);
			SimpleInterest.simpleInterestStaticMethod_personalLoan(300000, 3, 27);
			SimpleInterest.simpleInterestStaticMethod_vehicleLoan(700000, 5, 22);
		}
		
		
}//XYZBank


class ABCBank implements CompoundInterest{
	
	// implement abstract method from interface 
	public void compoundInterestAbstractMethod() {
		System.out.println("Compound Interst : ");
		double p=700000;
		double r=10.5;
		double t=2;
		double ci=p*(Math.pow((1+r/100),t));
		System.out.println("Compound interst = "+ci);
	}
}//ABCBank



class PNCBank implements Interest{
	
	// implement abstract method from simpleInterest interface 
			public void simpleInterestAbstractMethod() {
				double p=200000.0;double t=5;
				System.out.println("abstarct method implementation : Vehicle Loan  Principal Amount is : "+p+"Duration in Year : "+t+" Intrest Rate per Year: "+VEHICLE_RATE);
				double simple_interest=(p*VEHICLE_RATE*t)/100;
				System.out.println("Simple Interest = "+simple_interest);
			}
			
			
			
	// implement abstract method from CompoundInterest interface 
			public void compoundInterestAbstractMethod() {
				System.out.println("Compound Interst : ");
				double p=700000;
				double r=10.5;
				double t=2;
				double ci=p*(Math.pow((1+r/100),t));
				System.out.println("Compound interst = "+ci);
			}		
			
}//PNCBank












