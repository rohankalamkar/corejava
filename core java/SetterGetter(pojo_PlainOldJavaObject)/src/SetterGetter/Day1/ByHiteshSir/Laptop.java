package SetterGetter.Day1.ByHiteshSir;



public class Laptop {
	private String company;
	private String processor;
	private int price;
	private int ram;
	private int graphics;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getGraphics() {
		return graphics;
	}
	public void setGraphics(int graphics) {
		this.graphics = graphics;
	}
	
	public Laptop(String company,String processor,int ram,int graphics,int price){
	this.company=company;
	this.processor=processor;
	this.price=price;
	this.ram=ram;
	this.graphics=graphics;
	}
}
	
	class User{
		public static void main(String args[]){

		Laptop a = new Laptop("HP","i7",8,4,80000);
		System.out.println("Laptop Details : ");
		System.out.println("Company name of laptop : "+a.getCompany());
		System.out.println("Processor of laptop : "+a.getProcessor());
		System.out.println("Ram of laptop in GB : "+a.getRam());
		System.out.println("Graphics cards of laptop in GB : "+a.getGraphics());
		System.out.println("Price of laptop in Rs. : "+a.getPrice());
	

}
	}
