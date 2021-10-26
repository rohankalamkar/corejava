package SetterGetter.Day1.ByHiteshSir.SecondaryRef.UniversityExample;

public class College {
	private String cname;
	private int year;
	private University uni;
	
	public void setCname(String cname) {
		this.cname= cname;
	}
	public String getCname() {
		return cname;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setUni(University uni) {
		this.uni=uni;
	}
	public University getUni() {
		return uni;
	}

}
