
public class Card {
	private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
	
	public int getRank() {
		return this.rank;
	}

	public int getSuit() {
		return this.suit;
	}
	
	public Card[] makeDeck() {
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		return cards;
	}
}

