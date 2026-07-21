package com.check.accessibility.forVariables.otherPackage;

import com.test.functionality.of.access.modifiers.AccessModifier;

public class OutsidePackageBySubClass extends AccessModifier{

	public void OutsidePackageBySubClass() {

	//public access modifiers in other package by subclass
		System.out.println("public static variable outside package by subclass: "+AccessModifier.publicStaticVar);
		
		AccessModifier acc=new AccessModifier();
	System.out.println("public instance variable outside package by subclass: "+acc.publicInstanceVar);	

	
	
	//protected access modifiers in outside package by subclass
     System.out.println("Protected instance variable in outside package by sub class is: " + protectedInstanceVar);
     System.out.println("Protected static variable in same package same class is: " + AccessModifier.protectedStaticVar);
     
 	//default access modifiers in outside package by  subclass
     //System.out.println("default non-static variable in same package same class is: " + acc.defaultInstanceVar);
    // System.out.println("default static variable in same package same class is: " + AccessModifier.defaultStaticVar);
     
  	//private access modifiers in outside package by subclass //these are throwing an error as we cant access private variables except same package,same class 
    // System.out.println("private non-static variable in same package same class is: " + acc.privateVar);
    // System.out.println("private static variable in same package same class is: " + AccessModifier.r);
}
}

/*note(outside package,by subclass)
 =>public Static variables are accessible through class name where as Instance variables are accessible through object of the class.
 =>protected Static variables are accessible through class name where as Instance variables are accessible directly.
 =>but default(static/non-static) that is because of the reason "Encapsulation at package level".and private(static/non-static) are not accessible that is because of the reason "Encapsulation at class level".*/
