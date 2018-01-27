public interface Card {
  public Rank getRank();
  public Suit getSuit();
  public boolean same(Card that);
  public boolean sameSuit(Card that); 
  public boolean sameRank(Card that);
  public boolean lowerRank(Card that);  /* Does this have a lower rank than that? */
  public boolean higherRank(Card that); /* Does this have a higher rank than that? */
  public boolean isFaceCard(); /* Face cards are Jacks, Queens and Kings. */
  public CardColor getColor();
  public boolean sameColor(Card that);
  public String toString();
}
