package model;

public class Student {

	private int id;

	private String firstname;

	private String lastname;

	private String streetaddress;

	private String postcode;

	private String postoffice;

	public Student() {

		id = -1;

		firstname = "";

		lastname = "";

		streetaddress = "";

		postcode = "";

		postoffice = "";

	}

	public Student(int id, String firstname, String lastname, String streetaddress, String postcode,
			String postoffice) {

		this.id = id;

		this.firstname = firstname;

		this.lastname = lastname;

		this.streetaddress = streetaddress;

		this.postcode = postcode;

		this.postoffice = postoffice;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getFirstName() {

		return firstname;

	}

	public void setFirstName(String firstname) {

		this.firstname = firstname;

	}

	public String getLastName() {

		return lastname;

	}

	public void setLastName(String lastname) {

		this.lastname = lastname;

	}

	public String getStreetAdress() {

		return streetaddress;

	}

	public void setStreetAdress(String streetaddress) {

		this.streetaddress = streetaddress;

	}

	public String getPostCode() {

		return postcode;

	}

	public void setYear(String postcode) {

		this.postcode = postcode;

	}

	public String getPostOffice() {

		return postoffice;

	}

	public void setPostOffice(String postoffice) {

		this.postoffice = postoffice;

	}

	@Override

	public String toString() {

		return id + ", " + firstname + " " + lastname + ", " + streetaddress + ", " + postcode + " " + postoffice;

	}

}
