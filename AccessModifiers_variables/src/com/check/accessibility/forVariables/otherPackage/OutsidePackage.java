package com.check.accessibility.forVariables.otherPackage;

import com.test.functionality.of.access.modifiers.AccessModifier;

public class OutsidePackage {
	

	public void OutsidePackage() {
		
		//public access modifiers in other package
	System.out.println("public static variable outside package: "+AccessModifier.publicStaticVar);
	
	AccessModifier acc=new AccessModifier();
	System.out.println("public instance variable outside package: "+acc.publicInstanceVar);
	
	
	/*
	//protected access modifier outside package
	System.out.println("protected static variable outside package: "+AccessModifier.protectedStaticVar);	
	AccessModifier acc=new AccessModifier();
	System.out.println("protected instance variable outside package: "+AccessModifier.protectedInstanceVar);
	*/
	
	//default access modifiers in other package
   // System.out.println("default non-static variable in same package same class is: " + acc.defaultInstanceVar);
   // System.out.println("default static variable in same package same class is: " + AccessModifier.defaultStaticVar);
    

  	//private access modifiers in other package //these are throwing an error as we cant access private variables except same package,same class 
    // System.out.println("private non-static variable in same package same class is: " + acc.privateVar);
    // System.out.println("private static variable in same package same class is: " + AccessModifier.r);
	}
	
	
}


/*note(outside package)
=>public Static variables are accessible via class name where as public Instance variables are accessible via object
=>but protected(static/non-static) default(static/non-static) and private(static/non-static) are not accessible. */