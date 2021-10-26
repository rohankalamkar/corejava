package Constructor.Day8.byHiteshSir.Multipleclass;

public class MultiClass {
	int rollno;
	String name;
	public MultiClass(int rollno,String name){
	this.rollno = rollno;
	this.name = name;
	}

	}


	class College1{
	public static void main(String args[]){
	MultiClass s = new MultiClass(1,"Abc");
	System.out.println(s.rollno);
	System.out.println(s.name);

	}
	

}
