package javaoop;

public enum Planet {
	MERCURY (3.303e+23 , 2.4397e6),
	VENUS (4.869e+24 , 6.0518e6),
	EARTH (5.976e+24 , 6.37814e6),
	MARS (6.421e+23 , 3.3972e6),
	JUPITER (1.9e+27 , 7.1492e7),
	NEPTUNE (1.024e+26 , 2.4746e7);
	private final double  mass ;  // in kilograms
	private final double radius; // in meters
	
	Planet(double mass,double radius){
		this.mass=mass;
		this.radius=radius;
	}
	
	private double mass() {return mass;}
	private double radius() {return radius;}
	
	// universal gravitational constant
	public static final double G=6.67300E-11;
	
	double surfaceGravity() {
		return G*mass/(radius*radius);
	}
	
	double surfaceWeight( double otherMass) {
		return otherMass*surfaceGravity();
	}
	
	
	public static void main(String[] arg) {
		
		if(arg.length!=1) {
			System.err.println("Usage : Java Planet<earth_weight>");
			System.exit(-1);
		}
		
		double earthWeight=Double.parseDouble(arg[0]);
		double mass=earthWeight/EARTH.surfaceGravity();
		for(Planet p : Planet.values())
		{
			System.out.printf("Your weight on %s is %f%n",p,p.surfaceWeight(mass));
		}
	}// end main()
	

}// enum Planet
