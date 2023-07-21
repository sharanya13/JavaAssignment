public class Address {
	private String area;
	private String city;
	private String state;
  private int houseNo;
	public Address() {}
	public Address(String area, String city, String state,int houseNo) {
		super();
    this.houseNo=houseNo;
		this.area = area;
		this.city = city;
		this.state = state;
	}

  public int getHouseNo()
  {
     return houseNo;
  }
  
  public void setHouseNo(int houseNo)
  {
    this.housNo=houseNo;
  }
  
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
  
	public String toString() {
		return "Address ["houseNo" + houseNo+"area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
}
