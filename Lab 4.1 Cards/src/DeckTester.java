
public class DeckTester {
	/*
	 * Challenge 3 DeckTester:
		Use the main method in the DeckTester Class to run tests while you are
		developing this lab. Make sure you test the full functionality.
		1. Build a deck of cards.
		2. Shuffle the cards.
		3. Deal out all the cards (for our purposes you can just print them out as you
		deal them.)
	 */
	public static void main(String args[]) {
		// public Deck(String[] ranks, String[] suits, int[] values)
		String[] ranks = new String[] {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
		String[] suits = new String[] {"SPADES", "HEARTS", "CLUBS", "DIAMONDS"};
		int[] values = new int[13];
		for (int i = 1; i <= 13; i++) {
			values[i - 1] = i;
		}
		Deck deck = new Deck(ranks, suits, values);
		deck.shuffle();
		for (int j = 0; j < 52; j++) {
			System.out.println(deck.deal().toString());
		}
	}
}
