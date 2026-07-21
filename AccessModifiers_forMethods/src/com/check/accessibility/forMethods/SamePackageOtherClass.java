package com.check.accessibility.forMethods;

public class SamePackageOtherClass {

	public static void checkInstanceMethodsInOtherClassOfSamePackage() {
		//static methods 
		System.out.println("public static method result: "+SamePackageSameClass.add(10,20));
		System.out.println("protected static method result: "+SamePackageSameClass.multiply(1.8f,20.3f));
		System.out.println("default static method result: "+SamePackageSameClass.defaultMethod());
		//System.out.println("private static method result: "+SamePackageSameClass.edit()); --as this is private method, we cant access it except same package,same class
		
		System.out.println("-------------------------------");
		//instance methods
		SamePackageSameClass s=new SamePackageSameClass();
		System.out.println("public non-static method result: "+s.subtract(10,5));
		System.out.println("protected non-static method result: "+s.division(100,50));
		System.out.println("default non-static method result: "+s.modulo(48,8));
		//System.out.println("private non-static method result: "+s.name());--as this is private method, we cant access it except same package,same class	
	
/*note:	
	inside same package,other class static/instace methods, we can access same package same class public/protected/default static methods through the class name where as  non-static methods through the class obj.
	and we can't access private methods*/
	}
}
