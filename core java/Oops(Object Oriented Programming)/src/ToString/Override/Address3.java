package ToString.Override;

public class Address3 {
	private String City;
	private int pincode;
	
	public void setCity(String city) {
		this.City = city;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public String getCity() {
		return City;
	}
	public int getPinCode() {
		return pincode;
	}
	
//	@Override
//	public String toString() {
//		return "Addresss : CityName = "+City+" , Pincode = "+pincode;
//	}
	
	@Override
	public String toString() {
		return "Address details : City Name = "+getCity()+" . Pincode = "+getPinCode();
	}
	
	

}
