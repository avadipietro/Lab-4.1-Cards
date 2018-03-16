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
		if (unDealt.size() == 0) {
			Card card = unDealt.get(unDealt.size() - 1);
			dealt.add(card);
			unDealt.remove(unDealt.size() - 1); //try replacing with card
			return card;
		}
		return null;
	}
	public void shuffle() {
		
	}
	public void swap(int x, int y) {
		Card c = unDealt.get(0);
		unDealt.set(0, c);
		unDealt.set(index, element);
	}
}
