/* NEGATE, ABS, SQUARE */

public class UnaryExp implements ArithExp {
	private UnaryOperator uop; //An enum
	private ArithExp e1;
	
	public UnaryExp(UnaryOperator uop, ArithExp e1) {
		if (uop == null || e1 == null)
			throw new IllegalArgumentException("uop and e1 must be non-null");
		this.uop = uop;
		this.e1 = e1;
	}
	
	public boolean isNum() {
		return false;
	}
	
	public boolean isUnary() {
		return true;
	}
	
	public boolean isBinary() {
		return false;
	}
	
	//left subtree
	//there is only one
	public ArithExp e1() {
		return this.e1; 
	}
	
	//there is no right subtree
	public ArithExp e2() {
		throw new IllegalStateException("unary");
	}

	private int abs(int a) {
		if (a < 0) 
			return -a; 
		else 
			return a;
	}

	//note: the evaluate() method turns e1 and e2 into ints; 
	//recursive
	public int evaluate() {
		if (this.uop.equals(UnaryOperator.NEGATE)) //using .equals on the same types
			return this.e1.evaluate() * (-1);   //.evaluate() returns an int     

		if (this.uop.equals(UnaryOperator.ABS))
			return abs(this.e1.evaluate());       //use abs helper function; or could use Math.abs()

		if (this.uop.equals(UnaryOperator.SQUARE)) 
			return this.e1.evaluate() * this.e1.evaluate();
		
		else
			return 0; //need a final return statement
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof ArithExp)) {
			return false;
		}
		return true; //need a final return statement
		//ArithExp a = (ArithExp) o; //downcast -- safe to call the ArithExp methods on o
	}

	public String toString() {
		return this.uop + " " + this.e1.toString();
	}
}

