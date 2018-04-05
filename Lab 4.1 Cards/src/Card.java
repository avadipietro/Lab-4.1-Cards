//Ava DiPietro 4/5/18
public class Card {
	
	private String rank;
	private String suit;
	private int value;
	
	public Card(String rank, String suit, int value) {
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	public String getRank() {
		return rank;
	}
	public String getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	public boolean equals(Card otherCard) {
		return false;
	}
	public String toString() {
		String v = "  - ";
		if (value >= 10) {
			v = " - ";
		}
		return "value " + value + v + rank + " of " + suit;
	}
}
