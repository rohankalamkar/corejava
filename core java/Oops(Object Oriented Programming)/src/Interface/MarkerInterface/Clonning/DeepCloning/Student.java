package Interface.MarkerInterface.Clonning.DeepCloning;

public class Student  implements Cloneable{
	private String name;
	private int rollno;
	public Student() {
		System.out.println("Constr--------Student");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student Details : Name = "+name+" . Rollno = "+rollno;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
