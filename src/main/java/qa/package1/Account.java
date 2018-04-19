package qa.package1;

public class Account {

	public static void main(String[] args) {

		Account person1 = new Account("Marcell", "Illes", 001);

		Service s = new Service();
		s.addCustomer(person1);

	}

	private String customerName;
	private String customerLastName;
	private int customerAccountNumber;

	public Account(String firstName, String lastName, int accountNumber) {

		this.customerName = firstName;
		this.customerLastName = lastName;
		this.customerAccountNumber = accountNumber;

	}
}