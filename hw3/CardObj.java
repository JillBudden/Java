/* Instructions:

For the purposes of this exercise, please assume that ace is the highest rank, higher than every other card (except other aces).

*/

public class CardObj implements Card {
	private Rank r;
	private Suit s;
	
	public CardObj(Rank r, Suit s) {
		this.r = r;
		this.s = s;
	}

	public Rank getRank() {
		return this.r;
	}
	
	public Suit getSuit() {
		return this.s;
	}
	
	public boolean same(Card that) {
		return (this.r == that.getRank()) && (this.s == that.getSuit());
	}
	
	public boolean sameSuit(Card that) {
		return this.s == that.getSuit();
	}
	
	public boolean sameRank(Card that) {
		return this.r == that.getRank();
	}
	
	/* does this have a lower rank than that? */
	public boolean lowerRank(Card that) {
		int thisNum = 1; // need for this to work, declare the thisNum variable
		if (this.r == Rank.TWO) {thisNum = 2;}
		if (this.r == Rank.THREE) {thisNum = 3;}
		if (this.r == Rank.FOUR) {thisNum = 4;}
		if (this.r == Rank.FIVE) {thisNum = 5;}
		if (this.r == Rank.SIX) {thisNum = 6;}
		if (this.r == Rank.SEVEN) {thisNum = 7;}
		if (this.r == Rank.EIGHT) {thisNum = 8;}
		if (this.r == Rank.NINE) {thisNum = 9;}
		if (this.r == Rank.TEN) {thisNum = 10;}
		if (this.r == Rank.JACK) {thisNum = 11;}
		if (this.r == Rank.QUEEN) {thisNum = 12;}
		if (this.r == Rank.KING) {thisNum = 13;}
		if (this.r == Rank.ACE) {thisNum = 14;}
		
		int thatNum = 1;
		if (that.getRank() == Rank.TWO) {thatNum = 2;}
		if (that.getRank() == Rank.THREE) {thatNum = 3;}
		if (that.getRank() == Rank.FOUR) {thatNum = 4;}
		if (that.getRank() == Rank.FIVE) {thatNum = 5;}
		if (that.getRank() == Rank.SIX) {thatNum = 6;}
		if (that.getRank() == Rank.SEVEN) {thatNum = 7;}
		if (that.getRank() == Rank.EIGHT) {thatNum = 8;}
		if (that.getRank() == Rank.NINE) {thatNum = 9;}
		if (that.getRank() == Rank.TEN) {thatNum = 10;}
		if (that.getRank() == Rank.JACK) {thatNum = 11;}
		if (that.getRank() == Rank.QUEEN) {thatNum = 12;}
		if (that.getRank() == Rank.KING) {thatNum = 13;}
		if (that.getRank() == Rank.ACE) {thatNum = 14;}
		
		return thisNum < thatNum;
	}
	
	/* does this have a higher rank that that? */
	public boolean higherRank(Card that) {
		int thisNum = 1;
		if (this.r == Rank.TWO) {thisNum = 2;}
		if (this.r == Rank.THREE) {thisNum = 3;}
		if (this.r == Rank.FOUR) {thisNum = 4;}
		if (this.r == Rank.FIVE) {thisNum = 5;}
		if (this.r == Rank.SIX) {thisNum = 6;}
		if (this.r == Rank.SEVEN) {thisNum = 7;}
		if (this.r == Rank.EIGHT) {thisNum = 8;}
		if (this.r == Rank.NINE) {thisNum = 9;}
		if (this.r == Rank.TEN) {thisNum = 10;}
		if (this.r == Rank.JACK) {thisNum = 11;}
		if (this.r == Rank.QUEEN) {thisNum = 12;}
		if (this.r == Rank.KING) {thisNum = 13;}
		if (this.r == Rank.ACE) {thisNum = 14;}
		
		int thatNum = 1;
		if (that.getRank() == Rank.TWO) {thatNum = 2;}
		if (that.getRank() == Rank.THREE) {thatNum = 3;}
		if (that.getRank() == Rank.FOUR) {thatNum = 4;}
		if (that.getRank() == Rank.FIVE) {thatNum = 5;}
		if (that.getRank() == Rank.SIX) {thatNum = 6;}
		if (that.getRank() == Rank.SEVEN) {thatNum = 7;}
		if (that.getRank() == Rank.EIGHT) {thatNum = 8;}
		if (that.getRank() == Rank.NINE) {thatNum = 9;}
		if (that.getRank() == Rank.TEN) {thatNum = 10;}
		if (that.getRank() == Rank.JACK) {thatNum = 11;}
		if (that.getRank() == Rank.QUEEN) {thatNum = 12;}
		if (that.getRank() == Rank.KING) {thatNum = 13;}
		if (that.getRank() == Rank.ACE) {thatNum = 14;}

		return thisNum > thatNum;
	}
	
	/* Face cards are Jacks, Queens, and Kings */
	public boolean isFaceCard() {
		return (this.r == Rank.JACK) || (this.r == Rank.QUEEN) || (this.r == Rank.KING);
	}
	
	public CardColor getColor() {
		return (this.s == Suit.HEARTS || this.s == Suit.DIAMONDS) ? CardColor.RED : CardColor.BLACK;
	}
	
	public boolean sameColor(Card that) {
		return this.getColor() == that.getColor();
	}
	
	public String toString() {
		return this.r + " of " + this.s;
	}

}
	
	

