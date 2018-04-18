package qa.package1;

public class Account {

	public static void main(String[] args) {
		
	}
	private String customerName;
	private String customerLastName;
	private int customerAccountNumber;
	private int customerID;
	
	public Account(int id, String firstName, String lastName, int accountNumber) {
		
		this.customerID = id;
		this.customerName = firstName;
		this.customerLastName = lastName;
		this.customerAccountNumber = accountNumber;
		
	}

	
}



/*
An account class with the fields firstName, lastName, accountNumber
A service class (The class where the functionality of adding and retrieving happens)
Any other classes that may be required
*/