package Constructor.Day7.byHiteshSir;

public class College {
	public static void main(String args []){

		System.out.println("Main Start----");
		Student  s = new Student();

		System.out.println("Value of S student : " +s.rollno);

		Student s1 = new Student();
		s1.rollno = 50;

		System.out.println("Value of S1 student : " +s1.rollno);


		System.out.println("Main end----");
		}

}
