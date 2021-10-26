package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByHiteshSir;

public class Company {
	public static void main(String[] args) {
		Employee e = new Employee();
		Department d = new Department();
		d.setInfo(1, "Rohan Kalamkar", "R&D",e);
		d.getInfo(e);
		
		Employee e1 = new Employee();
		
		d.setInfo(2, "Shubham Satarkar", "Marketing", e1);
		d.getInfo(e1);
		
		
	}

}