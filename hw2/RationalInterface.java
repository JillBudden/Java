public interface RationalInterface {

    public int getNum();

    public int getDenom();

    public double numApprox();

    public RationalInterface recip();

    public RationalInterface negate();

    public RationalInterface plus(RationalInterface that);

    public RationalInterface minus(RationalInterface that);

    public RationalInterface times(RationalInterface that);

    public RationalInterface dividedBy(RationalInterface that);

    public boolean same(RationalInterface that);

    // lessThan: return true if this is less than that
    public boolean lessThan(RationalInterface that);

    // greaterThan: return true if this is greater than that
    public boolean greaterThan(RationalInterface that); 

    // max: return the larger of this and that
    public RationalInterface max(RationalInterface that);        

    // min: return the smaller of this and that
    public RationalInterface min(RationalInterface that);        

    public boolean isWhole();

    public String toString();
}