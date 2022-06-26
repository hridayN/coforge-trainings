package coforgespringexamples;

public class Address {
	// Comment 1: Created this class with following properties
	private int dno;
	private String street;
	private String city;
	
	// Comment 2: Generated parameterless constructor
	public Address() {
		
	}
	
	// Comment 4: Generated parameterized constructor with class members
	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}
	
	// Comment 3: Generated getters and setters for the class members
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	// Comment 5: Generated overridden toString method, in order to avoid getting the hash when toString for this class is used
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}	
}
