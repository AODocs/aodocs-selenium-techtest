package entities;

public class ProspectDetails {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String companyName;
	private String compagnySize;
	private String country;
	
	//constructors
	public ProspectDetails(String firstName, String lastName, String email, String phoneNumber, String companyName,
			String compagnySize, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
		this.compagnySize = compagnySize;
		this.country = country;
	}
	public ProspectDetails(String firstName, String lastName, String email, String compagnySize) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.compagnySize = compagnySize;
	}
	
	//getters/setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompagnySize() {
		return compagnySize;
	}
	public void setCompagnySize(String compagnySize) {
		this.compagnySize = compagnySize;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}

