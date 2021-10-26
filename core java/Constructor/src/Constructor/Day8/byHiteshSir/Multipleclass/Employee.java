package Constructor.Day8.byHiteshSir.Multipleclass;

public class Employee {
	int id;
	String name;
	String address;
	public Employee(int id, String name, String address){

	System.out.println("Employee Details Addition : ");
	this.id = id;
	this.name= name;
	this.address = address;
	}

	public void details(){

	System.out.println("Id of Employee : "+this.id);
	System.out.println("Name of Employee : "+this.name);
	System.out.println("Address of Employee : "+this.address);

	}

	}

	class Company{
	public static void main (String args[]){
	Employee a1 = new Employee(1,"Rohan Kalamkar","At:- Pune");
	System.out.println("Id of Employee : "+a1.id);
	System.out.println("Name of Employee : "+a1.name);
	System.out.println("Address of Employee : "+a1.address);


	Employee a2 = new Employee(2,"Nayan Sawai","At Wardha");
	a2.details();

	Employee a3 = new Employee(3, "Akhil Kalamkar","At Nagpur");
	a3.details();


	}


}
