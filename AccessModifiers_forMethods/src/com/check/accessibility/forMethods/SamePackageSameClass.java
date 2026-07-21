package com.check.accessibility.forMethods;

public class SamePackageSameClass {

	//public static and instance methods 
	public static int add(int x,int y) {
		return x+y;
	}
	
	public int subtract(int m,int n) {
		return m-n;
	}
	
	
	//protected static and instance methods 
	protected static float multiply(float c,float d) {
		c=5.5f;d=10f;
		return c*d;
	}
	
	protected long division(long a,long b) {
		return a/b;
	}
	
	//default static and instance methods 
	static String defaultMethod() {
		return "Hello";
	}
	
	double modulo(double w,double z) {
		return w%z;
	}
	
	
	//private static and instance methods 
	private static int edit() {
		return 98;
	}
	
	private String name() {
		return "My name";
	}
	
	
	public void staticAndInstanceMethodsInInstanceMethod() {
		add(10,20);
		multiply(1.8f,20.3f);
		defaultMethod();
		edit();
		
		subtract(10,5);
		division(100,50);
		modulo(48,8);
		name();
		
		/*note---we can call both static and non-static methods directly inside non-static methods.*/
		
	}
	
	public static void main(String[] args) {
		
		//static methods
		System.out.println("public static method result: "+add(10,20));
		System.out.println("protected static method result: "+multiply(1.8f,20.3f));
		System.out.println("default static method result: "+defaultMethod());
		System.out.println("private static method result: "+edit());
		
		System.out.println("-------------------------------");
		//instance methods
		SamePackageSameClass s=new SamePackageSameClass();
		System.out.println("public non-static method result: "+s.subtract(10,5));
		System.out.println("protected non-static method result: "+s.division(100,50));
		System.out.println("default non-static method result: "+s.modulo(48,8));
		System.out.println("private non-static method result: "+s.name());	
		
		
		/*note: static methods can be called directly inside static methods 
		but instance methods can be called only through obj of the class in the static methods.*/
	}
}
