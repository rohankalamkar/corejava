package Encapsulation.Day1.ByKunalSir.Protected.OthrPkg;
import Encapsulation.Day1.ByKunalSir.Protected.*;



public class D extends A{
    // With Different Packages by extending
	
	public void m3() {
		  System.out.println(x);    // 10 public can access directly
		//System.out.println(y);    // Error : Default value cannot be acces outside the packages
		  System.out.println(z);    // 40 protected can access directly
		  
		  A a = new A();   // Parent class Object
		  System.out.println(a.x);  // 10 public can acces by creating object 
		  //System.out.println(a.y);  //Error : The field A.y is not visible ..It means we cannot access default outside the package
		 // System.out.println(a.z);  //Error : The field A.z is not visible  .. We calling it Through Parent class Object
		  
		  D a1 = new D();
		  System.out.println(a1.x);  // 10 
		  //System.out.println(a1.y);  // Error : The field A.y is not visible
		  System.out.println(a1.z);  // 40   .. It means Protected can only access by child class object.
		  
	
	}
	
	
}
