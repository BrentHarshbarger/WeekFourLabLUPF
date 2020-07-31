
public class Account {
	public static String name;
	public static int numAccounts = 0;

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Lab 4 Exercise 2
		// Brent Harshbarger

		// Create new instances of Account
		new Account("Corvette");
		new Account("Pinto");
		new Account("Accord");

		// Call method to get and print numAccounts
		Account.getNumAccounts();

	}

	// Define Account class
	public Account(String name) {
		Account.name = name;
		numAccounts++;
	}

	// Method to call and print the number of Accounts created
	public static int getNumAccounts() {

		System.out.print("The number of Accounts are " + numAccounts + ".");

		return numAccounts;

	}

}
