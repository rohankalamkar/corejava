package Encapsulation.Day1.ByKunalSir.Protected.OthrPkg;

public class E extends D {
	
	public void m4() {
		D d = new D();
		System.out.println(x);
		//System.out.println(y);  // Default cannot be access outside the packages
		System.out.println(z);  // Yes we call z by its child class D
		//System.out.println(d.z);  // Error :The field A.z is not visible, Error : Here child is E now and D is parent
		
		E e = new E();
		System.out.println(x);  // 10
		//System.out.println(y); // Default cannot be access outside the packages
		System.out.println(z);  // 40 yes We call z  by child(E) of child class(E) 
		System.out.println(e.z); // 40 yes. Here child is D
		
		D d1 = new E();
		System.out.println(d1.x);
		//System.out.println(d1.z);   // Error : We cannot protected variable call through parent class Object
		System.out.println(z);   //  We can call it directly like public. 
		                         //  But when we want to call through Object. Object class must be child not an parent
		                         
		
	}

}
