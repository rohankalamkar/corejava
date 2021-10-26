package Constructor.Day8.byHiteshSir.Multipleclass;

public class Customer {
	String name;
	int Sugar ;
	String Salt;
	int Rice;
	String typeofRice;

	public Customer(String name,int Sugar,String Salt,String typeofRice,int Rice){

	this.name=name;
	this.Sugar = Sugar;
	this.Salt= Salt;
	this.typeofRice=typeofRice;
	this.Rice= Rice;

	}

	public void details(){
	System.out.println("Customer name : "+this.name);
	System.out.println("Sugar Required in Kg : "+this.Sugar );
	System.out.println("Salt name : "+this.Salt);
	System.out.println("Name of Rice : "+this.typeofRice);
	System.out.println("Rice required in Kg : "+this.Rice);

	}
	}

	class Dealer{
	public static void main(String args[]){
	Customer a = new Customer("Rohan Kalamkar",5,"Tata","Basmati",10);
	System.out.println("Customer name : "+a.name);
	System.out.println("Sugar Required in Kg : "+a.Sugar );
	System.out.println("Salt name : "+a.Salt);
	System.out.println("Name of Rice : "+a.typeofRice);
	System.out.println("Rice required in Kg : "+a.Rice);


	Customer b = new Customer("Akhil Kalamkar", 2, "Patanjali","Kolam", 3);
	b.details();




	}

}
