package methodCreation;

public class showroom {
	public static void main(String[] args) {
		car i10 = new car();
		i10.price=700000;
		i10.color="Navy Blue";
		i10.brand="Hyundai";
		i10.model="i10";
		i10.mileage=17.49f;
		i10.start();
		System.out.println("Brand of car is : "+i10.brand);
		System.out.println("Model is : "+i10.model);
		System.out.println("Price of car is : "+i10.price);
		System.out.println("Color of your car model is : "+i10.color);
		System.out.println("Mileage of your car model in kmpl is : "+i10.mileage);

		System.out.println("---------------------------------");
		car swift = new car();
		swift.price = 600000;
		swift.color="Red";
		swift.brand = "Maruti";
		swift.model = "swift DZire";
		swift.mileage = 12.25f;
		System.out.println(swift.brand);
		System.out.println(swift.model);
		System.out.println(swift.price);
		System.out.println(swift.color);
		System.out.println(swift.mileage);


		}

	}


