package facegardens;

public class Customer {
	
		
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static int registerID=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	
	

	
	 void register(String name, String address, String contactNumber, String email, String proofType,
				String proofID) {
			System.out.println(getName());
			System.out.println(getAddress());
			System.out.println(getContactNumber());
			System.out.println(getEmail());
			System.out.println(getProofType());
			System.out.println(getProofID());
			System.out.println("Thanks for registering "+this.name+",your registerID is "+ ++registerID);
			}
}
