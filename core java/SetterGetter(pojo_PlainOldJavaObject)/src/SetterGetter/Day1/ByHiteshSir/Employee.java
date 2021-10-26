package SetterGetter.Day1.ByHiteshSir;



public class Employee {
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int id, String name, String address){

	System.out.println("Employee Details Addition : ");
	this.id = id;
	this.name= name;
	this.address = address;
	}
}

     class Company{
      public static void main (String args[]){
      Employee a1 = new Employee(1,"Rohan Kalamkar","At:- Pune");
      System.out.println("Id of Employee : "+a1.getId());
      System.out.println("Name of Employee : "+a1.getName());
      System.out.println("Address of Employee : "+a1.getAddress());




}


}
