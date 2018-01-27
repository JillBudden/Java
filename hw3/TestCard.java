public class TestCard {
	public static void main (String[] args) {				
		Card p1 = new CardObj(Rank.TWO, Suit.HEARTS);
		System.out.println(p1.toString());
		System.out.println("p1.getColor: " + p1.getColor());
		
		Card p2 = new CardObj(Rank.TEN, Suit.HEARTS);
		System.out.println(p2.toString());
		
		System.out.println("p2.getRank(): TEN " + p2.getRank());
		System.out.println("p2.getSuit(): HEARTS " + p2.getSuit());
		System.out.println("p2.same(Card that): " + p2.same(p1));
		System.out.println("p2.sameSuit(Rank.TWO, Suit.HEARTS): " + p2.sameSuit(p1));
		System.out.println("p2.sameRank(Rank.TWO, Suit.HEARTS): " + p2.sameRank(p1));
		System.out.println("p2.lowerRank(Rank.TWO, Suit.HEARTS): " + p2.lowerRank(p1));
		System.out.println("p2.higherRank(Rank.TWO, Suit.HEARTS): " + p2.higherRank(p1));
		System.out.println("p2.isFaceCard(): " + p2.isFaceCard());
		System.out.println("p2.getColor(): " + p2.getColor());
		System.out.println("p2.sameColor(Rank.TWO, Suit.HEARTS) " + p2.sameColor(p1));	
	}
}


