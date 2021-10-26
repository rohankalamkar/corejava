package OOPs.Introduction.Day3.ByHiteshSir.TypeCasting;

public class Test {
	
	public Company info() {
		Company c = new Company();
		Department d = new Department();
		d.dept="fc";
		Employee e = new Employee();
		
		
		return c ;
	}
	public Company info1() {
		Company c = new Company();
		Department d = new Department();
		d.dept="fc";
		Employee e = new Employee();
		e.ename2="Nayan";
		
		
		return d ;
	}
	public Company info2() {
		Company c = new Company();
		Department d = new Department();
		d.dept="fc";
		Employee e = new Employee();
		e.ename2="Nayan";
		
		
		return e ;
	}
	
	public Department info3() {
		Company c = new Company();
		Department d = new Department();
		d.dept="fc";
		Employee e = new Employee();
		e.ename2="Nayan";
		
		
		return d ;
	}
	

	
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Company c = t.info();
		System.out.println(c.cname);  // TCS
		
		
//		Department d =(Department)t.info(); // Error: Class Cast Exception  (DownCating)(Parent  c cannot acess child d,e content
		                                    // But Child can access parent content
		//(You cannot call department variable and methods after returning Company Variable)
		// It will Compile succesfully according Casting Rule but during printing it will show Error : Class Cast Exception
		
		
//		System.out.println(d.dept);         // Error: Class Cast Exception  
//		d.m1();
//		Employee e =(Employee) t.info();   // Error: Class Cast Exception    (DownCasting)

//		Department d1 =(Department)t.info1(); (DownCasting)  
//		System.out.println(d1.dept);  // fc      
//		d1.m1(); // m1-------of Department         
//		Employee e1  =(Employee) t.info1();   // Error: Class Cast Exception  (DownCasting)
//		System.out.println(e1.Address);    // Error: Class Cast Exception
		
//		Department d2 =(Department)t.info2(); (Downcasting) 
//		System.out.println(d2.dept);  // HR       
//		d2.m1(); // m1----------Employee     
//		Employee e2  =(Employee) t.info2();   (Downcasting) 
//		System.out.println(e2.Address);    //Pune        
//		e2.m2();   // m2-------of Department       (Downcasting) 
		
		
		Department d3 =t.info3();     
		System.out.println(d3.dept);  // fc     
		d3.m1(); // m1-------of Department
		Employee e3  =(Employee) t.info3();  // Error: Class Cast Exception (DownCasting) 
		System.out.println(e3.Address);    // Error: Class Cast Exception 
		e3.m1();   // Error: Class Cast Exception 
		Company c1 = t.info3();   // AutoUpcasting
		
		
		
	}

}
