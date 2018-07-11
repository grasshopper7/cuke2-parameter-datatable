package dataobject;

public class Address {

	private String door;
	
	private String street;
	
	private String zip;

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [door=" + door + ", street=" + street + ", zip=" + zip + "]";
	}
	
	
}
