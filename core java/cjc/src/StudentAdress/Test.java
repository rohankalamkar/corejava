package StudentAdress;

public class Test {
public static void main(String[] args) {
	Address ad = new Address("pune", "Akurdi");
	Student st = new Student(2,"Kalamkar",ad);
	System.out.println("Roll Number : "+st.rollno);
	System.out.println("Name is : "+st.name);
	System.out.println("City Name is : "+st.addr.cityname);
	System.out.println("Area Name is : "+st.addr.areaname);
	System.out.println("-------------------------------");

Address a = new Address("Pune","Rahatni");
Student s = new Student(5,"Sawai",a);
s.details();



}
}
