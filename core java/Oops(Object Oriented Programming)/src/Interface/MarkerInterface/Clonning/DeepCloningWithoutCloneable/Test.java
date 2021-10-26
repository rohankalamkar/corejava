package Interface.MarkerInterface.Clonning.DeepCloningWithoutCloneable;

public class Test {
	public static void main(String[] args) {
		
		// Deep Cloning in shallow Cloning
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("Rohan");
		System.out.println(e1);
		
		System.out.println("E1 : "+e1.getEid()+ "  "+e1.getEname() + "  "+e1.hashCode() );
		
		Employee e2 = e1.copy();
		e2.setEid(2);
		e2.setEname("Akhil");
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("E1 : "+e1.getEid()+ "  "+e1.getEname() + "  "+e1.hashCode() );
		System.out.println("E2 : "+e2.getEid()+"  "+e2.getEname() +  "  "+e2.hashCode() );
		
		Employee e3 = e1.copy();
		e3.setEid(3);
		e3.setEname("Nayan");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("E1 : "+e1.getEid()+ "  "+e1.getEname() + "  "+e1.hashCode() );
		System.out.println("E2 : "+e2.getEid()+"  "+e2.getEname() +  "  "+e2.hashCode() );
		System.out.println("E3 : "+e3.getEid()+ "  "+e3.getEname() + "  "+e3.hashCode() );
	
		
		
		
		
	}
	
	

}
