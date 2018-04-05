//Ava DiPietro 4/5/18
public class DeckTester {

	public static void main(String args[]) {
		
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
