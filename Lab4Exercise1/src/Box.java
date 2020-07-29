
public class Box {
		// Required for the entire class of Box
		static int size = 0;
		static char alt2 = 'c';
		static char alt = '*';
		
		public static void main(String[] args) {
			// Lewis University - Programming Fundamentals Lab 4 Exercise 1
			// Brent Harshbarger

			// --------------------------------------------------------------------------------------------------------------
			// The goal of this program is to pass a box size from main to the printBox for
			// printing to the screen
			// -------------------------------------------------------------------------------------------------------------

			Box box = new Box();
			Box.size = 5; // Sets the rows and columns of the box.printBox
			box.printBox(size, alt, alt2);
		
		
		
		
		}

		public void printBox(int size, char alt, char alt2) {
		
			
			// The outer loop prints the rows of the box
			for (int row = 1; row <= size; row++) {

				// The inner loop prints the columns in each row
				for (int column = 1; column <= size; column++) {
					
					System.out.print(alt);
					
				}

				// This advances the line to print the next row
				System.out.println();

			}
			for (int row = 1; row <= size; row++) {

				// The inner loop prints the columns in each row
				for (int column = 1; column <= size; column++) {
					
					System.out.print(alt2);
					
				}

				// This advances the line to print the next row
				System.out.println();

			}
		} 
}
