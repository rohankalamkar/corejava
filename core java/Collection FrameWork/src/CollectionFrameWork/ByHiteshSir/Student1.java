package CollectionFrameWork.ByHiteshSir;

public class Student1 {
	private int rollno;
	private String name;
	
	public Student1(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
		
	}
	@Override
	public String toString() {
		
		return "Student Info : Roll no : "+rollno+" , Name : "+name;
	}
	
	

}
