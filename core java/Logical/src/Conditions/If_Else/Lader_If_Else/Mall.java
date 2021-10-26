package Conditions.If_Else.Lader_If_Else;

public class Mall {
	double Price;
	public double discount(double bill) {
//		this.Price = bill;
		System.out.println("Your Bill is : "+bill+" INR");
		
		if(bill <= 1000) {
			this.Price = bill;
			System.out.println("You are not Applicable for Discount because Your Total Bill is Below or Equal to 1000 INR");
			//System.out.println("Your Final Price is  : "+bill+" INR");
		}
		else if(bill > 1000) {
			System.out.println("Your Bill is above 1000 INR");
			System.out.println("Congrats! You are applicable for discount of INR 200.");
			this.Price = bill - 200;
			}
		return this.Price;
	}

	
	
	public static void main(String[] args) {
		Mall m = new Mall();
		
		
		
		double prod1 = 35;
		double prod2 = 70;
		double prod3 = 42;
		double prod4 = 558;
		double prod5 = 189;
		
		
		double bill = prod1 + prod2 +prod3 + prod4 + prod5;
		
		double v = m.discount(bill);
		
		System.out.println("Your Have To Pay Now : "+v + " INR");
		
		
		
	}

}
