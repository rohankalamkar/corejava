package methodCreation;

public class customer {
	public static void main(String []args){

		pen ab = new pen();
		ab.name="Raynolds";
		ab.type="Gel pen";
		ab.ink="Blue";
		ab.price=10;
		ab.start();
		System.out.println(ab.name);
		System.out.println(ab.type);
		System.out.println(ab.ink);
		System.out.println(ab.price);
		System.out.println("-------------------------");

		pen cl = new pen();
		cl.name="Cello";
		cl.type="Ball Pen";
		cl.ink="Black";
		cl.price=10;
		cl.start();
		System.out.println(cl.name);
		System.out.println(cl.type);
		System.out.println(cl.ink);
		System.out.println(cl.price);

		}
}
