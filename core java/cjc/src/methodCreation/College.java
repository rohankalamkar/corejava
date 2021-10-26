package methodCreation;

public class College {
	
	public static void main(String [] args){
		Student s1 = new Student();
		s1.rollno = 001;
		s1.name = "Raj";
		s1.read();
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println("-----------------");


		Student s2 = new Student();

		s2.rollno=2;
		s2.name = "Nikhil";
		s2.read();

		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println("-----------------");


		Student s3= new Student();

		s3.read();
		System.out.println(s3.rollno);
		System.out.println(s3.name);



		}

}
