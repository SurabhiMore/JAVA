/*
 * Types of Inheritance : Single Inheritance,Multilevel Inheritance,Heirarchical Inheritance
 * IS-A Relationship : Its depends on Inheritance,When there is extends or implementation keyword in the class decleration in java
 *                            then the specific class said to be following the IS-A Relationship.
 *  HAS-A RelationShip : It also known Composition.An instance of another class has a referance to an instance of another class or instance of same class.  
 *  Aggregation :  It is a term which is used to refer one way relationship between two objects.Its represent HAS-A Relationship        
 *  Super Keyword : Using Super keyword we can access parent class constructor,instance variables & methods
 *                  
 */
public class JavaInheritance {
	
	/*
	 * A class that is derived from another classis called subclass/childclass/derivedclass.
	 * The class from which the subclass is derived is called superclass/parentclass/baseclass
	 */

	public static void main(String[] args) {
	
		MountainBicycle objMountainBicycle=new MountainBicycle(2,25,30,1);
		objMountainBicycle.setCadence(50); // call parent class method using child class object
		objMountainBicycle.setGear(2);
		objMountainBicycle.speedUp(65);
		objMountainBicycle.applayBreak(5);
		objMountainBicycle.setSeatHeight(2); // call child class method
		
		
		DirtBicycle objDirtBicycle=new DirtBicycle(2,25,30,1,60);
		objDirtBicycle.setCadence(50); // call parents parent class method
		objDirtBicycle.setGear(2);
		objDirtBicycle.speedUp(50);
		objDirtBicycle.applayBreak(5); 
		objDirtBicycle.setSeatHeight(2); // call parent class method
		objDirtBicycle.setGroundClearance(60); 
		
		
		GeneralBicycle objGeneralBicycle=new GeneralBicycle(2,25,2);
		objGeneralBicycle.setCadence(50); // call parent class method using child class object
		objGeneralBicycle.setGear(2);
		objGeneralBicycle.speedUp(65);
		objGeneralBicycle.applayBreak(5);
		objGeneralBicycle.setCarrageWidth(1);
		
		
		
		ChildrenBicycle objChildrenBicycle=new ChildrenBicycle(2,25,3);
		objChildrenBicycle.setCadence(50); // call parent class method using child class object
		objChildrenBicycle.setGear(2);
		objChildrenBicycle.speedUp(65);
		objChildrenBicycle.applayBreak(5);
		objChildrenBicycle.setHeight(2);
		
		//Has-A Relationship
		BicycleLight objBicycleLight=new BicycleLight();
		ChildrenBicycle objChildrenBicycle1=new ChildrenBicycle(2,25,3,objBicycleLight);
		objChildrenBicycle1.installBicycleLight.setFrontLight();
		objChildrenBicycle1.installBicycleLight.setBackLight();
		
		
		
	}//end main()

}// end class


/* Parent Class */
class Bicycle {
 
	//Bicycle class fields
	int cadence;
	int gear;
	int speed;
	
	public Bicycle(int startCadnce,int startSpeed,int startGear)
	{
		this.cadence=startCadnce;
		this.gear=startGear;
		this.speed=startSpeed;
		
	}// constructor 1
	
	
	public Bicycle(int startCadnce,int startSpeed)
	{
		this.cadence=startCadnce;
		this.speed=startSpeed;
	}// constructor 2
	
	void setCadence(int newValue) {
		this.cadence=newValue;
	}
	
	void setGear(int newValue) {
		this.gear=newValue;
	}
	
	void applayBreak(int decrementSpeed) {
		this.speed=decrementSpeed;
	}
	
	void speedUp(int incrementSpeed) {
		this.speed=incrementSpeed;
	}
	
}// end Bicycle 



/* Single Inheritance  - IS-A Relationship */

class MountainBicycle extends Bicycle{
	
	int seatHeight;
	
	public MountainBicycle(int startSeatHeight ,int startCadnce, int startSpeed,int startGear) {
		super(startCadnce, startSpeed,startGear); // call parent class constructor using super 
		this.seatHeight=startSeatHeight;
			
	} // constructor 1
	
	void setSeatHeight(int newValue) {
		this.seatHeight=newValue;
		//super.applayBreak(12);  // call parent class method using super keyword
	}

}//MountainBicycle




/* Multilevel Inheritance */

class DirtBicycle extends MountainBicycle {
	
	int groundClearance;

	public DirtBicycle(int startSeatHeight, int startCadnce, int startSpeed, int startGear,int startGroundClearance) {
		super(startSeatHeight, startCadnce, startSpeed, startGear); // call parent class constructor using super 
		this.groundClearance=startGroundClearance;
		
	}
	
	void setGroundClearance(int newValue) {
		this.groundClearance=newValue;
	}
	
		
}// DirtBicycle 




/* Heirarchical Inheritance : Parent have more than one child */

class GeneralBicycle extends Bicycle{

	int carrageWidth;
	
	public GeneralBicycle(int startCadnce, int startSpeed,int carrageWidth) {
		super(startCadnce, startSpeed); // call parent class constructor using super 
		this.carrageWidth=carrageWidth;
	}
	
	void setCarrageWidth(int newValue) {
		this.carrageWidth=newValue;
	}
		
}// GeneralBicycle


class ChildrenBicycle extends Bicycle{

	int height;
	public ChildrenBicycle(int startCadnce, int startSpeed,int height) {
		super(startCadnce, startSpeed); // call parent class constructor using super 
		this.height=height;
		}
	
	void setHeight( int newValue)
	{
		this.height=newValue;
	}
	
/* Has-A Relationship */
	BicycleLight installBicycleLight;
	public ChildrenBicycle(int startCadnce, int startSpeed,int height,BicycleLight light) {
		super(startCadnce, startSpeed); // call parent class constructor using super 
		this.height=height;
		this.installBicycleLight=light;
	}// constructor
		
}//ChildrenBicycle




class BicycleLight{
	
	void setFrontLight() {
		System.out.println("Install Front Light");
	}
	
	void setBackLight() {
		System.out.println("Install Back Light");
	}
}//BicycleLight























