package com.test.functionality.of.access.modifiers;

public class AccessModifier {

	//public access modifiers
    public int publicInstanceVar = 1;
    public static int publicStaticVar=10;
    
    //protected access modifiers
    protected int protectedInstanceVar = 2;
    protected static float protectedStaticVar=5.5f;
    
    
    //default access modifiers
        int defaultInstanceVar = 3;
        static long  defaultStaticVar=20;
        
   // private access modifiers
        private int privateInstanceVar = 4;
        private static int privateStaticVar=25;

    public void showVars() {
        System.out.println("Public non-static variable in same package same class is: " + publicInstanceVar);
        System.out.println("public static variable in same package same class is: " + publicStaticVar);
        
        System.out.println("------------------");

        System.out.println("Protected non-static variable in same package same class is: "+protectedInstanceVar);
        System.out.println("Protected static variable in same package same class is: " + protectedStaticVar);
   
        System.out.println("------------------");
        
        System.out.println("default non-static variable in same package same class is: "+defaultInstanceVar);
        System.out.println("default static variable in same package same class is: " + defaultStaticVar);
        
        System.out.println("------------------");
        
        System.out.println("private non-static variable in same package same class is: "+privateInstanceVar);
        System.out.println("private static variable in same package same class is: " + privateStaticVar);
        
    }
    
    public static void main(String[] args) {
    	AccessModifier acc=new AccessModifier();
    	acc.showVars();
    }

}


/*note(same package, same class)
 public/protected/default/private variables(static and non-static/instance) are directly accessible. */
 
