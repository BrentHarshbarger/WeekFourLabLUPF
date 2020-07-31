import java.util.Random;

public class Card {

	public static void main(String[] args) {
		// Lewis University - Programming Foundations Lab 4 Exercise 3
		// Brent Harshbarger

		Random num = new Random(); // New random number

		// Array of face cards
		String faces[] = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };

		// Array of suits
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

		// Initializes face cards
		int faceCard1 = 0, faceCard2 = 0, faceCard3 = 0, faceCard4 = 0, faceCard5 = 0;

		// Initializes suits for cards
		int suitsCard1 = 0, suitsCard2 = 0, suitsCard3 = 0, suitsCard4 = 0, suitsCard5 = 0;

		// Creates a random number for a face card and a suit. Prints the string based
		// on index of the random number for each card
		faceCard1 = num.nextInt(13);
		suitsCard1 = num.nextInt(4);

		System.out.print(faces[faceCard1] + " of " + suits[suitsCard1] + ", ");

		faceCard2 = num.nextInt(13);
		suitsCard2 = num.nextInt(4);

		System.out.print(faces[faceCard2] + " of " + suits[suitsCard2] + ", ");

		faceCard3 = num.nextInt(13);
		suitsCard3 = num.nextInt(4);

		System.out.print(faces[faceCard3] + " of " + suits[suitsCard3] + ", ");

		faceCard4 = num.nextInt(13);
		suitsCard4 = num.nextInt(4);

		System.out.print(faces[faceCard4] + " of " + suits[suitsCard4] + ", ");

		faceCard5 = num.nextInt(13);
		suitsCard5 = num.nextInt(4);

		System.out.print(faces[faceCard5] + " of " + suits[suitsCard5] + ".");
	}

}
