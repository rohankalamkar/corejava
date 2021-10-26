package SecondaryReference.Day9.SecRefByHiteshSir;

public class Test {
	public static void main(String args[]){
		Address ad = new Address();
		ad.cityname="Pune";
		ad.areaname = "Karve Nagar";

		Student st = new Student();
		st.rollno = 12;
		st.name = "xyz";
		st.addr = ad;

		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.addr.cityname);
		System.out.println(st.addr.areaname);



		}


}
