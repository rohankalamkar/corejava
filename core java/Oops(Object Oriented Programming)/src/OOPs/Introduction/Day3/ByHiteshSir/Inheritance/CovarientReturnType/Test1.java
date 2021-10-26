package OOPs.Introduction.Day3.ByHiteshSir.Inheritance.CovarientReturnType;

public class Test1 {
	public Company info() {
		Company c =new Company();
		Department d = new Department();
		Employee e = new Employee();
		//return c;
//		return d;
		return e;  // We can return Company, Department And Employee Object
		
	}
	
	public Department info1(){
		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();
		//return d;
		return e;    // We can return Department and Employee Object
	//	return c;    //We cannot return parent object(Company) from method info1()		
		
	}
	public Employee info2() {
		
		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();
		
//		return c; // We cannot return Company and Department from method info2()
//		return d;
		return e;
		
	}
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		Company c = t.info1();
		System.out.println(c.cname);
		
	}


}
