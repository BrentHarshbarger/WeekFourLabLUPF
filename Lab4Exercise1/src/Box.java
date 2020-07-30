
public class Box {
	// Required for the entire class of Box
	int size = 0;
	

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Lab 4 Exercise 1
		// Brent Harshbarger

		// --------------------------------------------------------------------------------------------------------------
		// The goal of this program is to pass a box size from main to the printBox for
		// printing to the screen
		// -------------------------------------------------------------------------------------------------------------


		Box box = new Box();

		box.size = 5; // Sets the rows and columns of the box.printBox
		
		box.printBox();
		
		System.out.println();
		box.printBox('c');
	

	}

	public void printBox() {
		// The outer loop prints the rows of the box
		for (int row = 1; row <= size; row++) {

			// The inner loop prints the columns in each row
			for (int column = 1; column <= size; column++) {
				System.out.print("*");
			}

			// This advances the line to print the next row
			System.out.println();

		}
	}
	
	public void printBox (char c) {
		
		
		// The outer loop prints the rows of the box
		for (int row = 1; row <= size; row++) {

			// The inner loop prints the columns in each row
			for (int column = 1; column <= size; column++) {
				System.out.print("c");
			}

			// This advances the line to print the next row
			System.out.println();

		}
	}
	
}