package Constructor.Day8.byKunalSir;

public class Test1 {
	public static void main(String args[]){

		Student s1 = new Student(1,"Rohan");
		Student s2 = new Student(2,"Nayan");

		System.out.println("Candidate RollNo : "+s1.rollno);
		System.out.println("Candidate Name : "+s1.name);

		System.out.println("Candidate RollNo : "+s2.rollno);
		System.out.println("Candidate Name : "+s2.name);

		}

}
