package com.test.functionality.of.access.modifiers;

public class WithinPackageOutsideClass{
	
	public void accessCheck() {
	
	//public access modifiers in same package, other class
	System.out.println("public static variable inside same package outside class: "+AccessModifier.publicStaticVar);		
		AccessModifier acc=new AccessModifier();
	System.out.println("public instance variable inside same package outside class: "+acc.publicInstanceVar);
	
	
	System.out.println("protected static variable inside package other class: "+AccessModifier.protectedStaticVar);
	System.out.println("protected instance variable inside package other class: "+acc.protectedInstanceVar);
     
 	//default access modifiers in same package, other class
	  System.out.println("default static variable in same package same class is: " + AccessModifier.defaultStaticVar);
     System.out.println("default non-static variable in same package same class is: " + acc.defaultInstanceVar);
   
     
  	//private access modifiers in same package, other class //these are throwing an error as we cant access private variables except same package,same class 
    // System.out.println("private non-static variable in same package same class is: " + acc.privateVar);
    // System.out.println("private static variable in same package same class is: " + AccessModifier.r);
     
     
     
	}
}

/*note(same package,outside class)
 =>the public/protected/default static variables are accessible through class name.
 where as,
 =>public/protected/default non-static variables are accessible through object of the class.
 =>but, private static/non-static variables are not accessible outside the class that is because of the reason "Encapsulation at class level".
 */