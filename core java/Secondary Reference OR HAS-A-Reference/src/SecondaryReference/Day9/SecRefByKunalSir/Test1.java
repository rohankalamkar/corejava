package SecondaryReference.Day9.SecRefByKunalSir;

public class Test1 {
	public static void main(String args[]){

		Address1 ad = new Address1("Wardha","Sevagram");

		Student1 st = new Student1(1,"Chetan Kalamkar",ad);
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.addr.cityname);
		System.out.println(st.addr.areaname);

}


}
