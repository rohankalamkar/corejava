package FinalKeyword.ByHiteshSir;

public final class A {
	
     // public final int x ;   // Error : final variable must have to initialize
      final public int v = 50;
      public final int x = 10;   // It is non static field object 
      
     // int x = 20;  // Duplicate 
      int y ;  // It simple default global variable
      public static final int c = 100;
      int z = 30;
      
      public final void m1() {
    	  System.out.println("final m1 ------of final A");
      }
      
      public void m2() {
    System.out.println("m2------of final A");
      }
      
   
      
      public static void main(String[] args) {
    	  
    	  A a = new A();
    	  
    	//  m1();  // We cannot call it directly
    	  
    	  a.m1();
    	  a.m2();
    	 // System.out.println(x);    // error : cannot call non-static reference in static field
    	  System.out.println(a.x);
    	  System.out.println(a.y);
    	  System.out.println(a.z);
    	  System.out.println(a.c);
    	  //System.out.println(A.x);    // Error : We cannot call by making class reference
    	   	  
    	     	 // a.getClass(); It will comes in .class file after printing [System.out.println(a.x);]  this statement line 32
	}
	

}

//class B extends A {   // the type B cannot subclass the final A
	
	
	
	
	
//}
