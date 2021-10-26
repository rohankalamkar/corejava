package Constructor.Day8.byHiteshSir.Multipleclass;

public class Laptop {
	String company;
	String processor;
	int price;
	int ram;
	int graphics;

	public Laptop(String company,String processor,int ram,int graphics,int price){
	this.company=company;
	this.processor=processor;
	this.price=price;
	this.ram=ram;
	this.graphics=graphics;
	}
	public void details(){
	System.out.println("Laptop Details : ");
	System.out.println("Company name of laptop : "+this.company);
	System.out.println("Processor of laptop : "+this.processor);
	System.out.println("Ram of laptop in GB : "+this.ram);
	System.out.println("Graphics cards of laptop in GB : "+this.graphics);
	System.out.println("Price of laptop in Rs. : "+this.price);

	}

	}
	class User{
	public static void main(String args[]){

	Laptop a = new Laptop("HP","i7",8,4,80000);
	System.out.println("Laptop Details : ");
	System.out.println("Company name of laptop : "+a.company);
	System.out.println("Processor of laptop : "+a.processor);
	System.out.println("Ram of laptop in GB : "+a.ram);
	System.out.println("Graphics cards of laptop in GB : "+a.graphics);
	System.out.println("Price of laptop in Rs. : "+a.price);


	Laptop b = new Laptop("Lenovo", "i5",8,2,57000);
	b.details();
	}

}
