package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Address1 {
	private String cityname;
	private String areaname;


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setAreaname(String areaname) {
		this.areaname =areaname;
	}
	public String getAreaname() {
		return areaname;
	}
	public Address1(String cityname,String areaname) {
		this.cityname = cityname;
		this.areaname = areaname;
		
	}

}
