package javaoop;

import javaintro.JavaArraysManuplation;

public class JavaAccessModifieres {

/*
	                                                    Access Levels
	##############################################################
     Modifier                              Class                Package             SubClass               Project
     -----------------------------------------------------------------------------------------------------------------
     public                                 Yes                     Yes                    Yes                     Yes
     
     protected                            Yes                      Yes                   Yes                      No
     
     private                                Yes                      No                     No                       No
     
     default                               Yes                      Yes                     No                       No

    ##############################################################
    
    -> First Column indicates types of Access Modifieres,There are four type of access modifiers
    -> Second Column indicate whether the class itself has access to members
    -> Third Column indicate whether classes in same pakage as the class have access to the members
    -> Fourth Column indicate whether subclasses of the class declared outside this package have access to the members
    -> Fitfth Column indicates whether in project all classess have access to member

*/
	
	int x=10; // default Access Modifier
	private int y=20; // private Access Modifier
	
	
	void acessDefaultAccessModifier() // default Access Modifier
	{
		System.out.println("Default access modifier can be access in class : "+x);
		
		// acessDefaultAccessModifier(); // default access modifier method
	}
	
	private void acessPrivateModifier() { // private Access Modifier
		System.out.println("Private access modifier can be access in class : "+y);
		accessProtectedModifer(); // access protected modifier within class
	}
	
	protected void accessProtectedModifer() { // protected Access Modifier
		System.out.println("Protected access modifier method...");
	}
	
	
	public static void main(String[] args) {
	
		JavaAccessModifieres obj=new JavaAccessModifieres();
		obj.acessDefaultAccessModifier(); //call default access modifier method within class
		obj.acessPrivateModifier(); //call private access modifier method within class
		JavaMethodOverloading objJavaMethodOverloading=new JavaMethodOverloading();
		objJavaMethodOverloading.addition();  //call default access modifier method form within package
		JavaArraysManuplation objJavaArraysManuplation=new JavaArraysManuplation();
		// objJavaArraysManuplation.asListArrays(); // default access modifier method from outside package its not accessable
		 // objJavaArraysManuplation.asListArrays(); // protected access modifer not accesable outside package directly
		ImplimentationTemperatureConversion obj2=new ImplimentationTemperatureConversion();
		// obj2.acessFiledsFromAbstractClass();  //private modifier not access outside class
		obj2.protectedMethodFrom_ImplimentationTemperatureConversion();
		
		

	}//end main()

}//JavaAccessModifieres



class ArrayManuplationSubClass extends JavaArraysManuplation{
	
	void accessProtectedFromOutsidePackage() {
	super.asListArrays(); // protected member access outside package
	}
	
	} 
	
	
