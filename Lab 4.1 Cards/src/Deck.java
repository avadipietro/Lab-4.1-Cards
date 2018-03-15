import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> dealt;
	public Deck(String[] ranks, String[] suits, int[] values) {
		this.unDealt = new ArrayList<Card>();
		this.dealt = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				unDealt.add(new Card(ranks[i], suits[j], values[i]));
			}
		}
	}
	public boolean isEmpty() {
		return unDealt.size() == 0;
	}
	public int size() {
		return unDealt.size();
	}
	public Card deal() {
		unDealt[i];
		unDealt.remove(unDealt.size() - 1);
	}
}
