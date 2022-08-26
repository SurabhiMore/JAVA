package javaoop;

public class JavaInterfaces {
	/*
	 * Interface have abstract methods & by default its public modifier
	 * Interface have default,static & private method with body : java 8 - introduced default & static method, java 9 - introduced private method
	 * Interface support multiple inheritance
	 * It can be used to achive loose coupling
	 * Methods declared inside interface are implicitly public and abstract
	 * Variables declared inside interface are implicitly public,static & final
	 * Interfaces also support nested interface
	 * Interface can not initiate (can not create object)
	 * Inheritance of interfaces use 'extends' keyword
	 * To implement interface in class use 'implements' keyword
	 */
	
	public static void main(String[] args) {
		
		Vehicle obj=new Vehicle();
		obj.move();
		
		Tyre tr=new Tyre();
		System.out.println(tr.isMoveable());
		System.out.println(tr.isRollable());
		tr.move();
	}// main()

}// end JavaInterfaces


interface Moveable{
	int AVG_SPEED=40;
	void move();
	boolean isMoveable();
	
} // interface Moveable

class Vehicle implements Moveable{
	public void move() {
		System.out.println("Average speed is  "+AVG_SPEED);
	}//move()
	
	public boolean isMoveable() {
		return true;
	}
} // end Vehicle


/* Interfaces support Multiple Inheritance */

interface Rollable{
	boolean isRollable();
}//interface Rollable

class Tyre implements Moveable,Rollable{
	
	public void move() {
		System.out.println("Average speed is  "+AVG_SPEED);
	}//move()
	
	public boolean isMoveable() {
		return true;
	}
	
	public boolean isRollable() {
		return true;
	}
	
}

