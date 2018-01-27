/* Self Notes: num is like true/false -- the leaves */

public class Num implements ArithExp {
  	private int n;

  	public Num(int n) {
  		if (n == 0)
  			throw new IllegalArgumentException("number can't be null");
  		this.n = n;
	}
	
	public boolean isNum() {
		return true;
	}
	
	public boolean isUnary() {
		return false;
	}
	
	public boolean isBinary() {
		return false;
	}
	
	//num is a leaf
	public ArithExp e1() {
		throw new IllegalStateException("Num");
	}
	
	//num is a leaf
	public ArithExp e2() {
		throw new IllegalStateException("Num");
	}
	
	//evaluates to an int
	// this.n is already type int
	public int evaluate() {
		return this.n; 
	}

	public boolean equals(Object o) {
		return (o!=null && o instanceof Num);
	}

	//return what num evaluates to
	public String toString() {
		return "" + this.n;
	}
}