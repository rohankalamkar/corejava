package CollectionFrameWorkSorting.ByHiteshSir;

public class Test_Mx {
	public static void main(String[] args) {
		
		Student_Mx s1 = new Student_Mx(16, "Rohan", 56);
		Student_Mx s2 = new Student_Mx(18, "Kapil", 75);
		Student_Mx s3 = new Student_Mx(8, "Nayan", 65);
		Student_Mx s4 = new Student_Mx(26,"Akhil",72);
		
		Student_Mx [] sarray = {s1,s2,s3,s4};
		
		Student_Mx maxMarks = sarray[0];
		// For Maximum Marks Student
		for(int i = 0;i<sarray.length;i++) {
			if(sarray[i].getMarks()> maxMarks.getMarks()) {
				maxMarks = sarray[i];
			}
		}
		
		System.out.println("Topper is : ");
		System.out.println(maxMarks);
		
		System.out.println("----------------------------------------------");
		
		// For Minimum Marks Student 
		
		for(int i=0 ; i<sarray.length;i++) {
			
			if(sarray[i].getMarks()<maxMarks.getMarks()) {
				maxMarks = sarray[i];
			}
		}
		
		System.out.println("Minimum Marks Student : ");
		System.out.println(maxMarks);
		
		
	}

}
