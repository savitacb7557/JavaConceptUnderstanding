package com.check.accessibility.OtherPackage;

import com.check.accessibility.forMethods.SamePackageSameClass;

public class OutsidePackageWithoutSubClass {

	public void test() {
		//static methods 
		System.out.println("public static method result: "+SamePackageSameClass.add(10,20));
		//System.out.println("protected static method result: "+SamePackageSameClass.multiply(1.8f,20.3f));
		//System.out.println("default static method result: "+SamePackageSameClass.defaultMethod());
		//System.out.println("private static method result: "+SamePackageSameClass.edit()); --as this is private method, we cant access it except same package,same class
		
		System.out.println("-------------------------------");
		//instance methods
		SamePackageSameClass s=new SamePackageSameClass();
		System.out.println("public non-static method result: "+s.subtract(10,5));
		//System.out.println("protected non-static method result: "+division(100,50));
		//System.out.println("default non-static method result: "+s.modulo(48,8));
		//System.out.println("private non-static method result: "+s.name());
		
		/*note
=>public Static methods are accessible through class name where as public Instance methods are accessible through object of the class.
 =>protected Static methods are not accessible in outside package without subclass that is Protected methods are designed for inheritance — subclasses can access them even outside the package, but unrelated classes cannot.
 =>but default(static/non-static) are not accessible in other package even though with/without subclass that is because of the reason "Encapsulation at package level".and private(static/non-static) are not accessible  in other package even though with/without subclass that is because of the reason "Encapsulation at class level".
 */
	}
}
