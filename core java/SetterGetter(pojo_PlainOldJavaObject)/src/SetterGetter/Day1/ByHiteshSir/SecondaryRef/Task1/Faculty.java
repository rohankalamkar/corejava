package SetterGetter.Day1.ByHiteshSir.SecondaryRef.Task1;

public class Faculty {
	private String fid;
	private String fname;
	private Course course;
	
	
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFid() {
		return fid;
	}
	public void setFname(String fname) {
		this.fname = fname;
		
	}
	public String getFname() {
		return fname;
	}
	public void setCourse(Course course) {
		this.course= course;
	}
	public Course getCourse() {
		return course;
	}
	

}
