//Ava DiPietro 4/5/18
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
		if (unDealt.size() != 0) {
			Card card = unDealt.get(unDealt.size() - 1);
			dealt.add(card);
			unDealt.remove(unDealt.size() - 1); //try replacing with card
			return card;
		}
		return null;
	}
	public void shuffle() {
		if (dealt.size() > 0) {
			for (int i = dealt.size() - 1; i >= 0; i--) {
				Card card = dealt.get(i);
				unDealt.add(card);
				dealt.remove(i);
			}
		}
		for (int k = 51; k > 0; k--) {
			int r = (int)(Math.random() * (k + 1));
			swap(k, r);
		}
	}
	public void swap(int x, int y) {
		Card xx = unDealt.get(x);
		Card yy = unDealt.get(y);
		unDealt.set(x, yy);
		unDealt.set(y, xx);
	}
}
