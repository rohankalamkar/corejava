package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByHiteshSir;

public class Department {
	
 public Employee setInfo(int eid,String name,String department,Employee e) {
	Employee es = new Employee();
	e.setEid(eid);
	e.setName(name);
	e.setDepartment(department);

	return e;
	
	 
 }

 public void getInfo(Employee e) {
	 Employee ex = new Employee();
	 
	 System.out.println("Employee Name : "+ e.getName());
	 System.out.println("Employee ID : "+ e.getEid());
	 System.out.println("Employee Department : "+ e.getDepartment());
	 System.out.println("------------------------------------------\n");
 }
	
	
}
